package main.views;

import javax.swing.*;
import java.awt.*;

public class LoyaltyPanel extends JPanel{
    private JPanel topPanel;
    private JPanel botPanel;

    public JButton back = new JButton("Back");
    public JButton confirm = new JButton("Confirm");
    public JRadioButton but1 = new JRadioButton("Sign in");
    public JRadioButton but2 = new JRadioButton("Sign up");
    public LoyaltyPanel(){
        init();
    }
    public void init(){
        topPanel = new JPanel();
        botPanel = new JPanel();
        //set the top panel
        Font font1 = new Font("Times new Roman",Font.BOLD,30);
        Font font2 = new Font("Times new Roman",Font.BOLD,25);
        JLabel lab1 = new JLabel("Welcome to loyalty service", JLabel.CENTER);
        lab1.setFont(font1);
        but1.setFont(font2);
        but2.setFont(font2);
        ButtonGroup bg = new ButtonGroup();
        bg.add(but1);
        bg.add(but2);

        topPanel.setLayout(new GridBagLayout());
        GridBagConstraints top = new GridBagConstraints();
        top.fill = GridBagConstraints.BOTH;
        top.gridx = 0;
        top.gridy = 0;
        top.gridheight = 1;
        top.gridwidth = 1;
        top.weightx = 1;
        top.weighty = 0.4;
        topPanel.add(lab1,top);
        top.fill = GridBagConstraints.CENTER;
        top.gridy = 1;
        top.weighty = 0.3;
        topPanel.add(but1,top);
        top.gridy = 2;
        top.weighty = 0.3;
        topPanel.add(but2,top);



        topPanel.setBorder(BorderFactory.createTitledBorder(""));
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
