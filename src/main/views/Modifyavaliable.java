package main.views;

import javax.swing.*;
import java.awt.*;

import javax.swing.JRadioButton.*;

public class Modifyavaliable extends JPanel{
    private JPanel topPanel;
    private JPanel botPanel;
    public JButton back = new JButton("Back");
    public JButton confirm = new JButton("Confirm");

    public Modifyavaliable() {
        init();
    }

    public void init() {
        topPanel = new JPanel();
        botPanel = new JPanel();
        //set the top Panel
        JLabel lab0 = new JLabel("Options");
        JLabel lab1 = new JLabel("Tonkotsu");
        JLabel lab2 = new JLabel("Shoyu");
        JLabel lab3 = new JLabel("Shio");
        JLabel lab4 = new JLabel("Nori");
        JLabel lab5 = new JLabel("Chashu");
        JLabel lab6 = new JLabel("Boiled egg");
        JLabel lab7 = new JLabel("avaliable");
        JLabel lab8 = new JLabel("unavaliable");
        JLabel lab9 = new JLabel("Bamboo shoots");
        JLabel lab10 = new JLabel("Ramen");

        Font font1 = new Font("Times new Roman",Font.BOLD,30);
        Font font2 = new Font("Times new Roman",Font.PLAIN,25);
        JRadioButton but1 = new JRadioButton("√");
        JRadioButton but2 = new JRadioButton("×");
        JRadioButton but3 = new JRadioButton("√");
        JRadioButton but4 = new JRadioButton("×");
        JRadioButton but5 = new JRadioButton("√");
        JRadioButton but6 = new JRadioButton("×");
        JRadioButton but7 = new JRadioButton("√");
        JRadioButton but8 = new JRadioButton("×");
        JRadioButton but9 = new JRadioButton("√");
        JRadioButton but10 = new JRadioButton("×");
        JRadioButton but11 = new JRadioButton("√");
        JRadioButton but12 = new JRadioButton("×");
        JRadioButton but13 = new JRadioButton("√");
        JRadioButton but14 = new JRadioButton("×");
        JRadioButton but15 = new JRadioButton("√");
        JRadioButton but16 = new JRadioButton("×");
        lab0.setFont(font1);
        lab10.setFont(font2);
        lab7.setFont(font1);
        lab8.setFont(font1);
        lab9.setFont(font2);
        lab1.setFont(font2);
        lab2.setFont(font2);
        lab3.setFont(font2);
        lab4.setFont(font2);
        lab5.setFont(font2);
        lab6.setFont(font2);
        but1.setFont(font2);
        but2.setFont(font2);
        but3.setFont(font2);
        but4.setFont(font2);
        but5.setFont(font2);
        but6.setFont(font2);
        but7.setFont(font2);
        but8.setFont(font2);
        but9.setFont(font2);
        but10.setFont(font2);
        but11.setFont(font2);
        but12.setFont(font2);
        but13.setFont(font2);
        but14.setFont(font2);
        but15.setFont(font2);
        but16.setFont(font2);
        ButtonGroup bg1 = new ButtonGroup();
        bg1.add(but1);
        bg1.add(but2);
        ButtonGroup bg2 = new ButtonGroup();
        bg2.add(but3);
        bg2.add(but4);
        ButtonGroup bg3 = new ButtonGroup();
        bg3.add(but5);
        bg3.add(but6);
        ButtonGroup bg4 = new ButtonGroup();
        bg4.add(but7);
        bg4.add(but8);
        ButtonGroup bg5 = new ButtonGroup();
        bg5.add(but9);
        bg5.add(but10);
        ButtonGroup bg6 = new ButtonGroup();
        bg6.add(but11);
        bg6.add(but12);
        ButtonGroup bg7 = new ButtonGroup();
        bg7.add(but13);
        bg7.add(but14);
        ButtonGroup bg8 = new ButtonGroup();
        bg8.add(but15);
        bg8.add(but16);

        topPanel.setLayout(new GridBagLayout());
        GridBagConstraints top = new GridBagConstraints();
        top.fill = GridBagConstraints.CENTER;
        top.gridx = 0;
        top.gridy = 0;
        top.gridheight = 1;
        top.gridwidth = 1;
        top.weightx = 0.4;
        top.weighty = 0.3;
        topPanel.add(lab0,top);

        top.gridy = 1;
        top.weighty = 0.1;
        topPanel.add(lab10,top);

        top.gridy = 2;
        top.weighty = 0.1;
        topPanel.add(lab1,top);

        top.gridy = 3;
        top.weighty = 0.1;
        topPanel.add(lab2,top);

        top.gridy = 4;
        top.weighty = 0.1;
        topPanel.add(lab3,top);

        top.gridy = 5;
        top.weighty = 0.1;
        topPanel.add(lab4,top);

        top.gridy = 6;
        top.weighty = 0.1;
        topPanel.add(lab5,top);

        top.gridy = 7;
        top.weighty = 0.1;
        topPanel.add(lab6,top);

        top.gridy = 8;
        top.weighty = 0.1;
        topPanel.add(lab9,top);

        top.gridx = 1;
        top.gridy = 0;
        top.gridheight = 1;
        top.gridwidth = 1;
        top.weightx = 0.3;
        top.weighty = 0.3;
        topPanel.add(lab7,top);

        top.gridy =1;
        top.weighty = 0.1;
        topPanel.add(but1,top);

        top.gridy =2;
        top.weighty = 0.1;
        topPanel.add(but3,top);

        top.gridy =3;
        top.weighty = 0.1;
        topPanel.add(but5,top);

        top.gridy =4;
        top.weighty = 0.1;
        topPanel.add(but7,top);

        top.gridy =5;
        top.weighty = 0.1;
        topPanel.add(but9,top);

        top.gridy =6;
        top.weighty = 0.1;
        topPanel.add(but11,top);

        top.gridy =7;
        top.weighty = 0.1;
        topPanel.add(but13,top);

        top.gridy =8;
        top.weighty = 0.1;
        topPanel.add(but15,top);


        top.gridx = 2;
        top.gridy = 0;
        top.gridheight = 1;
        top.gridwidth = 1;
        top.weightx = 0.3;
        top.weighty = 0.3;
        topPanel.add(lab8,top);

        top.gridy =1;
        top.weighty = 0.1;
        topPanel.add(but2,top);

        top.gridy =2;
        top.weighty = 0.1;
        topPanel.add(but4,top);

        top.gridy =3;
        top.weighty = 0.1;
        topPanel.add(but6,top);

        top.gridy =4;
        top.weighty = 0.1;
        topPanel.add(but8,top);

        top.gridy =5;
        top.weighty = 0.1;
        topPanel.add(but10,top);

        top.gridy =6;
        top.weighty = 0.1;
        topPanel.add(but12,top);

        top.gridy =7;
        top.weighty = 0.1;
        topPanel.add(but14,top);

        top.gridy =8;
        top.weighty = 0.1;
        topPanel.add(but16,top);


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

