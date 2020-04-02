package main.controller;

import main.views.MenuPanel;
import main.views.PayPanel;

/**
 * @author Jianning Qu
 */

public class Reader {
    //Obtain the choice in each ButtonGroup in MenuPanel
    //soupType
    public String getSoupType(){
        if(MenuPanel.tonkotsu.isSelected() == true){
            return "Tonkotsu";
        }else if(MenuPanel.shoyu.isSelected() == true){
            return "Shoyu";
        }else{
            return "Shio";
        }
    }

    //noodleType
    public String getNoodleType(){
        if(MenuPanel.soft.isSelected() == true){
            return "Soft";
        }else if(MenuPanel.medium.isSelected() == true){
            return "Medium";
        }else{
            return "Firm";
        }
    }

    //sprOnionType
    public String getSprOnionType(){
        if(MenuPanel.no.isSelected() == true){
            return "No please";
        }else if(MenuPanel.just.isSelected() == true){
            return "Just a little";
        }else{
            return "A lot!";
        }
    }

    //nori
    public String getNori(){
        if(MenuPanel.yes1.isSelected() == true){
            return "Yes";
        }else{
            return "No";
        }
    }

    //chasu
    public String getChasu(){
        if(MenuPanel.yes2.isSelected() == true){
            return "Yes";
        }else{
            return "No";
        }
    }

    //boiledEgg
    public String getBoiledEgg(){
        if(MenuPanel.yes3.isSelected() == true){
            return "Yes";
        }else{
            return "No";
        }
    }

    //spicyIndex
    public int getSpicyIndex(){
        if(MenuPanel.s1.isSelected() == true){
            return 0;
        }else if(MenuPanel.s2.isSelected() == true){
            return 1;
        }else if(MenuPanel.s3.isSelected() == true){
            return 2;
        }else if(MenuPanel.s4.isSelected() == true){
            return 3;
        }else if(MenuPanel.s5.isSelected() == true){
            return 4;
        }else{
            return 5;
        }
    }

    //extraNoriNum
    public int getExtraNoriNum(){
        return Integer.parseInt(MenuPanel.extraNori.getText());
    }

    //extraBoilEggNum
    public int getExtraBoilEggNum(){
        return Integer.parseInt(MenuPanel.extraBoilEgg.getText());
    }

    //extraBamshootNum
    public int getExtraBamshootNum(){
        return Integer.parseInt(MenuPanel.extraBamShoot.getText());
    }

    //extraChashuNum
    public int getExtraChashuNum(){
        return Integer.parseInt(MenuPanel.extraChashu.getText());
    }


    //dinningWay
    public String getDiningOption(){
        if(PayPanel.but1.isSelected() == true){
            return "Cash";
        }else{
            return "Cards";
        }
    }
}
