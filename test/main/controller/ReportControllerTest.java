package main.controller;

import main.entity.Order;
import main.entity.Report;
import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @Author: Yinan Zhang
 * @Date: 2020/5/14 23:00
 */
class ReportControllerTest {
    ReportController n= new ReportController();

    @Test
    void getLastMonday() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmm");
        String dateNowStr = sdf.format(n.getLastMonday());
        assertEquals("202005012324",dateNowStr);
    }

    @Test
    void getLastSunday() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmm");
        String dateNowStr = sdf.format(n.getLastSunday());
        assertEquals("202005072325",dateNowStr);
    }

    @Test
    void getLastWeekOrders() {
        List<Order> weekOrderList = n.getLastWeekOrders();
        Order s=weekOrderList.get(0);
        assertEquals("20200506231906",s.getDateTime());
    }

    @Test
    void generateWeeklyReport() {
        Report k=n.generateWeeklyReport();
        assertEquals(1,k.getExtraBambooNum());
    }

}