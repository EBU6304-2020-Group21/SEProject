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
        /**
         * code here is the design of topPanel
         private float totalPrice=0;//Here we set a initial value for our totalPrice

         JPanel pan1=new JPanel();//This is the panel for "Payment"
         Jpanel pan2=new Jpanel();//This is the panel for "Your total bill is: "
         Jpanel pan3=new JPanel();//This panel is used to display the total price.
         JPanel pan4=new JPanel();//This is the panel fot "Please select the way of payment:"
         JPanel pan5=new JPanel();//This is the panel for selecting "Cash"
         JPanel pan6=new JPanel();//This is the panel for printing "Cash"
         JPanel pan7=new JPanel();//This is the panel for selecting "Cards"
         JPanel pan8=new JPanel();//This is the panel for selecting "Cards"

         JPanel panOne=new JPanel();//This is a panel for locating easilier.
         JPnael panTwo=new JPanel();//This is a panel for locating easilier.
         JPnael panThree=new JPanel();//This is a panel for locating easilier.
         JPnael panFour=new JPanel();//This is a panel for locating easilier.
         JPnael panFive=new JPanel();//This is a panel for locating easilier.

         JLabel lab1=new JLabel("Payment");
         JLabel lab2=new JLabel("Your total bill is: ");
         JLabel lab3=new JLabel(totalPrice);
         JLabel lab4=new JLabel("Please select the way of payment");
         JLabel lab5=new JLabel("Cash");
         JLabel lab6=new JLabel("Cards");

         JButton button1=new JButton();//This is the button for selecting "Cash"
         button1.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent e){
         goNextCash();//This is the function for going to the serface for paying by cash.
         }
         }
         );

         JButton button2=new JButton();//This is the button for selecting "Cards"
         button2.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent e){
         goNextCards();//This is the function for going to the serface for paying by cards.
         }
         }
         );

         topPanel.setLayout(new BoxLayout(topPanel,BoxLayout.Y_AXIS));//set the total topPanel in Y-axis

         topPanel.getContentPane().add(BorderLayout.NORTH,panOne);
         topPanel.getContentPane().add(BorderLayout.SOUTH,panTwo);

         panOne.getContentPane().add(BorderLayout.NORTH,pan1);
         panOne.getContentPane().add(BorderLayout.SOUTH,panThree);
         panThree.getContentPane().add(BorderLayout.WEST,pan2);
         panThree.getContentPane().add(BorderLayout.EAST,pan3);

         panTwo.getContentPane().add(BorderLayout.NORTH,pan4);
         panTwo.getContentPane().add(BorderLayout.CENTER,panFour);
         panThree.getContentPane().add(BorderLayout.WEST,pan5);
         panThree.getContentPane().add(BorderLayout.EAST,pan6);
         panTwo.getContentPane().add(BorderLayout.SOUTH,panFive);
         panThree.getContentPane().add(BorderLayout.WEST,pan7);
         panThree.getContentPane().add(BorderLayout.EAST,pan8);

         pan5.add(button1);
         pan7.add(button2);

         pan1.add(lab1);
         pan2.add(lab2);
         pan3.add(lab3);
         pan4.add(lab4);
         pan6.add(lab5);
         pan8.add(lab6);

         topPanel.setSize(800,540);
         topPanel.setVisible(true);
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
        c.weighty = 0.9;
        this.add(topPanel,c);
        c.gridy = 1;
        c.weighty = 0.1;
        this.add(botPanel,c);

    }
}
