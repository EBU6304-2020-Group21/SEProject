package main.views;

import javax.swing.*;
import java.awt.*;

public class FreePanel extends JPanel{
    private JPanel topPanel;
    private JPanel botPanel;

    private int stamps;
    public JButton back = new JButton("Back");
    public JButton confirm = new JButton("Confirm");
    public FreePanel(int stamps){
        this.stamps = stamps;
        init();
    }
    public void init(){
        topPanel = new JPanel();
        botPanel = new JPanel();
        //set the top panel
        topPanel.setBorder(BorderFactory.createTitledBorder(""));
        topPanel.setLayout(new GridBagLayout());
        JLabel lab1 = new JLabel("Your virtual stamps amount is: ",JLabel.CENTER);
        JLabel lab3 = new JLabel("You will get a free charge!!",JLabel.CENTER);
        JLabel lab2 = new JLabel("10",JLabel.CENTER);
        Font font1 = new Font("Arial",Font.BOLD,25);
        Font font2 = new Font("Arial",Font.BOLD,40);
        lab1.setFont(font1);
        lab3.setFont(font1);
        lab2.setFont(font2);
        lab2.setForeground(Color.RED);

        GridBagConstraints top = new GridBagConstraints();
        top.fill = GridBagConstraints.CENTER;
        top.gridx = 0;
        top.gridy = 0;
        top.gridheight = 1;
        top.gridwidth = 1;
        top.weightx = 1;
        top.weighty = 0.3;
        top.anchor = GridBagConstraints.SOUTH;
        topPanel.add(lab1,top);


        top.gridx = 0;
        top.gridy = 1;
        top.gridheight = 1;
        top.gridwidth = 1;
        top.weightx = 1;
        top.weighty = 0.4;
        top.fill = GridBagConstraints.CENTER;
        top.anchor = GridBagConstraints.CENTER;
        topPanel.add(lab2,top);

        top.gridx = 0;
        top.gridy = 2;
        top.gridheight = 1;
        top.gridwidth = 1;
        top.weightx = 1;
        top.weighty = 0.3;
        top.fill = GridBagConstraints.NORTH;
        top.anchor = GridBagConstraints.NORTH;
        topPanel.add(lab3,top);



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
