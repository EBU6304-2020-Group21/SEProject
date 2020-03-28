package main.views;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class ExamplePanel extends JPanel {
    private JPanel topPanel;
    private JPanel bottomPanel;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;

    public ExamplePanel() {
        init();
    }

    private void init() {
        topPanel = new JPanel();
        bottomPanel = new JPanel();
        GridBagLayout gridBag1 = new GridBagLayout(); //Menu Layout management
        GridBagConstraints constraints; //constraints
        //Button
        button1 = new JButton("food");
        button2 = new JButton("TEA");
        button3 = new JButton("juice");
        button4 = new JButton("11111111111111111111111111");
        //Panel layout
        this.setLayout(gridBag1);
        topPanel.setLayout(new FlowLayout());
        bottomPanel.setLayout(new FlowLayout());
        //topPanel
        topPanel.setBorder(BorderFactory.createTitledBorder(""));
        topPanel.add(button1);
        topPanel.add(button2);
        topPanel.add(button3);
        //bottomPanel
        bottomPanel.setBorder(new TitledBorder(null, "bottom ", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, Color.BLACK));
        bottomPanel.add(button4);
        //MenuPanel
        constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.BOTH;
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.weightx = 1;
        constraints.weighty = 0.2;
        this.add(topPanel, constraints);
        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.weightx = 1;
        constraints.weighty = 0.8;
        this.add(bottomPanel, constraints);


    }
}
