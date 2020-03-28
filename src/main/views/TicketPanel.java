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
        Font font1 = new Font("Times new Roman",Font.BOLD,22);
        JLabel lab1 = new JLabel();
        lab1.setText("Ticket");
        lab1.setFont(font1);



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
