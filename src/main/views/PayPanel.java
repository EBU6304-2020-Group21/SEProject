package main.views;

import javax.swing.*;
import java.awt.*;

import static main.views.GUIModel.currentOrder;

public class PayPanel extends JPanel {

    private double totalPrice;
    //sub-panel of this panel
    //sub-panel of TicketPanel
    private JPanel topPanel;
    private JPanel botPanel;

    public static JRadioButton but1;
    public static JRadioButton but2;
    //back and confirm
    public JButton back = new JButton("Back");
    public JButton confirm = new JButton("Confirm");
    public PayPanel() {
        init();
    }

    public void init() {
        totalPrice=0.00;
         topPanel = new JPanel();
         botPanel = new JPanel();
         //Set the topPanel
         topPanel.setBorder(BorderFactory.createTitledBorder(""));
         Font font1 = new Font("Times new Roman",Font.BOLD,24);
         Font font2 = new Font("Times new Roman",Font.PLAIN,20);


         JLabel lab1 = new JLabel("Payment",JLabel.CENTER);//This is a label for the "Payment"
         lab1.setFont(font1);
         JLabel lab2 = new JLabel("Your total bill is: "+currentOrder.getTotalPrice()+"\u00A3",JLabel.CENTER);//This is a label for the "Your total bill is: " and the number of total price
         lab2.setFont(font1);
         JLabel lab3 = new JLabel("Please select the way of payment: ",JLabel.CENTER);//This is a label for the selection of the way of payment
         lab3.setFont(font1);
         but1 = new JRadioButton("Cash");//This is a radiobutton for our customer to choose "Cash"
         but2 = new JRadioButton("Cards");//This is a radiobutton for our customer to choose "Cards"
         ButtonGroup btg = new ButtonGroup();
         btg.add(but1);
         btg.add(but2);
         but1.setFont(font2);
         but2.setFont(font2);

        topPanel.setLayout(new GridBagLayout());
        GridBagConstraints c1 = new GridBagConstraints();
        c1.fill = GridBagConstraints.BOTH;
        c1.gridx = 0;
        c1.gridy = 0;
        c1.gridwidth = 1;
        c1.gridheight = 1;
        c1.weightx = 1;
        c1.weighty = 0.1;
        topPanel.add(lab1,c1);
        c1.gridy = 1;
        c1.weighty = 0.1;
        topPanel.add(lab2,c1);
        c1.gridy = 2;
        c1.weighty = 0.1;
        topPanel.add(lab3,c1);
        c1.fill = GridBagConstraints.CENTER;
        c1.gridy = 3;
        c1.weighty = 0.35;
        topPanel.add(but1,c1);
        c1.gridy = 4;
        c1.weighty = 0.35;
        topPanel.add(but2,c1);

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
        c.weighty = 0.85;
        this.add(topPanel,c);
        c.gridy = 1;
        c.weighty = 0.15;
        this.add(botPanel,c);

    }
}
