package main.controller;

import static main.views.GUIModel.currentOrder;

/**
 * @author Jianning Qu
 */

public class Setter {
    //Obtain getter and setter in Order
    //write to the Order object
    static Reader reader = new Reader();

    public static void set(){
        //set necessary type
        currentOrder.setSoupType(reader.getSoupType());
        System.out.println(reader.getSoupType());
        System.out.println(currentOrder.getSoupType());
        currentOrder.setNoodleType(reader.getNoodleType());
        currentOrder.setSprOnionType(reader.getSprOnionType());
        currentOrder.setNori(reader.getNori());
        currentOrder.setChashu(reader.getChasu());
        currentOrder.setBoiledEgg(reader.getBoiledEgg());
        currentOrder.setSpicyIndex(reader.getSpicyIndex());
        currentOrder.setExtraNoriNum(reader.getExtraNoriNum());
        currentOrder.setExtraBoilEggNum(reader.getExtraBoilEggNum());
        currentOrder.setExtraBamshootNum(reader.getExtraBamshootNum());
        currentOrder.setExtraChashuNum(reader.getExtraChashuNum());

        double ttPrice = (currentOrder.getExtraNoriNum()+currentOrder.getExtraBoilEggNum()+currentOrder.getExtraBamshootNum()+currentOrder.getExtraChashuNum()+9.99);
        String s = String.valueOf(ttPrice);
        currentOrder.setTotalPrice(s);

    }
}
