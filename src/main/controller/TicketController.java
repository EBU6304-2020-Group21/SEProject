package main.controller;

import main.entity.Order;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Yuxuan Wu
 *
 */
public class TicketController {

    public static void genTicket(Order order){
        FileWriter fileWriter;
        File file = new File("Files/Tickets/"+order.getDateTime()+".txt");
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try{
            if(!file.exists()){
                file.createNewFile();
            }
            fileWriter = new FileWriter(file);
            fileWriter.write("============TICKET BEGIN==========\n");
            fileWriter.write("Order Number: "+order.getDateTime()+"\n");
            fileWriter.write("Membership Number: "+order.getMemberNum()+"\n");
            fileWriter.write("Date & Time: "+ df.format(new Date())+"\n");
            fileWriter.write("Dining Way: "+order.getDiningOption()+"\n");
            fileWriter.write("----Single Dish----\n");
            fileWriter.write("Soup: "+order.getSoupType()+"\n");
            fileWriter.write("Noodles: "+order.getNoodleType()+"\n");
            fileWriter.write("Spring Onion: "+ order.getSprOnionType()+"\n");
            fileWriter.write("Nori: "+ order.getNori()+"\n");
            fileWriter.write("Chashu: "+ order.getNori()+ "\n");
            fileWriter.write("Boiled Egg: "+ order.getBoiledEgg()+"\n");
            fileWriter.write("Spiciness: "+ order.getSpicyIndex()+"\n");
            fileWriter.write("SINGLE DISH PRICE: "+ order.getFixedPrice()+"\n");
            fileWriter.write("------Add-ons------\n");
            fileWriter.write("Extra Nori   Amount: "+order.getExtraNoriNum() +"\n");
            fileWriter.write("Extra Boiled Egg   Amount: "+order.getExtraBoilEggNum() +"\n");
            fileWriter.write("Bamboo Shoots   Amount: "+order.getExtraBamshootNum() +"\n");
            fileWriter.write("Extra Chashu   Amount: "+order.getExtraChashuNum() +"\n");
            order.setAddOnPrice((order.getExtraNoriNum()+order.getExtraBoilEggNum()+order.getExtraBamshootNum()+order.getExtraChashuNum()*2));
            fileWriter.write("ADD-ONS PRICE: "+ order.getAddOnPrice()+"\n");
            fileWriter.write("-------------------\n");
            fileWriter.write("TOTAL PRICE: "+ order.getTotalPrice()+"\n");
            fileWriter.write("=============TICKET END===========\n");

            fileWriter.flush();
            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
