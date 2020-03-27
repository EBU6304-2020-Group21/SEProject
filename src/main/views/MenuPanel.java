package main.views;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class MenuPanel extends JPanel {
    //variables
    private double fixedPrice ;      //the price of fixed dishes, default 9.99 pounds
    private double extraNoriPrice ;     //the price of extra Nori, default 1 pounds
    private double extraBoilEggPrice ;  //the price of extra boiled eggs, default 1 pounds
    private double extraBamShootPrice ; //the price of extra banboo shoot, default 1 pounds
    private double extraChashuPrice ;   //the price of extra Chashu, default 2 pounds
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

    //MenuPanel
    private JPanel topPanel;
    private JPanel midPanel;
    private JPanel botPanel;
    private JCheckBox ramen;

    public MenuPanel() {
        init();
    }

    public void init() {
        //初始化传递参数，用于测试
        fixedPrice = 9.99;
        //Initialize the sub-panel of this panel
        topPanel = new JPanel();
        midPanel = new JPanel();
        botPanel = new JPanel();
        //Set the topPanel
        GridBagConstraints c1 = new GridBagConstraints();
        topPanel.setLayout(new GridBagLayout());
        topPanel.setBorder(new TitledBorder(null, "top ", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, Color.BLACK));
        JCheckBox ramen = new JCheckBox("Ramen ￡"+fixedPrice,true);
        Font ramenFont = new Font("Times New Roman",Font.BOLD+ Font.ITALIC,20);
        ramen.setFont(ramenFont);
        ramen.setEnabled(false);
        JLabel title = new JLabel("<html><body>Totoro Ramen<br>Designed by Mr.Miyazaki<body></html>");
        Font titleFont = new Font("Times New Roman",Font.BOLD+ Font.ITALIC,25);
        title.setFont(titleFont);
        c1.anchor = GridBagConstraints.WEST;
        c1.gridx = 0;
        c1.gridy = 0;
        c1.gridwidth = 1;
        c1.gridheight = 1;
        c1.weightx = 0.3;
        c1.weighty = 1;
        topPanel.add(ramen,c1);
        c1.gridx = 1;
        c1.weightx = 0.7;
        topPanel.add(title,c1);


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
        c.weighty = 0.03;
        this.add(topPanel,c);
        c.gridy = 1;
        c.weighty = 0.87;
        this.add(midPanel,c);
        c.gridy = 2;
        c.weighty = 0.1;
        this.add(botPanel,c);

    }
}
