package main.views;

import javax.swing.*;
import javax.swing.border.TitledBorder;
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
    private JPanel topPanel;
    private JPanel midPanel;
    private JPanel botPanel;

    public MenuPanel() {
        init();
    }

    public void init() {
        //Initialize the sub-panel of this panel
        topPanel = new JPanel();
        midPanel = new JPanel();
        botPanel = new JPanel();
        //Set the topPanel
        topPanel.setBorder(new TitledBorder(null, "top ", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, Color.BLACK));
        /**
         * code here is the design of topPanel
         */
        //set the midPanel
        midPanel.setBorder(new TitledBorder(null, "mid ", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, Color.BLACK));
        /**
         * code here is the design of midpanel
         */
        //set the bottom Panel
        botPanel.setBorder(new TitledBorder(null, "bottom ", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, Color.BLACK));
        /**
         * code here is the design of bottompanel
         */
        //Set the layout and initialize this panel
        //Set layout of this panel
        this.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.weightx = 1;
        c.weighty = 0.15;
        this.add(topPanel,c);
        c.gridy = 1;
        c.weighty = 0.85;
        this.add(midPanel,c);
        c.gridy = 2;
        c.weighty = 0.1;
        this.add(botPanel,c);

    }
}
