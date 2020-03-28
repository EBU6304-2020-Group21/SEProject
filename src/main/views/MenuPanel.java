package main.views;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class MenuPanel extends JPanel {
    //variables
    private double fixedPrice;      //the price of fixed dishes, default 9.99 pounds
    private double extraNoriPrice;     //the price of extra Nori, default 1 pounds
    private double extraBoilEggPrice;  //the price of extra boiled eggs, default 1 pounds
    private double extraBamShootPrice; //the price of extra banboo shoot, default 1 pounds
    private double extraChashuPrice;   //the price of extra Chashu, default 2 pounds
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

    public JButton back = new JButton("Back");
    public JButton confirm = new JButton("Confirm");

    public JRadioButton tonkotsu, shoyu, shio, soft, medium, firm, no, just, lot, yes1, no1, yes2, no2, yes3, no3, s1, s2, s3, s4, s5, s6;
    public JRadioButton enori, eegg, eshoot, echashu;

    public MenuPanel() {
        init();
    }

    public void init() {
        //初始化传递参数，用于测试
        fixedPrice = 9.99;
        //Initialize the RadioButton
        tonkotsu = new JRadioButton("Tonkotsu");
        shoyu = new JRadioButton("Shoyu");
        shio = new JRadioButton("shio");
        ButtonGroup btnGroup1 = new ButtonGroup();
        btnGroup1.add(tonkotsu);
        btnGroup1.add(shoyu);
        btnGroup1.add(shio);

        soft = new JRadioButton("Soft");
        medium = new JRadioButton("Medium");
        firm = new JRadioButton("Firm");
        ButtonGroup btnGroup2 = new ButtonGroup();
        btnGroup2.add(soft);
        btnGroup2.add(medium);
        btnGroup2.add(firm);

        no = new JRadioButton("No please");
        just = new JRadioButton("Just a little");
        lot = new JRadioButton("A lot!");
        ButtonGroup btnGroup3 = new ButtonGroup();
        btnGroup3.add(tonkotsu);
        btnGroup3.add(shoyu);
        btnGroup3.add(shio);

        yes1 = new JRadioButton("Yes");
        no1 = new JRadioButton("No");
        ButtonGroup btnGroup4 = new ButtonGroup();
        btnGroup4.add(yes1);
        btnGroup4.add(no1);

        yes2 = new JRadioButton("Yes");
        no2 = new JRadioButton("No");
        ButtonGroup btnGroup5 = new ButtonGroup();
        btnGroup5.add(yes2);
        btnGroup5.add(no2);

        yes3 = new JRadioButton("Yes");
        no3 = new JRadioButton("No");
        ButtonGroup btnGroup6 = new ButtonGroup();
        btnGroup6.add(yes3);
        btnGroup6.add(no3);

        s1 = new JRadioButton("0(No)");
        s2 = new JRadioButton("1");
        s3 = new JRadioButton("2");
        s4 = new JRadioButton("3");
        s5 = new JRadioButton("4");
        s6 = new JRadioButton("5(Max)");
        ButtonGroup btnGroup7 = new ButtonGroup();
        btnGroup7.add(s1);
        btnGroup7.add(s2);
        btnGroup7.add(s3);
        btnGroup7.add(s4);
        btnGroup7.add(s5);
        btnGroup7.add(s6);


        //Initialize the sub-panel of this panel
        topPanel = new JPanel();
        midPanel = new JPanel();
        botPanel = new JPanel();
        //Set the topPanel
        GridBagConstraints c1 = new GridBagConstraints();
        topPanel.setLayout(new GridBagLayout());
        topPanel.setBorder(new TitledBorder(null, "top ", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, Color.BLACK));
        JCheckBox ramen = new JCheckBox("Ramen ￡" + fixedPrice, true);
        Font ramenFont = new Font("Times New Roman", Font.BOLD + Font.ITALIC, 20);
        ramen.setFont(ramenFont);
        ramen.setEnabled(false);
        JLabel title = new JLabel("<html><body>Totoro Ramen<br>Designed by Mr.Miyazaki<body></html>");
        Font titleFont = new Font("Times New Roman", Font.BOLD + Font.ITALIC, 25);
        title.setFont(titleFont);
        c1.anchor = GridBagConstraints.WEST;
        c1.gridx = 0;
        c1.gridy = 0;
        c1.gridwidth = 1;
        c1.gridheight = 1;
        c1.weightx = 0.3;
        c1.weighty = 1;
        topPanel.add(ramen, c1);
        c1.gridx = 1;
        c1.weightx = 0.7;
        topPanel.add(title, c1);


        //set the midPanel
        midPanel.setBorder(new TitledBorder(null, "mid ", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, Color.BLACK));
        midPanel.setLayout(new GridBagLayout());
        GridBagConstraints c2 = new GridBagConstraints();
        JPanel defaultP = new JPanel();
        JPanel addonP = new JPanel();
        defaultP.setBorder(BorderFactory.createLoweredBevelBorder());
        addonP.setBorder(BorderFactory.createLoweredBevelBorder());
        //Set the midPanel layout
        c2.fill = GridBagConstraints.BOTH;
        c2.gridx = 0;
        c2.gridy = 0;
        c2.weightx = 0.65;
        c2.weighty = 1;
        midPanel.add(defaultP, c2);
        c2.weightx = 0.35;
        c2.gridx = 1;
        midPanel.add(addonP, c2);


        JPanel soupP = new JPanel();
        JPanel noodleP = new JPanel();
        JPanel soP = new JPanel();
        JPanel noriP = new JPanel();
        JPanel chashuP = new JPanel();
        JPanel eggP = new JPanel();
        JPanel spiP = new JPanel();
        JPanel addP = new JPanel();
        JPanel exnoriP = new JPanel();
        JPanel exeggP = new JPanel();
        JPanel exbambooP = new JPanel();
        JPanel exchaP = new JPanel();
        JLabel soup = new JLabel("Soup");
        JLabel noodles = new JLabel("Noodles");
        JLabel SO = new JLabel("<html><body>Spring<br>onion<body></html>");
        JLabel nori = new JLabel("nori");
        JLabel chashu = new JLabel("Chashu");
        JLabel egg = new JLabel("<html><body>Boiled<br>egg<body></html>");
        JLabel spi = new JLabel("Spiciness");

        //Set the defaultP layout
        defaultP.setLayout(new GridBagLayout());
        GridBagConstraints c3 = new GridBagConstraints();
        c3.fill = GridBagConstraints.BOTH;
        c3.gridx = 0;
        c3.gridy = 0;
        c3.weightx = 1;
        c3.weighty = 0.15;
        soupP.add(soup);
        soupP.add(tonkotsu);
        soupP.add(shoyu);
        soupP.add(shio);
        defaultP.add(soupP,c3);

        noodleP.add(noodles);
        noodleP.add(soft);
        noodleP.add(medium);
        noodleP.add(firm);
        c3.gridx = 0;
        c3.gridy = 1;
        c3.weightx = 1;
        c3.weighty = 0.15;
        defaultP.add(noodleP,c3);

        soP.add(SO);
        soP.add(no);
        soP.add(just);
        soP.add(lot);
        c3.gridy = 2;
        c3.weighty = 0.15;
        defaultP.add(soP,c3);

        noriP.add(yes1);
        noriP.add(no1);
        c3.gridy = 3;
        c3.weighty = 0.15;
        defaultP.add(noriP,c3);

        chashuP.add(yes2);
        chashuP.add(no2);
        c3.gridy = 4;
        c3.weighty = 0.15;
        defaultP.add(chashuP,c3);

        eggP.add(yes3);
        eggP.add(no3);
        c3.gridy = 5;
        c3.weighty = 0.15;
        defaultP.add(eggP,c3);

        spiP.add(s1);
        spiP.add(s2);
        spiP.add(s3);
        spiP.add(s4);
        spiP.add(s5);
        spiP.add(s6);
        c3.gridy = 6;
        c3.weighty = 0.1;



        //set the bottom Panel
        botPanel.setBorder(new TitledBorder(null, "bottom ", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, Color.BLACK));
        botPanel.setLayout(new BorderLayout());
        back.setPreferredSize(new Dimension(150, 0));
        confirm.setPreferredSize(new Dimension(150, 0));
        botPanel.add(back, BorderLayout.WEST);
        botPanel.add(confirm, BorderLayout.EAST);

        //Set the layout and initialize this panel
        this.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.weightx = 1;
        c.weighty = 0.03;
        this.add(topPanel, c);
        c.gridy = 1;
        c.weighty = 0.87;
        this.add(midPanel, c);
        c.gridy = 2;
        c.weighty = 0.1;
        this.add(botPanel, c);

    }
}
