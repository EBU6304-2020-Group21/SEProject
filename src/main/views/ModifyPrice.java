package main.views;

import javax.swing.*;
import java.awt.*;

import javax.swing.JRadioButton.*;

public class ModifyPrice extends JPanel {
    private JPanel topPanel;
    private JPanel botPanel;
    public JButton back = new JButton("Back");
    public JButton confirm = new JButton("Confirm");
    public JLabel RamenOriginalPrice = new JLabel("£9.99");
    public JLabel NoriOriginalPrice = new JLabel("£1");
    public JLabel BoiledeggOriginalPrice = new JLabel("£1");
    public JLabel BambooshootsOriginalPrice = new JLabel("£1");
    public JLabel ChashuOriginalPrice = new JLabel("£2");
    public JTextField RamenNowPrice = new JTextField(6);
    public JTextField NoriNowPrice = new JTextField(6);
    public JTextField BoiledeggNowPrice = new JTextField(6);
    public JTextField BambooshootsNowPrice = new JTextField(6);
    public JTextField ChashuNowPrice = new JTextField(6);

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
        RamenOriginalPrice.setFont(font2);
        NoriOriginalPrice.setFont(font2);
        BoiledeggOriginalPrice.setFont(font2);
        BambooshootsOriginalPrice.setFont(font2);
        ChashuOriginalPrice.setFont(font2);


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
        topPanel.add(RamenOriginalPrice,top);

        top.gridy = 2;
        top.weighty = 0.15;
        topPanel.add(NoriOriginalPrice,top);

        top.gridy = 3;
        top.weighty = 0.15;
        topPanel.add(BoiledeggOriginalPrice,top);

        top.gridy = 4;
        top.weighty = 0.15;
        topPanel.add(BambooshootsOriginalPrice,top);

        top.gridy = 5;
        top.weighty = 0.15;
        topPanel.add(ChashuOriginalPrice,top);

        top.gridx = 2;
        top.gridy = 0;
        top.gridheight = 1;
        top.gridwidth = 1;
        top.weightx = 0.3;
        top.weighty = 0.25;
        topPanel.add(lab7,top);

        top.gridy = 1;
        top.weighty = 0.15;
        topPanel.add(RamenNowPrice,top);

        top.gridy = 2;
        top.weighty = 0.15;
        topPanel.add(NoriNowPrice,top);

        top.gridy = 3;
        top.weighty = 0.15;
        topPanel.add(BoiledeggNowPrice,top);

        top.gridy = 4;
        top.weighty = 0.15;
        topPanel.add(BambooshootsNowPrice,top);

        top.gridy = 5;
        top.weighty = 0.15;
        topPanel.add(ChashuNowPrice,top);

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
