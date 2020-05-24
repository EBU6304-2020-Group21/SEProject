package main.controller;

import main.entity.Customer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * This class is for the comprehensive utils for the controller
 * @ClassName UtilsController
 * @author Yuxuan Wu
 * @version 3.0
 * @date 2020/04/09
 */
public class UtilsController {
    /**
     * Generate the Member Number
     * The last 8 bits of UNIX stamps
     * @return String
     * @author Yuxuan Wu
     * @date 2020/04/01
     */
    public static String genMembershipNums(){
        String time = Long.toString(System.currentTimeMillis());
        return time.substring(3, 11);
    }

    /**
     * Generate the Date String
     * @return date string
     * @author Yuxuan Wu
     * @date 2020/04/01
     */
    public static String genDateTime(){
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        String dateNowStr = sdf.format(d);
        return dateNowStr;
    }

    /**
     * Make the string convert to date
     * @param str
     * @return Date
     * @author Yuxuan Wu
     * @date 2020/04/04
     */
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
