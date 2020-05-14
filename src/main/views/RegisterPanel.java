package main.views;

import javax.swing.*;
import java.awt.*;

public class RegisterPanel extends JPanel{
    private JPanel topPanel;
    private JPanel botPanel;

    public JButton back = new JButton("Back");
    public JButton confirm = new JButton("Confirm");
    public JTextField firstNameField;
    public JTextField surnameField;
    public JTextField emailField;
    public JTextField phoneNumberField;
    public RegisterPanel(){
        init();
    }
    public void init(){
        topPanel = new JPanel();
        botPanel = new JPanel();
        //set the top panel
        topPanel.setBorder(BorderFactory.createTitledBorder(""));
        topPanel.setLayout(new GridBagLayout());
        JLabel lab1 = new JLabel("Sign up for loyalty service",JLabel.CENTER);
        JLabel lab2 = new JLabel("First Name *",JLabel.RIGHT);
        JLabel lab3 = new JLabel("Surname *",JLabel.RIGHT);
        JLabel lab4 = new JLabel("Email ",JLabel.RIGHT);
        JLabel lab5 = new JLabel("Phone Number ",JLabel.RIGHT);
        firstNameField = new JTextField();
        firstNameField.setPreferredSize(new Dimension(300,40));
        surnameField = new JTextField();
        surnameField.setPreferredSize(new Dimension(300,40));
        emailField = new JTextField();
        emailField.setPreferredSize(new Dimension(300,40));
        phoneNumberField = new JTextField();
        phoneNumberField.setPreferredSize(new Dimension(300,40));
        Font font1 = new Font("Times new Roman",Font.BOLD,25);
        Font font2 = new Font("Times new Roman",Font.BOLD,20);
        lab1.setFont(font1);
        lab2.setFont(font2);
        lab3.setFont(font2);
        lab4.setFont(font2);
        lab5.setFont(font2);

        GridBagConstraints top = new GridBagConstraints();
        top.fill = GridBagConstraints.BOTH;
        top.gridx = 0;
        top.gridy = 0;
        top.gridheight = 1;
        top.gridwidth = 2;
        top.weightx = 1;
        top.weighty = 0.2;
        topPanel.add(lab1,top);

        top.weightx = 0.32;
        top.gridwidth = 1;
        top.gridy = 1;
        topPanel.add(lab2,top);
        top.fill = GridBagConstraints.CENTER;
        top.anchor = GridBagConstraints.WEST;
        top.gridx = 1;
        top.weightx = 0.68;
        topPanel.add(firstNameField,top);

        top.fill = GridBagConstraints.BOTH;
        top.gridx = 0;
        top.gridy = 2;
        top.weightx = 0.32;
        topPanel.add(lab3,top);
        top.fill = GridBagConstraints.CENTER;
        top.gridx = 1;
        top.weightx = 0.68;
        topPanel.add(surnameField,top);

        top.fill = GridBagConstraints.BOTH;
        top.gridx = 0;
        top.gridy = 3;
        top.weightx = 0.32;
        topPanel.add(lab4,top);
        top.fill = GridBagConstraints.CENTER;
        top.gridx = 1;
        top.weightx = 0.68;
        topPanel.add(emailField,top);

        top.fill = GridBagConstraints.BOTH;
        top.gridx = 0;
        top.gridy = 4;
        top.weightx = 0.32;
        topPanel.add(lab5,top);
        top.fill = GridBagConstraints.CENTER;
        top.gridx = 1;
        top.weightx = 0.68;
        topPanel.add(phoneNumberField,top);
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
