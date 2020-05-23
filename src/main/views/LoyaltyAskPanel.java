package main.views;

import javax.swing.*;
import java.awt.*;

public class LoyaltyAskPanel extends JPanel{
    private JPanel topPanel;
    private JPanel botPanel;

    public JButton back = new JButton("Back");
    public JButton confirm = new JButton("Confirm");
    public JRadioButton but1 = new JRadioButton("Yes, Sign in");
    public JRadioButton but2 = new JRadioButton("No, Sign up");
    public JRadioButton but3 = new JRadioButton("Skip");
    public LoyaltyAskPanel(){
        init();
    }
    public void init(){
        topPanel = new JPanel();
        botPanel = new JPanel();
        //set the top panel
        JLabel lab1 = new JLabel("Loyalty Scheme", JLabel.CENTER);
        JLabel lab2 = new JLabel("Do you have a membership number?", JLabel.CENTER);
        Font font1 = new Font("Times new Roman",Font.BOLD,30);
        Font font2 = new Font("Times new Roman",Font.BOLD,30);
        ButtonGroup bg = new ButtonGroup();
        bg.add(but1);
        bg.add(but2);
        bg.add(but3);
        lab1.setFont(font1);
        lab2.setFont(font1);
        but1.setFont(font2);
        but2.setFont(font2);
        but3.setFont(font2);

        topPanel.setLayout(new GridBagLayout());
        GridBagConstraints top = new GridBagConstraints();
        top.fill = GridBagConstraints.BOTH;
        top.gridx = 0;
        top.gridy = 0;
        top.gridheight = 1;
        top.gridwidth = 1;
        top.weightx = 1;
        top.weighty = 0.2;
        topPanel.add(lab1,top);
        top.gridy = 1;
        top.weighty = 0.2;
        topPanel.add(lab2,top);
        top.fill = GridBagConstraints.CENTER;
        top.gridy = 2;
        top.weighty = 0.2;
        topPanel.add(but1,top);
        top.anchor = GridBagConstraints.NORTH;
        top.gridy = 3;
        top.weighty = 0.15;
        topPanel.add(but2,top);
        top.anchor = GridBagConstraints.NORTH;
        top.gridy = 4;
        top.weighty = 0.25;
        topPanel.add(but3,top);


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
