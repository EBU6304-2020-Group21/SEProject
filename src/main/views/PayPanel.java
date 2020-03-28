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

         JPanel pan1=new JPanel();//This is the panel for "Payment"
         JPanel pan2=new JPanel();//This is the panel for "Your total bill is: "
         JPanel pan3=new JPanel();//This panel is used to display the total price.
         JPanel pan4=new JPanel();//This is the panel fot "Please select the way of payment:"
         JPanel pan5=new JPanel();//This is the panel for selecting "Cash"
         JPanel pan6=new JPanel();//This is the panel for printing "Cash"
         JPanel pan7=new JPanel();//This is the panel for selecting "Cards"
         JPanel pan8=new JPanel();//This is the panel for selecting "Cards"

         JPanel panOne=new JPanel();//This is a panel for locating easilier.
         JPanel panTwo=new JPanel();//This is a panel for locating easilier.
         JPanel panThree=new JPanel();//This is a panel for locating easilier.
         JPanel panFour=new JPanel();//This is a panel for locating easilier.
         JPanel panFive=new JPanel();//This is a panel for locating easilier.

         JLabel lab1=new JLabel("Payment");
         JLabel lab2=new JLabel("Your total bill is: ");
         JLabel lab3=new JLabel(String.valueOf(totalPrice));
         JLabel lab4=new JLabel("Please select the way of payment");
         JLabel lab5=new JLabel("Cash");
         JLabel lab6=new JLabel("Cards");

         JButton button1=new JButton();//This is the button for selecting "Cash"
         JButton button2=new JButton();//This is the button for selecting "Cards"

         topPanel.setLayout(new BoxLayout(topPanel,BoxLayout.Y_AXIS));//set the total topPanel in Y-axis

         topPanel.add(BorderLayout.NORTH,panOne);
         topPanel.add(BorderLayout.SOUTH,panTwo);

         panOne.add(BorderLayout.NORTH,pan1);
         panOne.add(BorderLayout.SOUTH,panThree);
         panThree.add(BorderLayout.WEST,pan2);
         panThree.add(BorderLayout.EAST,pan3);

         panTwo.add(BorderLayout.NORTH,pan4);
         panTwo.add(BorderLayout.CENTER,panFour);
         panThree.add(BorderLayout.WEST,pan5);
         panThree.add(BorderLayout.EAST,pan6);
         panTwo.add(BorderLayout.SOUTH,panFive);
         panThree.add(BorderLayout.WEST,pan7);
         panThree.add(BorderLayout.EAST,pan8);

         pan5.add(button1);
         pan7.add(button2);

         pan1.add(lab1);
         pan2.add(lab2);
         pan3.add(lab3);
         pan4.add(lab4);
         pan6.add(lab5);
         pan8.add(lab6);

         topPanel.setSize(800,540);

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
