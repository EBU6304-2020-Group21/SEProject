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
    public PayPanel() {
        init();
    }

    public void init() {
         topPanel = new JPanel();
         botPanel = new JPanel();
         //Set the topPanel
         topPanel.setBorder(new TitledBorder(null, "top ", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, Color.BLACK));

         totalPrice=0;//Here we set a initial value for our totalPrice

         JPanel panOne=new JPanel();//This is a panel for locating easilier.
         JPanel panTwo=new JPanel();//This is a panel for locating easilier.
         JPanel panThree=new JPanel();//This is a panel for locating easilier.
         JPanel pan1=new JPanel();//This is a panel for locating the select for "Cash"
         JPanel pan2=new JPanel();//This is a panel for locating the select for "Cards"

         JLabel lab1 = new JLabel();//This is a label for the "Payment"
         lab1.setText("Payment");
         JLabel lab2 = new JLabel();//This is a label for the "Your total bill is: " and the number of total price
         lab2.setText("Your total bill is: "+totalPrice);
         JLabel lab3 = new JLabel();//This is a label for the selection of the way of payment
         lab3.setText("                                                                              Please select the way of payment: ");
         JLabel lab4 = new JLabel();//This is a label for the selection "Cash"
         lab4.setText("Cash");
         JLabel lab5 = new JLabel();//This is a label for the selection "Cards"
         lab5.setText("Cards");

         JRadioButton but1 = new JRadioButton();//This is a radiobutton for our customer to choose "Cash"
         JRadioButton but2 = new JRadioButton();//This is a radiobutton for our customer to choose "Cards"

         topPanel.add(panOne, BorderLayout.NORTH);//We divide the top panel vertically into three major parts
         topPanel.add(panTwo, BorderLayout.CENTER);
         topPanel.add(panThree, BorderLayout.SOUTH);
         topPanel.setLayout(new BoxLayout(topPanel,BoxLayout.Y_AXIS));
         panThree.add(lab3, BorderLayout.NORTH);//We divide the panel-three vertically into three major parts
         panThree.add(pan1, BorderLayout.CENTER);
         panThree.add(pan2, BorderLayout.SOUTH);
         panThree.setLayout(new BoxLayout(panThree,BoxLayout.Y_AXIS));
         pan1.add(but1, BorderLayout.WEST);//We are designing the distribution of tick buttons and the options they represent
         pan1.add(lab4, BorderLayout.EAST);
         pan2.add(but2, BorderLayout.WEST);
         pan2.add(lab5, BorderLayout.EAST);

         topPanel.setSize(800,540);
         panOne.setSize(800,80);
         panTwo.setSize(800,60);
         panThree.setSize(800,400);

         panOne.add(lab1);
         panTwo.add(lab2);

         //set the bottom Panel
        botPanel.setBorder(new TitledBorder(null, "bottom ", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, Color.BLACK));
        JButton back = new JButton("Back");
        JButton confirm = new JButton("Confirm");
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
