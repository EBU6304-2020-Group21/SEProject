package main.views;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class PayPanel extends JPanel {
    private double totalPrice;

    //sub-panel of this panel
    //sub-panel of TicketPanel
    private JPanel topPanel;
    private JPanel botPanel;

    //back and confirm
    public JButton back = new JButton("Back");
    public JButton confirm = new JButton("Confirm");
    public PayPanel() {
        init();
    }

    public void init() {
         totalPrice=0.00;//Here we set a initial value for our totalPrice
         topPanel = new JPanel();
         botPanel = new JPanel();
         //Set the topPanel
         topPanel.setBorder(BorderFactory.createTitledBorder(""));
         Font font1 = new Font("Times new Roman",Font.BOLD,24);
         Font font2 = new Font("Times new Roman",Font.PLAIN,20);

         JPanel pan1=new JPanel();//This is a panel for locating easilier.
         JPanel pan2=new JPanel();//This is a panel for locating easilier.
         JPanel pan3=new JPanel();//This is a panel for locating easilier.
         JPanel pan4=new JPanel();//This is a panel for locating the select for "Cash"
         JPanel pan5=new JPanel();

         JLabel lab1 = new JLabel();//This is a label for the "Payment"
         lab1.setText("Payment");
         lab1.setFont(font1);
         JLabel lab2 = new JLabel();//This is a label for the "Your total bill is: " and the number of total price
         lab2.setText("Your total bill is: "+totalPrice+"￡");
         lab2.setFont(font1);
         JLabel lab3 = new JLabel();//This is a label for the selection of the way of payment
         lab3.setFont(font1);
         lab3.setText("Please select the way of payment: ");
         JRadioButton but1 = new JRadioButton("Cash");//This is a radiobutton for our customer to choose "Cash"
         JRadioButton but2 = new JRadioButton("Cards");//This is a radiobutton for our customer to choose "Cards"
         but1.setFont(font2);
         but2.setFont(font2);

        topPanel.setLayout(new GridBagLayout());
        GridBagConstraints c1 = new GridBagConstraints();
        c1.fill = GridBagConstraints.BOTH;
        c1.gridx = 0;
        c1.gridy = 0;
        c1.weightx = 0;
        c1.weighty = 0.2;
        pan1.add(lab1);
        topPanel.add(pan1,c1);
        c1.gridy = 1;
        c1.weighty = 0.2;
        pan2.add(lab2);
        topPanel.add(pan2,c1);
        c1.gridy = 2;
        c1.weighty = 0.2;
        pan3.add(lab3);
        topPanel.add(pan3,c1);
        c1.gridy = 3;
        c1.weighty = 0.2;
        pan4.add(but1);
        topPanel.add(pan4,c1);
        c1.gridy = 4;
        c1.weighty = 0.2;
        pan5.add(but2);
        topPanel.add(pan5,c1);

         //set the bottom Panel
        botPanel.setBorder(BorderFactory.createTitledBorder(""));
        back = new JButton("Back");
        confirm = new JButton("Confirm");
        botPanel.setLayout(new BorderLayout());
        back.setPreferredSize(new Dimension(150,0));
        confirm.setPreferredSize(new Dimension(150,0));
        botPanel.add(back,BorderLayout.WEST);
        botPanel.add(confirm,BorderLayout.EAST);
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
        c.weighty = 0.9;
        this.add(topPanel,c);
        c.gridy = 1;
        c.weighty = 0.1;
        this.add(botPanel,c);

    }
}
