package main.views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuPanel extends JPanel {

    //variables
    static double fixedPrice;      //the price of fixed dishes, default 9.99 pounds
    static double extraNoriPrice;     //the price of extra Nori, default 1 pounds
    static double extraBoilEggPrice;  //the price of extra boiled eggs, default 1 pounds
    static double extraBamShootPrice; //the price of extra banboo shoot, default 1 pounds
    static double extraChashuPrice;   //the price of extra Chashu, default 2 pounds
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
    private int maxnum = 10;
    private int minnum = 0;

    //MenuPanel
    private JPanel topPanel;
    private JPanel midPanel;
    private JPanel botPanel;

    public JButton back = new JButton("Back");
    public JButton confirm = new JButton("Confirm");
    public JButton add1 = new JButton("+");
    public JButton subtract1 = new JButton("-");
    public JButton add2 = new JButton("+");
    public JButton subtract2 = new JButton("-");
    public JButton add3 = new JButton("+");
    public JButton subtract3 = new JButton("-");
    public JButton add4 = new JButton("+");
    public JButton subtract4 = new JButton("-");
    public static JRadioButton tonkotsu;
    public static JRadioButton shoyu;
    public static JRadioButton shio;
    public static JRadioButton soft;
    public static JRadioButton medium;
    public static JRadioButton firm;
    public static JRadioButton no;
    public static JRadioButton just;
    public static JRadioButton lot;
    public static JRadioButton yes1;
    public static JRadioButton no1;
    public static JRadioButton yes2;
    public static JRadioButton no2;
    public static JRadioButton yes3;
    public static JRadioButton no3;
    public static JRadioButton s1;
    public static JRadioButton s2;
    public static JRadioButton s3;
    public static JRadioButton s4;
    public static JRadioButton s5;
    public static JRadioButton s6;
    public static JLabel extraNori, extraBoilEgg, extraBamShoot, extraChashu;



    public MenuPanel() {
        init();
    }

    class add1Listener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            int currentnum1 = Integer.parseInt(extraNori.getText());
            if (currentnum1 >= minnum&&currentnum1 < maxnum){
               currentnum1++;
            }
            extraNori.setText(String.valueOf(currentnum1));
        }
    }

    class subtract1Listener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            int currentnum1 = Integer.parseInt(extraNori.getText());
            if (currentnum1 > minnum && currentnum1 <= maxnum){
                currentnum1--;
            }
            extraNori.setText(String.valueOf(currentnum1));
        }
    }

    class add2Listener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            int currentnum2 = Integer.parseInt(extraBoilEgg.getText());
            if (currentnum2 >= minnum&&currentnum2 < maxnum){
                currentnum2++;
            }
            extraBoilEgg.setText(String.valueOf(currentnum2));
        }
    }

    class subtract2Listener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            int currentnum2 = Integer.parseInt(extraBoilEgg.getText());
            if (currentnum2 > minnum && currentnum2 <= maxnum){
                currentnum2--;
            }
            extraBoilEgg.setText(String.valueOf(currentnum2));
        }
    }

    class add3Listener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            int currentnum3 = Integer.parseInt(extraBamShoot.getText());
            if (currentnum3 >= minnum&&currentnum3 < maxnum){
                currentnum3++;
            }
            extraBamShoot.setText(String.valueOf(currentnum3));
        }
    }

    class subtract3Listener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            int currentnum3 = Integer.parseInt(extraBamShoot.getText());
            if (currentnum3 > minnum&& currentnum3 <= maxnum){
                currentnum3--;
            }
            extraBamShoot.setText(String.valueOf(currentnum3));
        }
    }

    class add4Listener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            int currentnum4 = Integer.parseInt(extraChashu.getText());
            if (currentnum4 >= minnum&&currentnum4 < maxnum){
                currentnum4++;
            }
            extraChashu.setText(String.valueOf(currentnum4));
        }
    }

    class subtract4Listener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            int currentnum4 = Integer.parseInt(extraChashu.getText());
            if (currentnum4 > minnum+1 && currentnum4 <= maxnum){
                currentnum4--;
            }
            extraChashu.setText(String.valueOf(currentnum4));
        }
    }


    public void init() {
        //初始化传递参数，用于测试(后端组的同学把这里删了）
        fixedPrice = 9.99;
        extraNoriPrice = 1;     //the price of extra Nori, default 1 pounds
        extraBoilEggPrice = 1;  //the price of extra boiled eggs, default 1 pounds
        extraBamShootPrice = 1; //the price of extra banboo shoot, default 1 pounds
        extraChashuPrice = 2;   //the price of extra Chashu, default 2 pounds

        //Set the font
        Font ramenFont = new Font("Times New Roman", Font.BOLD + Font.ITALIC, 20);
        Font titleFont = new Font("Times New Roman", Font.BOLD + Font.ITALIC, 25);
        Font foodTypeFont = new Font("Times New Roman", Font.BOLD, 18);
        Font addonFont = new Font("Times New Roman", Font.BOLD, 22);

        //Initialize the RadioButton
        tonkotsu = new JRadioButton("Tonkotsu");
        shoyu = new JRadioButton("Shoyu");
        shio = new JRadioButton("shio");
//        tonkotsu.setFont(foodTypeFont);
////        shoyu.setFont(foodTypeFont);
////        shio.setFont(foodTypeFont);
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
        btnGroup3.add(no);
        btnGroup3.add(just);
        btnGroup3.add(lot);

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

        ButtonGroup bthGroup8 = new ButtonGroup();
        bthGroup8.add(add1);
        bthGroup8.add(subtract1);

        ButtonGroup bthGroup9 = new ButtonGroup();
        bthGroup9.add(add2);
        bthGroup9.add(subtract2);

        ButtonGroup bthGroup10 = new ButtonGroup();
        bthGroup10.add(add3);
        bthGroup10.add(subtract3);

        ButtonGroup bthGroup11 = new ButtonGroup();
        bthGroup11.add(add4);
        bthGroup11.add(subtract4);

        add1.addActionListener(new add1Listener());
        subtract1.addActionListener(new subtract1Listener());
        add2.addActionListener(new add2Listener());
        subtract2.addActionListener(new subtract2Listener());
        add3.addActionListener(new add3Listener());
        subtract3.addActionListener(new subtract3Listener());
        add4.addActionListener(new add4Listener());
        subtract4.addActionListener(new subtract4Listener());



        //Initialize the sub-panel of this panel
        topPanel = new JPanel();
        midPanel = new JPanel();
        botPanel = new JPanel();
        //Set the topPanel
        GridBagConstraints c1 = new GridBagConstraints();
        topPanel.setLayout(new GridBagLayout());
//        topPanel.setBorder(BorderFactory.createLoweredBevelBorder());
        JCheckBox ramen = new JCheckBox("Ramen ￡" + fixedPrice, true);
        ramen.setFont(ramenFont);
        ramen.setEnabled(false);
        JLabel title = new JLabel("<html><body>Totoro Ramen<br>Designed by Mr.Miyazaki<body></html>");
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
        midPanel.setBorder(BorderFactory.createTitledBorder("Choose what you like!"));
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


//        JPanel soupP = new JPanel();
//        JPanel noodleP = new JPanel();
//        JPanel soP = new JPanel();
//        JPanel noriP = new JPanel();
//        JPanel chashuP = new JPanel();
//        JPanel eggP = new JPanel();
        JPanel spiPanel = new JPanel(new GridBagLayout());
//        JPanel addP = new JPanel();
//        JPanel exnoriP = new JPanel();
//        JPanel exeggP = new JPanel();
//        JPanel exbambooP = new JPanel();
//        JPanel exchaP = new JPanel();
        JLabel soup = new JLabel("Soup", JLabel.LEFT);
        JLabel noodles = new JLabel("Noodles", JLabel.LEFT);
        JLabel SO = new JLabel("<html><body>Spring<br>onion<body></html>", JLabel.LEFT);
        JLabel nori = new JLabel("Nori", JLabel.LEFT);
        JLabel chashu = new JLabel("Chashu", JLabel.LEFT);
        JLabel egg = new JLabel("<html><body>Boiled<br>egg<body></html>", JLabel.LEFT);
        JLabel spi = new JLabel("Spiciness", JLabel.LEFT);
        JLabel addon = new JLabel("Add-ons",JLabel.CENTER);
        JLabel enori = new JLabel("￡" + extraNoriPrice + "   Extra Nori", JLabel.LEFT);
        JLabel eegg = new JLabel("￡" + extraBoilEggPrice + "   Extra boiled egg", JLabel.LEFT);
        JLabel ebamboo = new JLabel("￡" + extraBamShootPrice + "   Bamboo shoots", JLabel.LEFT);
        JLabel echashu = new JLabel("￡" + extraChashuPrice + "   Extra chashu", JLabel.LEFT);
        s6.setForeground(Color.RED);
        soup.setFont(foodTypeFont);
        noodles.setFont(foodTypeFont);
        SO.setFont(foodTypeFont);
        nori.setFont(foodTypeFont);
        chashu.setFont(foodTypeFont);
        egg.setFont(foodTypeFont);
        spi.setFont(foodTypeFont);
        addon.setFont(addonFont);
        enori.setFont(foodTypeFont);
        eegg.setFont(foodTypeFont);
        ebamboo.setFont(foodTypeFont);
        echashu.setFont(foodTypeFont);
        //Set the defaultP layout
        defaultP.setLayout(new GridBagLayout());
        GridBagConstraints c3 = new GridBagConstraints();
        c3.fill = GridBagConstraints.BOTH;
        c3.gridx = 0;
        c3.gridy = 0;
        c3.gridwidth = 1;
        c3.gridheight = 1;
        c3.weightx = 0.25;
        c3.weighty = 0.15;
        defaultP.add(soup, c3);

        c3.gridx = 1;
        defaultP.add(tonkotsu, c3);

        c3.gridx = 2;
        defaultP.add(shoyu, c3);

        c3.gridx = 3;
        defaultP.add(shio, c3);

        c3.gridx = 0;
        c3.gridy = 1;
        defaultP.add(noodles, c3);

        c3.gridx = 1;
        defaultP.add(soft, c3);

        c3.gridx = 2;
        defaultP.add(medium, c3);

        c3.gridx = 3;
        defaultP.add(firm, c3);

        c3.gridx = 0;
        c3.gridy = 2;
        defaultP.add(SO, c3);

        c3.gridx = 1;
        defaultP.add(no, c3);

        c3.gridx = 2;
        defaultP.add(just, c3);

        c3.gridx = 3;
        defaultP.add(lot, c3);

        c3.gridx = 0;
        c3.gridy = 3;
        defaultP.add(nori, c3);

        c3.gridx = 1;
        c3.weightx = 0.5;
        c3.gridwidth = 2;
        defaultP.add(yes1, c3);

        c3.gridx = 3;
        c3.weightx = 0.25;
        c3.gridwidth = 1;
        defaultP.add(no1, c3);

        c3.gridx = 0;
        c3.gridy = 4;
        defaultP.add(chashu, c3);

        c3.gridx = 1;
        c3.weightx = 0.5;
        c3.gridwidth = 2;
        defaultP.add(yes2, c3);

        c3.gridx = 3;
        c3.weightx = 0.25;
        c3.gridwidth = 1;
        defaultP.add(no2, c3);

        c3.gridx = 0;
        c3.gridy = 5;
        defaultP.add(egg, c3);

        c3.gridx = 1;
        c3.weightx = 0.5;
        c3.gridwidth = 2;
        defaultP.add(yes3, c3);

        c3.gridx = 3;
        c3.weightx = 0.25;
        c3.gridwidth = 1;
        defaultP.add(no3, c3);



        c3.gridx = 0;
        c3.gridy = 0;
        c3.weightx = 0.05;
        c3.weightx = 1;
        c3.gridwidth = 1;
        c3.gridheight= 1;
        spiPanel.add(spi,c3);

        c3.gridx = 1;
        c3.weightx = 0.5;
        spiPanel.add(s1, c3);

        c3.gridx = 2;
        spiPanel.add(s2, c3);

        c3.gridx = 3;
        spiPanel.add(s3, c3);

        c3.gridx = 4;
        spiPanel.add(s4, c3);

        c3.gridx = 5;
        spiPanel.add(s5, c3);

        c3.gridx = 6;
        spiPanel.add(s6, c3);

        c3.gridx = 0;
        c3.gridy = 6;
        c3.weightx = 1;
        c3.weighty = 0.1;
        c3.gridwidth = 4;
        defaultP.add(spiPanel,c3);

//        c3.gridx = 0;
//        c3.gridy = 0;
//        c3.weightx = 1;
//        c3.weighty = 0.15;
//        soupP.add(soup);
//        soupP.add(tonkotsu);
//        soupP.add(shoyu);
//        soupP.add(shio);
//        defaultP.add(soupP,c3);
//
//        noodleP.add(noodles);
//        noodleP.add(soft);
//        noodleP.add(medium);
//        noodleP.add(firm);
//        c3.gridx = 0;
//        c3.gridy = 1;
//        c3.weightx = 1;
//        c3.weighty = 0.15;
//        defaultP.add(noodleP,c3);
//
//        soP.add(SO);
//        soP.add(no);
//        soP.add(just);
//        soP.add(lot);
//        c3.gridy = 2;
//        c3.weighty = 0.15;
//        defaultP.add(soP,c3);
//
//        noriP.add(nori);
//        noriP.add(yes1);
//        noriP.add(no1);
//        c3.gridy = 3;
//        c3.weighty = 0.15;
//        defaultP.add(noriP,c3);
//
//        chashuP.add(chashu);
//        chashuP.add(yes2);
//        chashuP.add(no2);
//        c3.gridy = 4;
//        c3.weighty = 0.15;
//        defaultP.add(chashuP,c3);
//
//        eggP.add(egg);
//        eggP.add(yes3);
//        eggP.add(no3);
//        c3.gridy = 5;
//        c3.weighty = 0.15;
//        defaultP.add(eggP,c3);
//
//        spiP.add(spi);
//        spiP.add(s1);
//        spiP.add(s2);
//        spiP.add(s3);
//        spiP.add(s4);
//        spiP.add(s5);
//        spiP.add(s6);
//        c3.gridy = 6;
//        c3.weighty = 0.1;
//        defaultP.add(spiP,c3);

        //Set addon Panel
        extraNori = new JLabel("0");
        extraBoilEgg = new JLabel("0");
        extraBamShoot = new JLabel("0");
        extraChashu = new JLabel("0");
        addonP.setLayout(new GridBagLayout());
        GridBagConstraints c4 = new GridBagConstraints();
        c4.fill = GridBagConstraints.BOTH;
        c4.gridx = 0;
        c4.gridy = 0;
        c4.gridheight = 1;
        c4.gridwidth = 4;
        c4.weightx = 1;
        c4.weighty = 0.2;
        addonP.add(addon,c4);

        c4.gridy = 1;
        c4.gridx = 0;
        c4.gridheight = 1;
        c4.gridwidth = 1;
        c4.weightx = 0.7;
        c4.weighty = 0.2;
        addonP.add(enori,c4);

        c4.fill = GridBagConstraints.EAST;
        c4.gridx = 1;
        c4.weightx = 0.1;
        addonP.add(subtract1,c4);

        c4.gridx = 2;
        c4.weightx = 0.1;
        addonP.add(extraNori,c4);

        c4.gridx = 3;
        c4.weightx = 0.1;
        addonP.add(add1,c4);


        c4.fill = GridBagConstraints.BOTH;
        c4.gridy = 2;
        c4.gridx = 0;
        c4.gridheight = 1;
        c4.gridwidth = 1;
        c4.weightx = 0.7;
        c4.weighty = 0.2;
        addonP.add(eegg,c4);

        c4.fill = GridBagConstraints.EAST;
        c4.gridx = 1;
        c4.weightx = 0.1;
        addonP.add(subtract2,c4);

        c4.gridx = 2;
        c4.weightx = 0.1;
        addonP.add(extraBoilEgg,c4);

        c4.gridx = 3;
        c4.weightx = 0.1;
        addonP.add(add2,c4);

        c4.fill = GridBagConstraints.BOTH;
        c4.gridy = 3;
        c4.gridx = 0;
        c4.gridheight = 1;
        c4.gridwidth = 1;
        c4.weightx = 0.7;
        c4.weighty = 0.2;
        addonP.add(ebamboo,c4);

        c4.fill = GridBagConstraints.EAST;
        c4.gridx = 1;
        c4.weightx = 0.1;
        addonP.add(subtract3,c4);

        c4.gridx = 2;
        c4.weightx = 0.1;
        addonP.add(extraBamShoot,c4);

        c4.gridx = 3;
        c4.weightx = 0.1;
        addonP.add(add3,c4);

        c4.fill = GridBagConstraints.BOTH;
        c4.gridy = 4;
        c4.gridx = 0;
        c4.gridheight = 1;
        c4.gridwidth = 1;
        c4.weightx = 0.7;
        c4.weighty = 0.2;
        addonP.add(echashu,c4);

        c4.fill = GridBagConstraints.EAST;
        c4.gridx = 1;
        c4.weightx = 0.1;
        addonP.add(subtract4,c4);

        c4.gridx = 2;
        c4.weightx = 0.1;
        addonP.add(extraChashu,c4);

        c4.gridx = 3;
        c4.weightx = 0.1;
        addonP.add(add4,c4);


//        addP.add(addon);
//        addonP.add(addP, c4);
//
//        exnoriP.add(enori);
//        exnoriP.add(extraNori);
//        c4.gridy = 1;
//        c4.weighty = 0.2;
//        addonP.add(exnoriP, c4);
//
//        exeggP.add(eegg);
//        exeggP.add(extraBoilEgg);
//        c4.gridy = 2;
//        c4.weighty = 0.2;
//        addonP.add(exeggP, c4);
//
//        exbambooP.add(ebamboo);
//        exbambooP.add(extraBamShoot);
//        c4.gridy = 3;
//        c4.weighty = 0.2;
//        addonP.add(exbambooP, c4);
//
//        exchaP.add(echashu);
//        exchaP.add(extraChashu);
//        c4.gridy = 4;
//        c4.weighty = 0.2;
//        addonP.add(exchaP, c4);


        //set the bottom Panel
        botPanel.setBorder(BorderFactory.createTitledBorder(""));
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
        c.weighty = 0.15;
        this.add(topPanel, c);
        c.gridy = 1;
        c.weighty = 0.7;
        this.add(midPanel, c);
        c.gridy = 2;
        c.weighty = 0.15;
        this.add(botPanel, c);

    }


}
