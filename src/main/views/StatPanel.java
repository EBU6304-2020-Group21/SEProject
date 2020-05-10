package main.views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StatPanel extends JPanel {
    public JButton back = new JButton("Back");
    public JButton confirm = new JButton("Confirm");
    public JPanel topPanel;
    public JPanel botPanel;
    public JPanel midPanel;
    public JLabel tonkotsuLabel;
    public JLabel shoyuLabel;
    public JLabel shioLabel;
    public JLabel softLabel;
    public JLabel mediumLabel;
    public JLabel firmLabel;
    public JLabel noLabel;
    public JLabel justLabel;
    public JLabel lotLabel;
    public JLabel noriyesLabel;
    public JLabel norinoLabel;
    public JLabel chashuyesLabel;
    public JLabel chashunoLabel;
    public JLabel eggyesLabel;
    public JLabel eggnoLabel;
    public JLabel mostSpiLabel;
    public JLabel extraNoriLabel;
    public JLabel extraEggLabel;
    public JLabel extraBambooLabel;
    public JLabel extraChashuLabel;
    private int tonkotsuNum;
    private int shoyuNum;
    private int shioNum;
    private int softNum;
    private int mediumNum;
    private int firmNum;
    private int noNum;
    private int justNum;
    private int lotNum;
    private int noriyesNum;
    private int norinoNum;
    private int chashuyesNum;
    private int chashunoNum;
    private int eggyesNum;
    private int eggnoNum;
    private int spi0;
    private int spi1;
    private int spi2;
    private int spi3;
    private int spi4;
    private int spi5;
    private int extraNoriNum;
    private int extraEggNum;
    private int extraBambooNum;
    private int extraChashuNum;

    public StatPanel(int tonkotsuNum,
                     int shoyuNum, int shioNum, int softNum, int mediumNum, int firmNum, int noNum, int justNum, int lotNum,
                     int noriyesNum, int norinoNum, int chashuyesNum, int chashunoNum, int eggyesNum, int eggnoNum, int spi0,
                     int spi1, int spi2, int spi3, int spi4, int spi5, int extraNoriNum, int extraEggNum, int extraBambooNum,
                     int extraChashuNum) {
        this.setTonkotsuNum(tonkotsuNum);
        this.setShoyuNum(shoyuNum);
        this.setShioNum(shioNum);
        this.setSoftNum(softNum);
        this.setMediumNum(mediumNum);
        this.setFirmNum(firmNum);
        this.setNoNum(noNum);
        this.setJustNum(justNum);
        this.setLotNum(lotNum);
        this.setNoriyesNum(noriyesNum);
        this.setNorinoNum(norinoNum);
        this.setChashuyesNum(chashuyesNum);
        this.setChashunoNum(chashunoNum);
        this.setEggyesNum(eggyesNum);
        this.setEggnoNum(eggnoNum);
        this.setSpi0(spi0);
        this.setSpi1(spi1);
        this.setSpi2(spi2);
        this.setSpi3(spi3);
        this.setSpi4(spi4);
        this.setSpi5(spi5);
        this.setExtraNoriNum(extraNoriNum);
        this.setExtraEggNum(extraEggNum);
        this.setExtraBambooNum(extraBambooNum);
        this.setExtraChashuNum(extraChashuNum);
        init();
    }

    public void init() {
        topPanel = new JPanel();
        midPanel = new JPanel();
        botPanel = new JPanel();
        Font titleFont = new Font("Times New Roman", Font.BOLD, 25);
        Font foodTypeFont = new Font("Times New Roman", Font.BOLD, 18);
        //set the top panel
        JLabel report = new JLabel("Report");
        report.setFont(titleFont);
        topPanel.add(report);
        //set the mid panel
        midPanel.setLayout(new GridBagLayout());
        midPanel.setBorder(BorderFactory.createTitledBorder(""));
        GridBagConstraints mid = new GridBagConstraints();
        JLabel soup = new JLabel("Soup");
        JLabel noodles = new JLabel("Noodles");
        JLabel spring = new JLabel("<html><body>Spring<br>onion<body></html>");
        JLabel nori = new JLabel("Nori");
        JLabel chashu = new JLabel("Chashu");
        JLabel egg = new JLabel("<html><body>Boiled<br>egg<body></html>");
        JLabel spi = new JLabel("The most popular level of spiciness is :");
        soup.setFont(foodTypeFont);
        noodles.setFont(foodTypeFont);
        spring.setFont(foodTypeFont);
        nori.setFont(foodTypeFont);
        chashu.setFont(foodTypeFont);
        egg.setFont(foodTypeFont);
        spi.setFont(foodTypeFont);
        JPanel defaultP = new JPanel();
        JPanel addonP = new JPanel();
        defaultP.setBorder(BorderFactory.createLoweredBevelBorder());
        addonP.setBorder(BorderFactory.createLoweredBevelBorder());
        defaultP.setLayout(new GridBagLayout());
        addonP.setLayout(new GridBagLayout());
        GridBagConstraints def = new GridBagConstraints();
        GridBagConstraints addon = new GridBagConstraints();
        tonkotsuLabel = new JLabel("Tonkotsu: " + tonkotsuNum);
        shoyuLabel = new JLabel("Shoyu: " + shoyuNum);
        shioLabel = new JLabel("Shio: " + shioNum);
        softLabel = new JLabel("Soft: " + softNum);
        mediumLabel = new JLabel("medium: " + mediumNum);
        firmLabel = new JLabel("Firm: " + firmNum);
        noLabel = new JLabel("No: " + noNum);
        justLabel = new JLabel("Little: " + justNum);
        lotLabel = new JLabel("Lot: " + lotNum);
        noriyesLabel = new JLabel("Yes: " + noriyesNum);
        norinoLabel = new JLabel("No: " + norinoNum);
        chashuyesLabel = new JLabel("Yes: " + chashuyesNum);
        chashunoLabel = new JLabel("No: " + chashunoNum);
        eggyesLabel = new JLabel("Yes: " + eggyesNum);
        eggnoLabel = new JLabel("No: " + eggnoNum);
        mostSpiLabel = new JLabel(String.valueOf(getMostSpi(spi0, spi1, spi2, spi3, spi4, spi5)));
        extraNoriLabel = new JLabel("Extra Nori: " + extraNoriNum);
        extraEggLabel = new JLabel("Extra boiled egg: " + extraEggNum);
        extraBambooLabel = new JLabel("Bamboo shoots: " + extraBambooNum);
        extraChashuLabel = new JLabel("Extra Chashu: " + extraChashuNum);
        extraNoriLabel.setFont(foodTypeFont);
        extraEggLabel.setFont(foodTypeFont);
        extraBambooLabel.setFont(foodTypeFont);
        extraChashuLabel.setFont(foodTypeFont);

        mid.fill = GridBagConstraints.BOTH;
        mid.anchor = GridBagConstraints.WEST;
        mid.gridx = 0;
        mid.gridy = 0;
        mid.gridwidth = 1;
        mid.gridheight = 1;
        mid.weightx = 0.25;
        mid.weighty = 0.15;
        defaultP.add(soup, mid);

        mid.gridx = 1;
        defaultP.add(tonkotsuLabel, mid);

        mid.gridx = 2;
        defaultP.add(shoyuLabel, mid);

        mid.gridx = 3;
        defaultP.add(shioLabel, mid);

        mid.gridx = 0;
        mid.gridy = 1;
        defaultP.add(noodles, mid);

        mid.gridx = 1;
        defaultP.add(softLabel, mid);

        mid.gridx = 2;
        defaultP.add(mediumLabel, mid);

        mid.gridx = 3;
        defaultP.add(firmLabel, mid);

        mid.gridx = 0;
        mid.gridy = 2;
        defaultP.add(spring, mid);

        mid.gridx = 1;
        defaultP.add(noLabel, mid);

        mid.gridx = 2;
        defaultP.add(justLabel, mid);

        mid.gridx = 3;
        defaultP.add(lotLabel, mid);

        mid.gridx = 0;
        mid.gridy = 3;
        defaultP.add(nori, mid);

        mid.gridx = 1;
        mid.weightx = 0.5;
        mid.gridwidth = 2;
        defaultP.add(noriyesLabel, mid);

        mid.gridx = 3;
        mid.weightx = 0.25;
        mid.gridwidth = 1;
        defaultP.add(norinoLabel, mid);

        mid.gridx = 0;
        mid.gridy = 4;
        defaultP.add(chashu, mid);

        mid.gridx = 1;
        mid.weightx = 0.5;
        mid.gridwidth = 2;
        defaultP.add(chashuyesLabel, mid);

        mid.gridx = 3;
        mid.weightx = 0.25;
        mid.gridwidth = 1;
        defaultP.add(chashunoLabel, mid);

        mid.gridx = 0;
        mid.gridy = 5;
        defaultP.add(egg, mid);

        mid.gridx = 1;
        mid.weightx = 0.5;
        mid.gridwidth = 2;
        defaultP.add(eggyesLabel, mid);

        mid.gridx = 3;
        mid.weightx = 0.25;
        mid.gridwidth = 1;
        defaultP.add(eggnoLabel, mid);


        mid.gridx = 0;
        mid.gridy = 6;
        mid.weightx = 0.25;
        mid.weighty = 0.1;
        mid.gridwidth = 1;
        defaultP.add(spi, mid);

        mid.gridx = 1;
        mid.weightx = 0.75;
        mid.gridwidth = 3;
        defaultP.add(mostSpiLabel, mid);

        mid.gridx = 0;
        mid.gridy = 0;
        mid.gridwidth = 1;
        mid.gridheight = 1;
        mid.weightx = 1;
        mid.weighty = 0.25;
        addonP.add(extraNoriLabel, mid);

        mid.gridy = 1;
        addonP.add(extraEggLabel, mid);

        mid.gridy = 2;
        addonP.add(extraBambooLabel, mid);

        mid.gridy = 3;
        addonP.add(extraChashuLabel, mid);


        mid.fill = GridBagConstraints.BOTH;
        mid.anchor = GridBagConstraints.CENTER;
        mid.gridx = 0;
        mid.gridy = 0;
        mid.weightx = 0.65;
        mid.weighty = 1;
        midPanel.add(defaultP, mid);
        mid.weightx = 0.35;
        mid.gridx = 1;
        midPanel.add(addonP, mid);
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
        c.weighty = 0.05;
        this.add(topPanel, c);
        c.gridy = 1;
        c.weighty = 0.8;
        this.add(midPanel, c);
        c.gridy = 2;
        c.weighty = 0.15;
        this.add(botPanel, c);
    }

    public int getMostSpi(int a, int b, int c, int d, int e, int f) {
        int result;
        result = Math.max(Math.max(Math.max(Math.max(Math.max(a, b), c), d), e), f);
        if (result == a) {
            return 0;
        } else if (result == b) {
            return 1;
        } else if (result == c) {
            return 2;
        } else if (result == d) {
            return 3;
        } else if (result == e) {
            return 4;
        } else {
            return 5;
        }
    }


    public int getTonkotsuNum() {
        return tonkotsuNum;
    }

    public int getShoyuNum() {
        return shoyuNum;
    }

    public int getShioNum() {
        return shioNum;
    }

    public int getSoftNum() {
        return softNum;
    }

    public int getMediumNum() {
        return mediumNum;
    }

    public int getFirmNum() {
        return firmNum;
    }

    public int getNoNum() {
        return noNum;
    }

    public int getJustNum() {
        return justNum;
    }

    public int getLotNum() {
        return lotNum;
    }

    public int getNoriyesNum() {
        return noriyesNum;
    }

    public int getNorinoNum() {
        return norinoNum;
    }

    public int getChashuyesNum() {
        return chashuyesNum;
    }

    public int getChashunoNum() {
        return chashunoNum;
    }

    public int getEggyesNum() {
        return eggyesNum;
    }

    public int getEggnoNum() {
        return eggnoNum;
    }

    public int getSpi0() {
        return spi0;
    }

    public int getSpi1() {
        return spi1;
    }

    public int getSpi2() {
        return spi2;
    }

    public int getSpi3() {
        return spi3;
    }

    public int getSpi4() {
        return spi4;
    }

    public int getSpi5() {
        return spi5;
    }

    public int getExtraNoriNum() {
        return extraNoriNum;
    }

    public int getExtraEggNum() {
        return extraEggNum;
    }

    public int getExtraBambooNum() {
        return extraBambooNum;
    }

    public int getExtraChashuNum() {
        return extraChashuNum;
    }

    public void setTonkotsuNum(int tonkotsuNum) {
        this.tonkotsuNum = tonkotsuNum;
    }

    public void setShoyuNum(int shoyuNum) {
        this.shoyuNum = shoyuNum;
    }

    public void setShioNum(int shioNum) {
        this.shioNum = shioNum;
    }

    public void setSoftNum(int softNum) {
        this.softNum = softNum;
    }

    public void setMediumNum(int mediumNum) {
        this.mediumNum = mediumNum;
    }

    public void setFirmNum(int firmNum) {
        this.firmNum = firmNum;
    }

    public void setNoNum(int noNum) {
        this.noNum = noNum;
    }

    public void setJustNum(int justNum) {
        this.justNum = justNum;
    }

    public void setLotNum(int lotNum) {
        this.lotNum = lotNum;
    }

    public void setNoriyesNum(int noriyesNum) {
        this.noriyesNum = noriyesNum;
    }

    public void setNorinoNum(int norinoNum) {
        this.norinoNum = norinoNum;
    }

    public void setChashuyesNum(int chashuyesNum) {
        this.chashuyesNum = chashuyesNum;
    }

    public void setChashunoNum(int chashunoNum) {
        this.chashunoNum = chashunoNum;
    }

    public void setEggyesNum(int eggyesNum) {
        this.eggyesNum = eggyesNum;
    }

    public void setEggnoNum(int eggnoNum) {
        this.eggnoNum = eggnoNum;
    }

    public void setSpi0(int spi0) {
        this.spi0 = spi0;
    }

    public void setSpi1(int spi1) {
        this.spi1 = spi1;
    }

    public void setSpi2(int spi2) {
        this.spi2 = spi2;
    }

    public void setSpi3(int spi3) {
        this.spi3 = spi3;
    }

    public void setSpi4(int spi4) {
        this.spi4 = spi4;
    }

    public void setSpi5(int spi5) {
        this.spi5 = spi5;
    }

    public void setExtraNoriNum(int extraNoriNum) {
        this.extraNoriNum = extraNoriNum;
    }

    public void setExtraEggNum(int extraEggNum) {
        this.extraEggNum = extraEggNum;
    }

    public void setExtraBambooNum(int extraBambooNum) {
        this.extraBambooNum = extraBambooNum;
    }

    public void setExtraChashuNum(int extraChashuNum) {
        this.extraChashuNum = extraChashuNum;
    }
}
