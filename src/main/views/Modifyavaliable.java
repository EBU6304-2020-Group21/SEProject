package main.views;

import main.controller.MenuController;
import main.entity.MenuAvailablity;

import javax.swing.*;
import java.awt.*;

import javax.swing.JRadioButton.*;

public class Modifyavaliable extends JPanel {
    private JPanel topPanel;
    private JPanel botPanel;
    public JButton back = new JButton("Back");
    public JButton confirm = new JButton("Confirm");
    public JRadioButton RamenAvaliable = new JRadioButton("√");
    public JRadioButton RamenUnavaliable = new JRadioButton("×");
    public JRadioButton TonkostuAvaliable = new JRadioButton("√");
    public JRadioButton TonkostuUnavaliable = new JRadioButton("×");
    public JRadioButton ShoyuAvaliable = new JRadioButton("√");
    public JRadioButton ShoyuUnavaliable = new JRadioButton("×");
    public JRadioButton ShioAvaliable = new JRadioButton("√");
    public JRadioButton ShioUnavaliable = new JRadioButton("×");
    public JRadioButton NoriAvaliable = new JRadioButton("√");
    public JRadioButton NoriUnavaliable = new JRadioButton("×");
    public JRadioButton ChashuAvaliable = new JRadioButton("√");
    public JRadioButton ChashuUnavaliable = new JRadioButton("×");
    public JRadioButton BoiledeggAvaliable = new JRadioButton("√");
    public JRadioButton BoiledeggUnavaliable = new JRadioButton("×");
    public JRadioButton BambooshootsAvaliable = new JRadioButton("√");
    public JRadioButton BambooshootsUnavaliable = new JRadioButton("×");
    public MenuAvailablity menuAvailablity;
    public Modifyavaliable() {
        init();
    }

