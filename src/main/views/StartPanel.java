package main.views;

import javax.swing.*;
import java.awt.*;

public class StartPanel extends JPanel {
    private JPanel topPanel;
    private JPanel botPanel;
    public JButton back = new JButton("Back");
    public JButton confirm = new JButton("Confirm");
    public JRadioButton enterWelcome;
    public JRadioButton enterManager;

    public StartPanel() {
        init();
    }

    public void init() {
        topPanel = new JPanel();
        botPanel = new JPanel();
        Font font1 = new Font("Arial", Font.BOLD, 30);
        Font font2 = new Font("Arial", Font.PLAIN, 25);
        //set the top Panel
        JLabel label = new JLabel("Please Select Your System");
        enterWelcome = new JRadioButton("Self-Service Kiosk");
        JLabel icon = new JLabel();
        enterWelcome = new JRadioButton("Self-service Kiosk");
        enterManager = new JRadioButton("Management System");
        icon.setIcon(new ImageIcon("Files/Logo/RamenRestaurant.png"));
        ButtonGroup btp = new ButtonGroup();
        btp.add(enterManager);
        btp.add(enterWelcome);
        label.setForeground(Color.BLUE);
        label.setFont(font1);
        enterManager.setFont(font1);
        enterWelcome.setFont(font1);
        topPanel.setLayout(new GridBagLayout());
        GridBagConstraints top = new GridBagConstraints();
        top.anchor = GridBagConstraints.CENTER;
        top.weightx = 1;
        top.weighty = 0.2;
        top.gridy = 0;
        topPanel.add(icon, top);
        top.anchor=GridBagConstraints.NORTH;
        top.gridy = 1;
        topPanel.add(label,top);
        top.anchor = GridBagConstraints.CENTER;
        top.weighty = 0.3;
        top.gridy = 2;
        topPanel.add(enterWelcome, top);
        top.anchor = GridBagConstraints.NORTH;
        top.gridy = 3;
        topPanel.add(enterManager, top);
        //set the bottom Panel
        botPanel.setBorder(BorderFactory.createTitledBorder(""));
        back = new JButton("Back");
        confirm = new JButton("Confirm");
        botPanel.setLayout(new BorderLayout());
        back.setPreferredSize(new Dimension(150, 0));
        confirm.setPreferredSize(new Dimension(150, 0));
        botPanel.add(back, BorderLayout.WEST);
        botPanel.add(confirm, BorderLayout.EAST);
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
        this.add(topPanel, c);
        c.gridy = 1;
        c.weighty = 0.15;
        this.add(botPanel, c);
    }

}
