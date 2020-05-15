package main.controller;

import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author: Yinan Zhang
 * @Date: 2020/5/15 12:02
 */
class UtilsControllerTest {
    UtilsController s=new UtilsController();

    @Test
    void genMembershipNums() {
        Date n= new Date();
        String time = Long.toString(n.getTime());
        assertEquals(time.substring(3, 11),s.genMembershipNums());
    }

    @Test
    void genDateTime() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        String dateNowStr = sdf.format(System.currentTimeMillis());
        assertEquals(dateNowStr,s.genDateTime());
    }

    @Test
    void str2Date() {
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        String dateNowStr = sdf.format(d);
        System.out.println(d);
        System.out.println(s.str2Date(dateNowStr));
    }

    @Test
    void main() {
    }
}