package main.views;

import javax.swing.*;
import java.awt.*;

public class InputPanel extends JPanel{
    private JPanel topPanel;
    private JPanel botPanel;
    public JTextField membershipNumField;

    private String membershipNum;
    private int stamps;

    public JButton back = new JButton("Back");
    public JButton confirm = new JButton("Confirm");
    public InputPanel(){
        init();
    }
    public void init(){
        topPanel = new JPanel();
        botPanel = new JPanel();
        //set the top panel
        topPanel.setBorder(BorderFactory.createTitledBorder(""));
        topPanel.setLayout(new GridBagLayout());
        JLabel lab1 = new JLabel("Please input your membership number",JLabel.CENTER);
        membershipNumField = new JTextField();
        membershipNumField.setPreferredSize(new Dimension(300,40));
        Font font1 = new Font("Times new Roman",Font.BOLD,25);
        lab1.setFont(font1);
        GridBagConstraints top = new GridBagConstraints();
        top.fill = GridBagConstraints.BOTH;
        top.gridx = 0;
        top.gridy = 0;
        top.gridheight = 1;
        top.gridwidth = 2;
        top.weightx = 1;
        top.weighty = 0.2;
        topPanel.add(lab1,top);

        top.fill = GridBagConstraints.CENTER;
        top.gridy = 1;
        top.gridx = 0;
        top.weightx = 0.32;
        top.anchor = GridBagConstraints.NORTH;
        top.gridwidth = 1;
        top.weightx = 0.8;
        topPanel.add(membershipNumField,top);

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
