package main.views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StatPanel extends JPanel{
    public JButton back = new JButton("Back");
    public JButton confirm = new JButton("Confirm");
    private JPanel topPanel;
    private JPanel botPanel;
    private JPanel midPanel;
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
    public int tonkotsuNum;
    public int shoyuNum;
    public int shioNum;
    public int softNum;
    public int mediumNum;
    public int firmNum;
    public int noNum;
    public int justNum;
    public int lotNum;
    public int noriyesNum;
    public int norinoNum;
    public int chashuyesNum;
    public int chashunoNum;
    public int eggyesNum;
    public int eggnoNum;
    public int spi0;
    public int spi1;
    public int spi2;
    public int spi3;
    public int spi4;
    public int spi5;
    public int extraNoriNum;
    public int extraEggNum;
    public int extraBambooNum;
    public int extraChashuNum;
    public StatPanel(){
        init();
    }
    public void init(){
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
        tonkotsuLabel = new JLabel("Tonkotsu: "+tonkotsuNum);
        shoyuLabel = new JLabel("Shoyu: "+shoyuNum);
        shioLabel = new JLabel("Shio: "+shioNum);
        softLabel = new JLabel("Soft: "+softNum);
        mediumLabel = new JLabel("medium: "+mediumNum);
        firmLabel = new JLabel("Firm: "+firmNum);
        noLabel = new JLabel("No: "+noNum);
        justLabel = new JLabel("Little: "+justNum);
        lotLabel = new JLabel("Lot: "+lotNum);
        noriyesLabel = new JLabel("Yes: "+noriyesNum);
        norinoLabel = new JLabel("No: "+norinoNum);
        chashuyesLabel = new JLabel("Yes: "+chashuyesNum);
        chashunoLabel = new JLabel("No: "+chashunoNum);
        eggyesLabel = new JLabel("Yes: "+ eggyesNum);
        eggnoLabel = new JLabel("No: "+eggnoNum);
        mostSpiLabel = new JLabel(String.valueOf(getMostSpi(spi0,spi1,spi2,spi3,spi4,spi5)));
        extraNoriLabel = new JLabel("Extra Nori: "+extraNoriNum);
        extraEggLabel = new JLabel("Extra boiled egg: "+extraEggNum);
        extraBambooLabel = new JLabel("Bamboo shoots: "+extraBambooNum);
        extraChashuLabel = new JLabel("Extra Chashu: "+extraChashuNum);
        extraNoriLabel.setFont(foodTypeFont);
        extraEggLabel.setFont(foodTypeFont);
        extraBambooLabel.setFont(foodTypeFont);
        extraChashuLabel.setFont(foodTypeFont);

        mid.fill = GridBagConstraints.BOTH;
        mid.anchor=GridBagConstraints.WEST;
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
        defaultP.add(spi,mid);

        mid.gridx = 1;
        mid.weightx = 0.75;
        mid.gridwidth = 3;
        defaultP.add(mostSpiLabel,mid);

        mid.gridx = 0;
        mid.gridy = 0;
        mid.gridwidth = 1;
        mid.gridheight = 1;
        mid.weightx = 1;
        mid.weighty = 0.25;
        addonP.add(extraNoriLabel,mid);

        mid.gridy = 1;
        addonP.add(extraEggLabel,mid);

        mid.gridy = 2;
        addonP.add(extraBambooLabel,mid);

        mid.gridy = 3;
        addonP.add(extraChashuLabel,mid);


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

    public int getMostSpi(int a,int b,int c,int d,int e,int f){
        int result;
        result = Math.max(Math.max(Math.max(Math.max(Math.max(a,b),c),d),e),f);
        if(result==a){
            return 0;
        }
        else if(result==b){
            return 1;
        }
        else if(result==c){
            return 2;
        }
        else if(result==d){
            return 3;
        }
        else if(result==e){
            return 4;
        }
        else {
            return 5;
        }
    }


}
