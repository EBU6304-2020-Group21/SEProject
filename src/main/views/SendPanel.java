package main.views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SendPanel extends JPanel {
    private JPanel topPanel;
    private JPanel botPanel;
    public JButton back = new JButton("Back");
    public JButton confirm = new JButton("Confirm");
    public SendPanel(){
        init();
    }
    public void init(){
        topPanel = new JPanel();
        botPanel = new JPanel();
        Font font = new Font("Arial",Font.BOLD,25);
        //set the top panel
        topPanel.setLayout(new GridBagLayout());
        GridBagConstraints top = new GridBagConstraints();
        top.weighty=0.5;
        top.anchor=GridBagConstraints.SOUTH;
        JLabel label = new JLabel("Please enter the email you want to send the report to: ");
        label.setFont(font);
        JTextField jTextField = new JTextField("",20);
        jTextField.setPreferredSize(new Dimension(300,40));
        jTextField.setFont(font);
        topPanel.add(label,top);
        top.gridy = 1;
        top.anchor = GridBagConstraints.NORTH;
        topPanel.add(jTextField,top);
        //set the bottom Panel
        botPanel.setBorder(BorderFactory.createTitledBorder(""));
        back = new JButton("Back");
        confirm = new JButton("Confirm");
        botPanel.setLayout(new BorderLayout());
        back.setPreferredSize(new Dimension(150,0));
        confirm.setPreferredSize(new Dimension(150,0));
        botPanel.add(back,BorderLayout.WEST);
        botPanel.add(confirm,BorderLayout.EAST);
        //Set layout of this panel
        this.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.weightx = 1;
        c.weighty = 0.85;
        this.add(topPanel,c);
        c.gridy = 1;
        c.weighty = 0.15;
        this.add(botPanel,c);
    }
}
