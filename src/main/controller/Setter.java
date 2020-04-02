package main.controller;

import main.entity.Order;

/**
 * @author Jianning Qu
 */

public class Setter {
    //Obtain getter and setter in Order
    Order order = new Order();
    //write to the Order object
    Reader reader = new Reader();

    public void set(){
        //set necessary type
        order.setSoupType(reader.getSoupType());
        order.setNoodleType(reader.getNoodleType());
        order.setSprOnionType(reader.getSprOnionType());
        order.setNori(reader.getNori());
        order.setChashu(reader.getChasu());
        order.setBoiledEgg(reader.getBoiledEgg());
        order.setSpicyIndex(reader.getSpicyIndex());
        order.setExtraNoriNum(reader.getExtraNoriNum());
        order.setExtraBoilEggNum(reader.getExtraBoilEggNum());
        order.setExtraBamshootNum(reader.getExtraBamshootNum());
        order.setExtraChashuNum(reader.getExtraChashuNum());

        double ttPrice = (order.getExtraNoriNum()+order.getExtraBoilEggNum()+order.getExtraBamshootNum()+order.getExtraChashuNum()+9.99);
        String s = String.valueOf(ttPrice);
        order.setTotalPrice(s);
    }

    public String get(){
        return order.getTotalPrice();
    }
}
