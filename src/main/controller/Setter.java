package main.controller;

import main.entity.Order;

/**
 * @author Jianning Qu
 */

public class Setter {
    public static void main(String[] args){
        //Obtain getter and setter in Order
        Order order = new Order();

        //write to the Order object
        Reader reader = new Reader();

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

        order.setTotalPrice(String.valueOf(order.getExtraNoriNum()*1+order.getExtraBoilEggNum()*1+order.getExtraBamshootNum()*1+order.getExtraChashuNum()*2+9.99));
    }
}
