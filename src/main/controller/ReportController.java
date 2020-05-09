package main.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import main.entity.Order;
import main.entity.Report;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * <h3>SEProject</h3>
 * <p>To generate the sales report last week of the restaurant</p>
 *
 * @author : Yuxuan Wu
 * @date : 2020-05-09 21:18
 **/
public class ReportController {
    public static Date getLastMonday(){
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_MONTH, -(Calendar.DAY_OF_WEEK+5));
        return calendar.getTime();
    }

    public static Date getLastSunday(){
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_MONTH, -(Calendar.DAY_OF_WEEK-1));
        return calendar.getTime();
    }

    public static List<Order> getLastWeekOrders(){
        //Read the Order Infos from the file
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
        if(readString == null){
            return null;
        }else{
            JSONArray totalOrder = JSONArray.parseArray(readString);
            List<Order> totalOrderList = JSONObject.parseArray(totalOrder.toJSONString(), Order.class);
            List<Order> weekOrderList = new ArrayList<Order>();

            for(Order o : totalOrderList){
                //Test whether the Date is between the last Monday and last Friday
                if(str2Date(o.getDateTime()).after(getLastMonday()) &&
                        str2Date(o.getDateTime()).before(getLastSunday())){
                    weekOrderList.add(o);
                }
            }
            return weekOrderList;
        }
    }

    //TODO 颜恺前端调用这个方法返回的report，在界面显示相关信息
    public static Report generateWeeklyReport(){
        Report weeklyReport = new Report();
        for(Order o : getLastWeekOrders()){

            if(o.getSoupType().equals("Tonkotsu")){
                weeklyReport.setTonkotsuNum(weeklyReport.getTonkotsuNum()+1);
            }else if(o.getSoupType().equals("Shoyu")){
                weeklyReport.setShoyuNum(weeklyReport.getShoyuNum()+1);
            }else if(o.getSoupType().equals("Shio")){
                weeklyReport.setShioNum(weeklyReport.getShioNum()+1);
            }

            if(o.getNoodleType().equals("Soft")){
                weeklyReport.setSoftNum(weeklyReport.getSoftNum()+1);
            }else if(o.getNoodleType().equals("Medium")){
                weeklyReport.setMediumNum(weeklyReport.getMediumNum()+1);
            }else if(o.getNoodleType().equals("Firm")){
                weeklyReport.setFirmNum(weeklyReport.getFirmNum()+1);
            }

            if(o.getSprOnionType().equals("No please")){
                weeklyReport.setNoNum(weeklyReport.getNoNum()+1);
            }else if(o.getSprOnionType().equals("Just a little")){
                weeklyReport.setJustNum(weeklyReport.getJustNum());
            }else if(o.getSprOnionType().equals("A lot!")){
                weeklyReport.setLotNum(weeklyReport.getLotNum()+1);
            }

            if(o.getNori().equals("Yes")){
                weeklyReport.setNoriyesNum(weeklyReport.getNoriyesNum()+1);
            }else if(o.getNori().equals("No")){
                weeklyReport.setNorinoNum(weeklyReport.getNorinoNum()+1);
            }

            if(o.getBoiledEgg().equals("Yes")){
                weeklyReport.setEggyesNum(weeklyReport.getEggyesNum()+1);
            }else if(o.getBoiledEgg().equals("No")){
                weeklyReport.setEggnoNum(weeklyReport.getEggnoNum()+1);
            }

            if(o.getChashu().equals("Yes")){
                weeklyReport.setChashuyesNum(weeklyReport.getChashuyesNum()+1);
            }else if(o.getChashu().equals("No")){
                weeklyReport.setChashunoNum(weeklyReport.getChashunoNum()+1);
            }

            if(o.getSpicyIndex() == 0){
                weeklyReport.setSpi0(weeklyReport.getSpi0()+1);
            }else if(o.getSpicyIndex() == 1){
                weeklyReport.setSpi1(weeklyReport.getSpi1()+1);
            }else if(o.getSpicyIndex() == 2){
                weeklyReport.setSpi2(weeklyReport.getSpi2()+1);
            }else if(o.getSpicyIndex() == 3){
                weeklyReport.setSpi3(weeklyReport.getSpi3()+1);
            }else if(o.getSpicyIndex() == 4){
                weeklyReport.setSpi4(weeklyReport.getSpi4()+1);
            }else if(o.getSpicyIndex() == 5){
                weeklyReport.setSpi5(weeklyReport.getSpi5()+1);
            }

            weeklyReport.setExtraNoriNum(weeklyReport.getExtraNoriNum()+o.getExtraNoriNum());
            weeklyReport.setExtraChashuNum(weeklyReport.getExtraChashuNum()+o.getExtraChashuNum());
            weeklyReport.setExtraBambooNum(weeklyReport.getExtraBambooNum()+o.getExtraBamshootNum());
            weeklyReport.setExtraEggNum(weeklyReport.getExtraEggNum()+o.getExtraBoilEggNum());
        }

        return weeklyReport;
    }

    public static Date str2Date(String str){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        Date date = null;
        try {
            date = sdf.parse(str);
        } catch (ParseException e) {
        }
        return date;
    }

    public static void main(String[] args) {
        System.out.println(getLastMonday());
        System.out.println(getLastSunday());
        System.out.println(getLastWeekOrders());
        System.out.println(generateWeeklyReport());
    }
}
