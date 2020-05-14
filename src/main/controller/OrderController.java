package main.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import main.entity.Order;
import main.views.MenuPanel;

import java.io.*;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import static main.views.GUIModel.currentOrder;

public class OrderController {
    
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


    public static Order orderFromView(MenuPanel menuPanel){
        Order newOrder = new Order();
        if(menuPanel.tonkotsu.isSelected()){
            newOrder.setSoupType("Tonkotsu");
        }else if(menuPanel.shoyu.isSelected()){
            newOrder.setSoupType("Shoyu");
        }else{
            newOrder.setSoupType("Shio");
        }

        if(menuPanel.soft.isSelected()){
            newOrder.setNoodleType("Soft");
        }else if(menuPanel.medium.isSelected()){
            newOrder.setNoodleType("Medium");
        }else{
            newOrder.setNoodleType("Firm");
        }

        if(menuPanel.no.isSelected()){
            newOrder.setSprOnionType("No please");
        }else if(menuPanel.just.isSelected()){
            newOrder.setSprOnionType("Just a little");
        }else{
            newOrder.setSprOnionType("A lot!");
        }

        if(menuPanel.yes1.isSelected()){
            newOrder.setNori("Yes");
        }else{
            newOrder.setNori("No");
        }

        if(menuPanel.yes2.isSelected()){
            newOrder.setChashu("Yes");
        }else{
            newOrder.setChashu("No");
        }

        if(menuPanel.yes3.isSelected()){
            newOrder.setBoiledEgg("Yes");
        }else{
            newOrder.setBoiledEgg("No");
        }

        if(menuPanel.s1.isSelected()){
            newOrder.setSpicyIndex(0);
        }else if(menuPanel.s2.isSelected()){
            newOrder.setSpicyIndex(1);
        }else if(menuPanel.s3.isSelected()){
            newOrder.setSpicyIndex(2);
        }else if(menuPanel.s4.isSelected()){
            newOrder.setSpicyIndex(3);
        }else if(menuPanel.s5.isSelected()){
            newOrder.setSpicyIndex(4);
        }else{
            newOrder.setSpicyIndex(5);
        }

        newOrder.setExtraNoriNum(Integer.parseInt(menuPanel.extraNori.getText()));
        newOrder.setExtraBoilEggNum(Integer.parseInt(menuPanel.extraBoilEgg.getText()));
        newOrder.setExtraChashuNum(Integer.parseInt(menuPanel.extraChashu.getText()));
        newOrder.setExtraBamshootNum(Integer.parseInt(menuPanel.extraBamShoot.getText()));

        DecimalFormat df = new DecimalFormat("#.00");
        double ttPrice = (newOrder.getExtraNoriNum()*menuPanel.getExtraNoriPrice()
                +newOrder.getExtraBoilEggNum()*menuPanel.getExtraBoilEggPrice()
                +newOrder.getExtraBamshootNum()*menuPanel.getExtraBamShootPrice()
                +newOrder.getExtraChashuNum()*menuPanel.getExtraChashuPrice()
                +menuPanel.getFixedPrice());
        double addPrice = (newOrder.getExtraNoriNum()*menuPanel.getExtraNoriPrice()
                +newOrder.getExtraBoilEggNum()*menuPanel.getExtraBoilEggPrice()
                +newOrder.getExtraBamshootNum()*menuPanel.getExtraBamShootPrice()
                +newOrder.getExtraChashuNum()*menuPanel.getExtraChashuPrice()
                );
        String tt = String.valueOf(df.format(ttPrice));
        newOrder.setTotalPrice(tt);
        newOrder.setAddOnPrice(addPrice);
        newOrder.setFixedPrice(menuPanel.getFixedPrice());
        newOrder.setDateTime(UtilsController.genDateTime());
        return newOrder;
    }

    public static void addOrder2Files(Order order){
        genOrderTotalInfos(order);
        TicketController.genTicket(order);
    }
    
}
