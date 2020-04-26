package main.views;

import sun.util.locale.provider.AvailableLanguageTags;

import javax.swing.*;
import java.awt.*;

import javax.swing.JRadioButton.*;

public class ModifyPanel extends JPanel{
    private JPanel topPanel;
    private JPanel botPanel;
    public JButton back = new JButton("Back");
    public JButton confirm = new JButton("Confirm");
    public JRadioButton ModifyPrice = new JRadioButton("Modify the price");
    public JRadioButton AvaUnava = new JRadioButton("avaliable/unavaliable");
    public ModifyPanel() {init();}
    public void init() {


        topPanel = new JPanel();
        botPanel = new JPanel();
        //set the top Panel
        JLabel lab1 = new JLabel("Modify the menu");
        Font font1 = new Font("Times new Roman",Font.BOLD,30);
        Font font2 = new Font("Times new Roman",Font.PLAIN,25);
        ButtonGroup bg = new ButtonGroup();
        bg.add(ModifyPrice);
        bg.add(AvaUnava);
        ModifyPrice.setFont(font2);
        AvaUnava.setFont(font2);
        lab1.setFont(font1);

        topPanel.setLayout(new GridBagLayout());
        GridBagConstraints top = new GridBagConstraints();
        top.fill = GridBagConstraints.CENTER;
        top.gridx = 0;
        top.gridy = 0;
        top.gridheight = 1;
        top.gridwidth = 1;
        top.weightx = 1;
        top.weighty = 0.4;
        topPanel.add(lab1,top);

        top.gridy = 1;
        top.weighty = 0.3;
        topPanel.add(ModifyPrice,top);

        top.gridy = 2;
        top.weighty = 0.3;
        topPanel.add(AvaUnava,top);
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


