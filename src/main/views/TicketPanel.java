package main.views;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class TicketPanel extends JPanel {
    private String soupType;
    private String noodleType;
    private String sprOnionType;
    private Boolean nori;
    private Boolean chashu;
    private Boolean boiledEgg;
    private int spicyIndex;
    private double fixedPrice = 9.99; //default price of fixed dishes is 9.99
    private int extraNoriNum;
    private int extraBoilEggNum;
    private int extraBamshootNum;
    private int extraChashuNum;
    private double addOnPrice;
    private String diningOption;
    private String totalPrice;
    private String orderNum;
    private String memberNum;
    private String DateTime;

    //sub-panel of TicketPanel
    private JPanel topPanel;
    private JPanel midPanel;
    private JPanel botPanel;
    //back and confirm
    public JButton back = new JButton("Back");
    public JButton confirm = new JButton("Confirm");


    public TicketPanel() {
        init();
    }

    public void init() {
        //Initialize the sub-panel of this panel
        topPanel = new JPanel();
        midPanel = new JPanel();
        botPanel = new JPanel();

        Font font0 = new Font("Times new Roman",Font.BOLD,32);
        Font font1 = new Font("Times new Roman",Font.BOLD,25);
        Font font2 = new Font("Times new Roman",Font.BOLD,20);
        Font font3 = new Font("Times new Roman",Font.BOLD,18);

        //Set the topPanel
        topPanel.setBorder(new TitledBorder(null, "top ", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, Color.BLACK));
        JLabel lab1 = new JLabel("TICKET", JLabel.CENTER);
        JLabel lab2 = new JLabel("Order Name", JLabel.LEFT);
        JLabel lab3 = new JLabel("Date&Time", JLabel.LEFT);
        JLabel lab4 = new JLabel("Membership Number", JLabel.LEFT);
        JLabel lab5 = new JLabel("Dining Way", JLabel.LEFT);
        orderNum = order;
        JLabel show2 = new JLabel(orderNum);
        JLabel show3 = new JLabel(DateTime);
        JLabel show4 = new JLabel(memberNum);
        JLabel show5 = new JLabel(diningOption);

        lab1.setFont(font0);
        lab2.setFont(font2);
        lab3.setFont(font2);
        lab4.setFont(font2);
        lab5.setFont(font2);
        topPanel.add(lab1);
        topPanel.add(lab2);
        topPanel.add(lab3);
        topPanel.add(lab4);
        topPanel.add(lab5);
        topPanel.add(show2);
        topPanel.add(show3);
        topPanel.add(show4);
        topPanel.add(show5);

        topPanel.setLayout(new GridBagLayout());
        GridBagConstraints top = new GridBagConstraints();
        top.fill = GridBagConstraints.BOTH;

        top.gridx = 0;
        top.gridy = 0;
        top.gridwidth = 3;
        top.gridheight = 1;
        top.weightx = 1;
        top.weighty = 0.4;
        topPanel.add(lab1, top);

        top.gridx = 0;
        top.gridy = 1;
        top.gridwidth = 1;
        top.gridheight = 1;
        top.weightx = 0.25;
        top.weighty = 0.3;
        topPanel.add(lab2, top);

        top.gridx = 0;
        top.gridy = 1;
        top.gridwidth = 1;
        top.gridheight = 1;
        top.weightx = 0.25;
        top.weighty = 0.3;
        topPanel.add(show2, top);

        top.gridx = 0;
        top.gridy = 2;
        top.gridwidth = 1;
        top.gridheight = 1;
        top.weightx = 0.5;
        top.weighty = 0.3;
        topPanel.add(lab3, top);

        top.gridx = 2;
        top.gridy = 1;
        top.gridwidth = 1;
        top.gridheight = 1;
        top.weightx = 0.5;
        top.weighty = 0.3;
        topPanel.add(lab4, top);

        top.gridx = 2;
        top.gridy = 2;
        top.gridwidth = 1;
        top.gridheight = 1;
        top.weightx = 0.5;
        top.weighty = 0.3;
        topPanel.add(lab5, top);



        //set the midPanel
        midPanel.setBorder(new TitledBorder(null, "mid ", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, Color.BLACK));
        JLabel lab6 = new JLabel("SINGLE DISH", JLabel.LEFT);
        JLabel lab7 = new JLabel("Soup", JLabel.LEFT);
        JLabel lab8 = new JLabel("Noodles", JLabel.LEFT);
        JLabel lab9 = new JLabel("Spring onion", JLabel.LEFT);
        JLabel lab10 = new JLabel("Nori", JLabel.LEFT);
        JLabel lab11 = new JLabel("Chashu", JLabel.LEFT);
        JLabel lab12 = new JLabel("Boiled egg", JLabel.LEFT);
        JLabel lab13 = new JLabel("Spiciness", JLabel.LEFT);
        JLabel lab14 = new JLabel("SINGLE DISH PRICE", JLabel.LEFT);
        JLabel lab15 = new JLabel("Add-ons");
        JLabel lab16 = new JLabel("Amount");
        JLabel lab17 = new JLabel("Price");
        JLabel lab18 = new JLabel("Extra Nori", JLabel.LEFT);
        JLabel lab19 = new JLabel("Extra boiled egg", JLabel.LEFT);
        JLabel lab20 = new JLabel("Bamboo shoots", JLabel.LEFT);
        JLabel lab21 = new JLabel("Extra chashu", JLabel.LEFT);
        JLabel lab22 = new JLabel("ADD-ONS Price", JLabel.LEFT);
        JLabel lab23 = new JLabel("TOTAL Price", JLabel.LEFT);
        lab6.setFont(font1);
        lab7.setFont(font3);
        lab8.setFont(font3);
        lab9.setFont(font3);
        lab10.setFont(font3);
        lab11.setFont(font3);
        lab12.setFont(font3);
        lab13.setFont(font3);
        lab14.setFont(font1);
        lab15.setFont(font1);
        lab16.setFont(font1);
        lab17.setFont(font1);
        lab18.setFont(font3);
        lab19.setFont(font3);
        lab20.setFont(font3);
        lab21.setFont(font3);
        lab22.setFont(font1);
        lab23.setFont(font1);
        midPanel.add(lab6);
        midPanel.add(lab7);
        midPanel.add(lab8);
        midPanel.add(lab9);
        midPanel.add(lab10);
        midPanel.add(lab11);
        midPanel.add(lab12);
        midPanel.add(lab13);
        midPanel.add(lab14);
        midPanel.add(lab15);
        midPanel.add(lab16);
        midPanel.add(lab17);
        midPanel.add(lab18);
        midPanel.add(lab19);
        midPanel.add(lab20);
        midPanel.add(lab21);
        midPanel.add(lab22);
        midPanel.add(lab23);

        midPanel.setLayout(new GridBagLayout());
        GridBagConstraints mid = new GridBagConstraints();
        mid.fill = GridBagConstraints.BOTH;

        mid.gridx = 0;
        mid.gridy = 0;
        mid.gridwidth = 1;
        mid.gridheight = 1;
        mid.weightx = 0.4;
        mid.weighty = 0.15;
        midPanel.add(lab6, mid);

        mid.gridx = 0;
        mid.gridy = 1;
        mid.gridwidth = 1;
        mid.gridheight = 1;
        mid.weightx = 0.4;
        mid.weighty = 0.1;
        midPanel.add(lab7, mid);

        mid.gridx = 0;
        mid.gridy = 2;
        mid.gridwidth = 1;
        mid.gridheight = 1;
        mid.weightx = 0.4;
        mid.weighty = 0.1;
        midPanel.add(lab8, mid);

        mid.gridx = 0;
        mid.gridy = 3;
        mid.gridwidth = 1;
        mid.gridheight = 1;
        mid.weightx = 0.4;
        mid.weighty = 0.1;
        midPanel.add(lab9, mid);

        mid.gridx = 0;
        mid.gridy = 4;
        mid.gridwidth = 1;
        mid.gridheight = 1;
        mid.weightx = 0.4;
        mid.weighty = 0.1;
        midPanel.add(lab10, mid);

        mid.gridx = 0;
        mid.gridy = 5;
        mid.gridwidth = 1;
        mid.gridheight = 1;
        mid.weightx = 0.4;
        mid.weighty = 0.1;
        midPanel.add(lab11, mid);

        mid.gridx = 0;
        mid.gridy = 6;
        mid.gridwidth = 1;
        mid.gridheight = 1;
        mid.weightx = 0.4;
        mid.weighty = 0.1;
        midPanel.add(lab12, mid);

        mid.gridx = 0;
        mid.gridy = 7;
        mid.gridwidth = 1;
        mid.gridheight = 1;
        mid.weightx = 0.4;
        mid.weighty = 0.1;
        midPanel.add(lab13, mid);

        mid.gridx = 0;
        mid.gridy = 8;
        mid.gridwidth = 1;
        mid.gridheight = 1;
        mid.weightx = 0.4;
        mid.weighty = 0.15;
        midPanel.add(lab14, mid);

        mid.gridx = 1;
        mid.gridy = 0;
        mid.gridwidth = 1;
        mid.gridheight = 1;
        mid.weightx = 0.2;
        mid.weighty = 0.2;
        midPanel.add(lab15, mid);

        mid.gridx = 2;
        mid.gridy = 0;
        mid.gridwidth = 1;
        mid.gridheight = 1;
        mid.weightx = 0.2;
        mid.weighty = 0.2;
        midPanel.add(lab16, mid);

        mid.gridx = 3;
        mid.gridy = 0;
        mid.gridwidth = 1;
        mid.gridheight = 1;
        mid.weightx = 0.2;
        mid.weighty = 0.2;
        midPanel.add(lab17, mid);

        mid.gridx = 1;
        mid.gridy = 1;
        mid.gridwidth = 3;
        mid.gridheight = 1;
        mid.weightx = 0.6;
        mid.weighty = 0.1;
        midPanel.add(lab18, mid);

        mid.gridx = 1;
        mid.gridy = 2;
        mid.gridwidth = 3;
        mid.gridheight = 1;
        mid.weightx = 0.6;
        mid.weighty = 0.1;
        midPanel.add(lab19, mid);

        mid.gridx = 1;
        mid.gridy = 3;
        mid.gridwidth = 3;
        mid.gridheight = 1;
        mid.weightx = 0.6;
        mid.weighty = 0.1;
        midPanel.add(lab20, mid);

        mid.gridx = 1;
        mid.gridy = 4;
        mid.gridwidth = 3;
        mid.gridheight = 1;
        mid.weightx = 0.6;
        mid.weighty = 0.1;
        midPanel.add(lab21, mid);

        mid.gridx = 1;
        mid.gridy = 5;
        mid.gridwidth = 3;
        mid.gridheight = 2;
        mid.weightx = 0.6;
        mid.weighty = 0.2;
        midPanel.add(lab22, mid);

        mid.gridx = 1;
        mid.gridy = 7;
        mid.gridwidth = 3;
        mid.gridheight = 2;
        mid.weightx = 0.6;
        mid.weighty = 0.2;
        midPanel.add(lab23, mid);



        //set the bottom Panel
        botPanel.setBorder(BorderFactory.createTitledBorder(""));
        botPanel.setLayout(new BorderLayout());
        back.setPreferredSize(new Dimension(150, 0));
        confirm.setPreferredSize(new Dimension(150, 0));
        botPanel.add(back, BorderLayout.WEST);
        botPanel.add(confirm, BorderLayout.EAST);
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
        c.weighty = 0.2;
        this.add(topPanel,c);
        c.gridy = 1;
        c.weighty = 0.7;
        this.add(midPanel,c);
        c.gridy = 2;
        c.weighty = 0.1;
        this.add(botPanel,c);

    }
}
