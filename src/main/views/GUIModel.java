package main.views;

import main.controller.GenTicketController;
import main.controller.Setter;
import main.entity.Order;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIModel extends JFrame implements ActionListener {
    public static Order currentOrder = new Order();
    Setter setter = new Setter();

    private MenuPanel menuPanel;
    private PayPanel payPanel;
    private TicketPanel ticketPanel;
    private JPanel mainPanel;
    private CardLayout layout;

    public GUIModel() {
        //Initialize all the panel
        mainPanel = new JPanel();
        menuPanel = new MenuPanel();


        //Set the listener
        menuPanel.confirm.addActionListener(new MenuConfirmListener());


        //Set the main frame
        layout = new CardLayout();
        mainPanel.setLayout(layout);
        mainPanel.add(menuPanel, "menu");


        setContentPane(mainPanel);
        layout.show(mainPanel, "menu");

        this.setSize(800, 600);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setTitle("GUITemplate");
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String[] args) {
        GUIModel guiModel = new GUIModel();
    }

    public class MenuConfirmListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (menuPanel.tonkotsu.isSelected() == false && menuPanel.shoyu.isSelected() == false && menuPanel.shio.isSelected() == false) {
                JOptionPane.showMessageDialog(null, "Please select the soup type!", "Warning", JOptionPane.WARNING_MESSAGE);
            } else if (menuPanel.soft.isSelected() == false && menuPanel.medium.isSelected() == false && menuPanel.firm.isSelected() == (false)) {
                JOptionPane.showMessageDialog(null, "Please select the noodle type!", "Warning", JOptionPane.WARNING_MESSAGE);
            } else if (menuPanel.no.isSelected() == false && menuPanel.just.isSelected() == false && menuPanel.lot.isSelected() == false) {
                JOptionPane.showMessageDialog(null, "Please select the Spring onion!", "Warning", JOptionPane.WARNING_MESSAGE);
            } else if (menuPanel.yes1.isSelected() == false && menuPanel.no1.isSelected() == false) {
                JOptionPane.showMessageDialog(null, "Please choose whether you need nori!", "Warning", JOptionPane.WARNING_MESSAGE);
            } else if (menuPanel.yes2.isSelected() == false && menuPanel.no2.isSelected() == false) {
                JOptionPane.showMessageDialog(null, "Please choose whether you need chashu!", "Warning", JOptionPane.WARNING_MESSAGE);
            } else if (menuPanel.yes3.isSelected() == false && menuPanel.no3.isSelected() == false) {
                JOptionPane.showMessageDialog(null, "Please choose whether you need boiled egg!", "Warning", JOptionPane.WARNING_MESSAGE);
            } else if (menuPanel.s1.isSelected() == false && menuPanel.s2.isSelected() == false && menuPanel.s3.isSelected() == false
                    && menuPanel.s4.isSelected() == false &&
                    menuPanel.s5.isSelected() == false && menuPanel.s6.isSelected() == false) {
                JOptionPane.showMessageDialog(null, "Please select the spiciness!", "Warning", JOptionPane.WARNING_MESSAGE);
            } else {
                setter.set();
                payPanel = new PayPanel();
                payPanel.back.addActionListener(new PayBackListener());
                payPanel.confirm.addActionListener(new PayConfirmListener());
                mainPanel.add(payPanel, "pay");
                layout.show(mainPanel, "pay");
            }
        }
    }

    public class PayConfirmListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (payPanel.but1.isSelected() == false && payPanel.but2.isSelected() == false) {
                JOptionPane.showMessageDialog(null, "Please select the way of payment!", "Warning", JOptionPane.WARNING_MESSAGE);
            } else {
                if(payPanel.but1.isSelected() == true){
                    currentOrder.setDiningOption("Cash");
                }else{
                    currentOrder.setDiningOption("Cards");
                }
                GenTicketController gtc = new GenTicketController();
                gtc.genTicket(currentOrder);
                ticketPanel = new TicketPanel();
                ticketPanel.back.addActionListener(new TicketBackListener());
                mainPanel.add(ticketPanel, "ticket");
                layout.show(mainPanel, "ticket");
            }
        }
    }

    public class PayBackListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            layout.show(mainPanel, "menu");
        }
    }

    public class TicketBackListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            layout.show(mainPanel, "pay");
        }
    }
}
