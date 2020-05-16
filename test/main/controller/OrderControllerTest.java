package main.controller;

import main.entity.Order;
import org.junit.jupiter.api.Test;

import java.util.List;

import static main.controller.OrderController.json2List;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Yinan Zhang
 */

class OrderControllerTest {

    @Test
    void genOrderTotalinfos() {
        Order order = new Order();
        OrderController zyn= new OrderController();
        order.setSoupType("zz");
        order.setDiningOption("take out");
        order.setBoiledEgg("yes");
        order.setChashu("no");
        order.setExtraBamshootNum(2);
        order.setNori("yes");
        order.setNoodleType("soft");
        order.setSprOnionType("no");
        order.setSpicyIndex(3);
        order.setExtraBoilEggNum(2);
        order.setExtraChashuNum(1);
        order.setExtraNoriNum(0);
        zyn.genOrderTotalInfos(order);
        List<Order> orderList=json2List(zyn.readOrderTotalInfos());
        Order order2 = orderList.get(0);
        assertEquals("Tonkotsu",order2.getSoupType());
    }

}