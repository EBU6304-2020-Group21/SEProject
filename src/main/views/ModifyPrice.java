package main.views;

import javax.swing.*;
import java.awt.*;

import javax.swing.JRadioButton.*;

public class ModifyPrice extends JPanel {
    private JPanel topPanel;
    private JPanel botPanel;
    public JButton back = new JButton("Back");
    public JButton confirm = new JButton("Confirm");

    public ModifyPrice() {
        init();
    }

    public void init() {
        topPanel = new JPanel();
        botPanel = new JPanel();
        //set the top Panel
        JLabel lab0 = new JLabel("Options");
        JLabel lab1 = new JLabel("Ramen");
        JLabel lab2 = new JLabel("Nori");
        JLabel lab3 = new JLabel("Boiled egg");
        JLabel lab4 = new JLabel("Bamboo shoots");
        JLabel lab5 = new JLabel("Chashu");
        JLabel lab6 = new JLabel("Previous price");
        JLabel lab7 = new JLabel("Now price");
        JLabel lab8 = new JLabel("£9.99");
        JLabel lab9 = new JLabel("£1");
        JLabel lab10 = new JLabel("£1");
        JLabel lab11 = new JLabel("£1");
        JLabel lab12 = new JLabel("£2");
        JTextField tf1 = new JTextField(6);
        JTextField tf2 = new JTextField(6);
        JTextField tf3 = new JTextField(6);
        JTextField tf4 = new JTextField(6);
        JTextField tf5 = new JTextField(6);
        Font font1 = new Font("Times new Roman", Font.BOLD, 30);
        Font font2 = new Font("Times new Roman", Font.PLAIN, 25);
        lab0.setFont(font1);
        lab6.setFont(font1);
        lab7.setFont(font1);
        lab1.setFont(font2);
        lab2.setFont(font2);
        lab3.setFont(font2);
        lab4.setFont(font2);
        lab5.setFont(font2);
        lab8.setFont(font2);
        lab9.setFont(font2);
        lab10.setFont(font2);
        lab11.setFont(font2);
        lab12.setFont(font2);

        topPanel.setLayout(new GridBagLayout());
        GridBagConstraints top = new GridBagConstraints();
        top.fill = GridBagConstraints.CENTER;
        top.gridx = 0;
        top.gridy = 0;
        top.gridheight = 1;
        top.gridwidth = 1;
        top.weightx = 0.4;
        top.weighty = 0.25;
        topPanel.add(lab0,top);

        top.gridy = 1;
        top.weighty = 0.15;
        topPanel.add(lab1,top);

        top.gridy = 2;
        top.weighty = 0.15;
        topPanel.add(lab2,top);

        top.gridy = 3;
        top.weighty = 0.15;
        topPanel.add(lab3,top);

        top.gridy = 4;
        top.weighty = 0.15;
        topPanel.add(lab4,top);

        top.gridy = 5;
        top.weighty = 0.15;
        topPanel.add(lab5,top);

        top.gridx = 1;
        top.gridy = 0;
        top.gridheight = 1;
        top.gridwidth = 1;
        top.weightx = 0.3;
        top.weighty = 0.25;
        topPanel.add(lab6,top);

        top.gridy = 1;
        top.weighty = 0.15;
        topPanel.add(lab8,top);

        top.gridy = 2;
        top.weighty = 0.15;
        topPanel.add(lab9,top);

        top.gridy = 3;
        top.weighty = 0.15;
        topPanel.add(lab10,top);

        top.gridy = 4;
        top.weighty = 0.15;
        topPanel.add(lab11,top);

        top.gridy = 5;
        top.weighty = 0.15;
        topPanel.add(lab12,top);

        top.gridx = 2;
        top.gridy = 0;
        top.gridheight = 1;
        top.gridwidth = 1;
        top.weightx = 0.3;
        top.weighty = 0.25;
        topPanel.add(lab7,top);

        top.gridy = 1;
        top.weighty = 0.15;
        topPanel.add(tf1,top);

        top.gridy = 2;
        top.weighty = 0.15;
        topPanel.add(tf2,top);

        top.gridy = 3;
        top.weighty = 0.15;
        topPanel.add(tf3,top);

        top.gridy = 4;
        top.weighty = 0.15;
        topPanel.add(tf4,top);

        top.gridy = 5;
        top.weighty = 0.15;
        topPanel.add(tf5,top);

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
