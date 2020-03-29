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
        //Set the topPanel
        topPanel.setBorder(new TitledBorder(null, "top ", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, Color.BLACK));
        Font font1 = new Font("Times new Roman",Font.BOLD,25);
        Font font2 = new Font("Times new Roman",Font.BOLD,20);
        JLabel lab1 = new JLabel("TICKET");
        JLabel lab2 = new JLabel("Order Name");
        JLabel lab3 = new JLabel("Date&Time");
        JLabel lab4 = new JLabel("Membership Number");
        JLabel lab5 = new JLabel("Dining Way");
        lab1.setFont(font1);
        lab2.setFont(font2);
        lab3.setFont(font2);
        lab4.setFont(font2);
        lab5.setFont(font2);
        topPanel.add(lab1);
        topPanel.add(lab2);
        topPanel.add(lab3);
        topPanel.add(lab4);
        topPanel.add(lab5);

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
        top.weightx = 0.4;
        top.weighty = 0.3;
        topPanel.add(lab2, top);

        top.gridx = 0;
        top.gridy = 2;
        top.gridwidth = 1;
        top.gridheight = 1;
        top.weightx = 0.4;
        top.weighty = 0.3;
        topPanel.add(lab3, top);

        top.gridx = 2;
        top.gridy = 1;
        top.gridwidth = 1;
        top.gridheight = 1;
        top.weightx = 0.4;
        top.weighty = 0.3;
        topPanel.add(lab4, top);

        top.gridx = 2;
        top.gridy = 2;
        top.gridwidth = 1;
        top.gridheight = 1;
        top.weightx = 0.4;
        top.weighty = 0.3;
        topPanel.add(lab5, top);









                //set the midPanel
        midPanel.setBorder(new TitledBorder(null, "mid ", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, Color.BLACK));
        /**
         * code here is the design of midpanel
         */

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
