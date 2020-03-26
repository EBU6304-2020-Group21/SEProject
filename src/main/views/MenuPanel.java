package main.views;

import javax.swing.*;
import java.awt.*;

public class MenuPanel extends JPanel {
    private double fixedPrice = 9.99;      //the price of fixed dishes, default 9.99 pounds
    private double extraNoriPrice = 1;     //the price of extra Nori, default 1 pounds
    private double extraBoilEggPrice = 1;  //the price of extra boiled eggs, default 1 pounds
    private double extraBamShootPrice = 1; //the price of extra banboo shoot, default 1 pounds
    private double extraChashuPrice = 2;   //the price of extra Chashu, default 2 pounds
    private String soupType;
    private String noodleType;
    private String sprOnionType;
    private Boolean nori;
    private Boolean chashu;
    private Boolean boiledEgg;
    private int spicyIndex;
    private int extraNoriNum;
    private int extraBoilEggNum;
    private int extraBamshootNum;
    private int extraChashuNum;

    public MenuPanel() {
        init();
    }

    public void init() {
        //code wait to update
    }
}