    public void init() {
        topPanel = new JPanel();
        botPanel = new JPanel();
        //Initialize
        menuAvailablity = MenuController.getMenuAvailabilityInfo();
        RamenAvaliable.setSelected(menuAvailablity.isRamenAvailable());
        RamenUnavaliable.setSelected(!menuAvailablity.isRamenAvailable());
        TonkostuAvaliable.setSelected(menuAvailablity.isTonkotsuAvailable());
        TonkostuUnavaliable.setSelected(!menuAvailablity.isTonkotsuAvailable());
        ShoyuAvaliable.setSelected(menuAvailablity.isShoyuAvailable());
        ShoyuUnavaliable.setSelected(!menuAvailablity.isShoyuAvailable());
        ShioAvaliable.setSelected(menuAvailablity.isShioAvailable());
        ShioUnavaliable.setSelected(!menuAvailablity.isShioAvailable());
        NoriAvaliable.setSelected(menuAvailablity.isNoriAvailable());
        NoriUnavaliable.setSelected(!menuAvailablity.isNoriAvailable());
        ChashuAvaliable.setSelected(menuAvailablity.isChashuAvailable());
        ChashuUnavaliable.setSelected(!menuAvailablity.isChashuAvailable());
        BambooshootsAvaliable.setSelected(menuAvailablity.isBamShootAvailable());
        BambooshootsUnavaliable.setSelected(!menuAvailablity.isBamShootAvailable());
        BoiledeggAvaliable.setSelected(menuAvailablity.isBoilEggAvailable());
        BoiledeggUnavaliable.setSelected(!menuAvailablity.isBoilEggAvailable());
        //set the top Panel
        JLabel lab0 = new JLabel("Options");
        JLabel lab1 = new JLabel("Tonkotsu");
        JLabel lab2 = new JLabel("Shoyu");
        JLabel lab3 = new JLabel("Shio");
        JLabel lab4 = new JLabel("Nori");
        JLabel lab5 = new JLabel("Chashu");
        JLabel lab6 = new JLabel("Boiled egg");
        JLabel lab7 = new JLabel("Avaliable");
        JLabel lab8 = new JLabel("Unavaliable");
        JLabel lab9 = new JLabel("Bamboo shoots");
        JLabel lab10 = new JLabel("Ramen");

        Font font1 = new Font("Times new Roman", Font.BOLD, 30);
        Font font2 = new Font("Times new Roman", Font.PLAIN, 25);

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
        RamenAvaliable.setFont(font2);
        RamenUnavaliable.setFont(font2);
        TonkostuAvaliable.setFont(font2);
        TonkostuUnavaliable.setFont(font2);
        ShoyuAvaliable.setFont(font2);
        ShoyuUnavaliable.setFont(font2);
        ShioAvaliable.setFont(font2);
        ShioUnavaliable.setFont(font2);
        NoriAvaliable.setFont(font2);
        NoriUnavaliable.setFont(font2);
        ChashuAvaliable.setFont(font2);
        ChashuUnavaliable.setFont(font2);
        BoiledeggAvaliable.setFont(font2);
        BoiledeggUnavaliable.setFont(font2);
        BambooshootsAvaliable.setFont(font2);
        BambooshootsUnavaliable.setFont(font2);
        ButtonGroup bg1 = new ButtonGroup();
        bg1.add(RamenAvaliable);
        bg1.add(RamenUnavaliable);
        ButtonGroup bg2 = new ButtonGroup();
        bg2.add(TonkostuAvaliable);
        bg2.add(TonkostuUnavaliable);
        ButtonGroup bg3 = new ButtonGroup();
        bg3.add(ShoyuAvaliable);
        bg3.add(ShoyuUnavaliable);
        ButtonGroup bg4 = new ButtonGroup();
        bg4.add(ShioAvaliable);
        bg4.add(ShioUnavaliable);
        ButtonGroup bg5 = new ButtonGroup();
        bg5.add(NoriAvaliable);
        bg5.add(NoriUnavaliable);
        ButtonGroup bg6 = new ButtonGroup();
        bg6.add(ChashuAvaliable);
        bg6.add(ChashuUnavaliable);
        ButtonGroup bg7 = new ButtonGroup();
        bg7.add(BoiledeggAvaliable);
        bg7.add(BoiledeggUnavaliable);
        ButtonGroup bg8 = new ButtonGroup();
        bg8.add(BambooshootsAvaliable);
        bg8.add(BambooshootsUnavaliable);

        topPanel.setLayout(new GridBagLayout());
        GridBagConstraints top = new GridBagConstraints();
        top.fill = GridBagConstraints.CENTER;
        top.gridx = 0;
        top.gridy = 0;
        top.gridheight = 1;
        top.gridwidth = 1;
        top.weightx = 0.4;
        top.weighty = 0.3;
        topPanel.add(lab0, top);


        top.gridy = 1;
        top.weighty = 0.1;
        topPanel.add(lab10, top);

        top.gridy = 2;
        top.weighty = 0.1;
        topPanel.add(lab1, top);

        top.gridy = 3;
        top.weighty = 0.1;
        topPanel.add(lab2, top);

        top.gridy = 4;
        top.weighty = 0.1;
        topPanel.add(lab3, top);

        top.gridy = 5;
        top.weighty = 0.1;
        topPanel.add(lab4, top);

        top.gridy = 6;
        top.weighty = 0.1;
        topPanel.add(lab5, top);

        top.gridy = 7;
        top.weighty = 0.1;
        topPanel.add(lab6, top);

        top.gridy = 8;
        top.weighty = 0.1;
        topPanel.add(lab9, top);

        top.gridx = 1;
        top.gridy = 0;
        top.gridheight = 1;
        top.gridwidth = 1;
        top.weightx = 0.3;
        top.weighty = 0.3;
        topPanel.add(lab7, top);

        top.gridy = 1;
        top.weighty = 0.1;
        topPanel.add(RamenAvaliable, top);

        top.gridy = 2;
        top.weighty = 0.1;
        topPanel.add(TonkostuAvaliable, top);


        top.gridy = 3;
        top.weighty = 0.1;
        topPanel.add(ShoyuAvaliable, top);

        top.gridy = 4;
        top.weighty = 0.1;
        topPanel.add(ShioAvaliable, top);

        top.gridy = 5;
        top.weighty = 0.1;
        topPanel.add(NoriAvaliable, top);

        top.gridy = 6;
        top.weighty = 0.1;
        topPanel.add(ChashuAvaliable, top);

        top.gridy = 7;
        top.weighty = 0.1;
        topPanel.add(BoiledeggAvaliable, top);

        top.gridy = 8;
        top.weighty = 0.1;
        topPanel.add(BambooshootsAvaliable, top);


        top.gridx = 2;
        top.gridy = 0;
        top.gridheight = 1;
        top.gridwidth = 1;
        top.weightx = 0.3;
        top.weighty = 0.3;
        topPanel.add(lab8, top);

        top.gridy = 1;
        top.weighty = 0.1;
        topPanel.add(RamenUnavaliable, top);

        top.gridy = 2;
        top.weighty = 0.1;
        topPanel.add(TonkostuUnavaliable, top);

        top.gridy = 3;
        top.weighty = 0.1;
        topPanel.add(ShoyuUnavaliable, top);

        top.gridy = 4;
        top.weighty = 0.1;
        topPanel.add(ShioUnavaliable, top);

        top.gridy = 5;
        top.weighty = 0.1;
        topPanel.add(NoriUnavaliable, top);

        top.gridy = 6;
        top.weighty = 0.1;
        topPanel.add(ChashuUnavaliable, top);

        top.gridy = 7;
        top.weighty = 0.1;
        topPanel.add(BoiledeggUnavaliable, top);

        top.gridy = 8;
        top.weighty = 0.1;
        topPanel.add(BambooshootsUnavaliable, top);


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

