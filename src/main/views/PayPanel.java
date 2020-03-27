package main.views;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class PayPanel extends JPanel {
    private double totalPrice;

    //sub-panel of this panel
    //sub-panel of TicketPanel
    private JPanel topPanel;
    private JPanel botPanel;
    public PayPanel() {
        init();
    }

    public void init() {
        topPanel = new JPanel();
        botPanel = new JPanel();
        //Set the topPanel
        topPanel.setBorder(new TitledBorder(null, "top ", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, Color.BLACK));
        /**
         * code here is the design of topPanel
         */
        //set the bottom Panel
        botPanel.setBorder(new TitledBorder(null, "bottom ", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, Color.BLACK));
        /**
         * code here is the design of bottompanel
         */
        //Set the layout and initialize this panel
        //Set layout of this panel
        this.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.weightx = 1;
        c.weighty = 0.9;
        this.add(topPanel,c);
        c.gridy = 1;
        c.weighty = 0.1;
        this.add(botPanel,c);

    }
}
