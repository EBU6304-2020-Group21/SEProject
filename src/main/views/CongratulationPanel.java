package main.views;

import javax.swing.*;
import java.awt.*;

import static main.views.GUIModel.currentCustomer;

public class CongratulationPanel extends JPanel{
    private JPanel topPanel;
    private JPanel botPanel;

    private String membershipNum;
    private String firstName;
    private String surname;
    private String email;
    private String mobileNum;

    public JButton back = new JButton("Back");
    public JButton confirm = new JButton("Confirm");
    public CongratulationPanel(){
        init();
    }
    public void init(){
        topPanel = new JPanel();
        botPanel = new JPanel();
        JLabel lab1 = new JLabel("Congratulations!",JLabel.CENTER);
        JLabel lab2 = new JLabel("<html><body>You have successfully registered in loyalty service<br>" +
                "The membership information is as following: ",JLabel.CENTER);
        JLabel lab3 = new JLabel("Membership Number: " + currentCustomer.getMembershipNum(),JLabel.CENTER);
        JLabel lab4 = new JLabel("Name: " + currentCustomer.getFirstName()+" "+currentCustomer.getSurname(),JLabel.CENTER);
        JLabel lab5 = new JLabel("Email: "+ currentCustomer.getEmail(),JLabel.CENTER);
        JLabel lab6 = new JLabel("Phone number: "+ currentCustomer.getMobileNum(),JLabel.CENTER);
        Font font1 = new Font("Times New Roman",Font.BOLD,30);
        Font font2 = new Font("Times New Roman",Font.BOLD,25);
        Font font3 = new Font("Times New Roman",Font.PLAIN,18);
        lab1.setFont(font1);
        lab2.setFont(font2);
        lab3.setFont(font2);
        lab4.setFont(font2);
        lab5.setFont(font2);
        lab6.setFont(font2);
        //set the top panel
        topPanel.setLayout(new GridBagLayout());
        topPanel.setBorder(BorderFactory.createTitledBorder(""));
        GridBagConstraints top = new GridBagConstraints();
        top.fill = GridBagConstraints.BOTH;
        top.weightx = 1;
        top.weighty = 0.2;
        top.gridx = 0;
        top.gridy = 0;
        top.gridwidth = 1;
        top.gridheight = 1;
        topPanel.add(lab1,top);

        top.gridy = 1;
        topPanel.add(lab2,top);

        top.weighty = 0.15;
        top.gridy = 2;
        topPanel.add(lab3,top);

        top.gridy = 3;
        topPanel.add(lab4,top);

        top.gridy = 4;
        topPanel.add(lab5,top);

        top.gridy = 5;
        topPanel.add(lab6,top);
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
        c.weighty = 0.85;
        this.add(topPanel, c);
        c.gridy = 1;
        c.weighty = 0.15;
        this.add(botPanel, c);
    }

}
