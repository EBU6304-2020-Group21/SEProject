package main.controller;

import main.entity.Customer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UtilsController {
    public static String genMembershipNums(){
        String time = Long.toString(System.currentTimeMillis());
        return time.substring(3, 11);
    }

    public static String genDateTime(){
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        String dateNowStr = sdf.format(d);
        return dateNowStr;
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
        Customer customer = new Customer();
        customer.setMembershipNum(UtilsController.genMembershipNums());
    }
}
