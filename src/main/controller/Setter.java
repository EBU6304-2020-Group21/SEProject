package main.controller;

import java.text.DecimalFormat;

import static main.views.GUIModel.currentOrder;

/**
 * @author Jianning Qu
 */
//TODO 颜恺在使用新的数据传输方法后，可以将此类代替，随后可以删除
public class Setter {
    //Obtain getter and setter in Order
    //write to the Order object
    static Reader reader = new Reader();

    public static void set(){
        //set necessary type
        currentOrder.setSoupType(reader.getSoupType());
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
        currentOrder.setDateTime(UtilsController.genDateTime());

        DecimalFormat df = new DecimalFormat("#.00");
        double ttPrice = (currentOrder.getExtraNoriNum()+currentOrder.getExtraBoilEggNum()+currentOrder.getExtraBamshootNum()+currentOrder.getExtraChashuNum()*2+9.99);
        String s = String.valueOf(df.format(ttPrice));
        currentOrder.setTotalPrice(s);

    }
}
