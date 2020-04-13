package main.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import main.entity.Order;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class OrderInfoController {
    
    public static void genOrderTotalInfos(Order order){
        FileWriter fileWriter;
        File file = new File("Files/Order/GeneralOrderInfo.json");
        List<Order> orderList;
        if(readOrderTotalInfos()!=""){
            orderList = json2List(readOrderTotalInfos());
        }else{
            orderList = new ArrayList<Order>();
        }
        orderList.add(order);
        String fileStr = list2Json(orderList);
        try{
            if(!file.exists()){
                file.createNewFile();
            }
            fileWriter = new FileWriter(file);
            fileWriter.write(fileStr);
            fileWriter.flush();
            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static String readOrderTotalInfos(){
        FileReader fileReader;
        File file = new File("Files/Order/GeneralOrderInfo.json");
        BufferedReader reader = null;
        String readString = "";
        try{
            if(!file.exists()){
                System.out.println("The file doesn't exists!");
                file.createNewFile();
            }
            reader = new BufferedReader(new FileReader(file));
            String tempString = null;
            while ((tempString = reader.readLine())!=null){
                readString += tempString;
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(reader != null){
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return readString;
    }

    public static List<Order> json2List(String str){
        JSONArray orderArray = JSONArray.parseArray(str);
        List<Order> orderList = JSONObject.parseArray(orderArray.toJSONString(), Order.class);
        return orderList;
    }

    public static String list2Json(List<Order> orderList){
        JSONArray orderArray = JSONArray.parseArray(JSON.toJSONString(orderList));
        return orderArray.toString();
    }
    
}
