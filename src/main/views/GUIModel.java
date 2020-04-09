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
    private WelcomePanel welcomePanel;
    private MenuPanel menuPanel;
    private EatAskPanel eatAskPanel;
    private LoyaltyAskPanel loyaltyAskPanel;
    private RegisterPanel registerPanel;
    private RegisterPanel registerPanel2;
    private CongratulationPanel congratulationPanel;
    private CongratulationPanel congratulationPanel2;
    private InputPanel inputPanel;
    private InputPanel inputPanel2;
    private InputPanel inputPanel3;
    private FreePanel freePanel;
    private FreePanel freePanel2;
    private FreePanel freePanel3;
    private NofreePanel nofreePanel;
    private NofreePanel nofreePanel2;
    private NofreePanel nofreePanel3;
    private PayPanel payPanel;
    private PayPanel payPanel2;
    private PayPanel payPanel3;
    private TicketPanel ticketPanel;
    private TicketPanel ticketPanel2;
    private TicketPanel ticketPanel3;
    private TicketPanel ticketPanel4;
    private TicketPanel ticketPanel5;
    private FinishPanel finishPanel;
    private FinishPanel finishPanel2;
    private FinishPanel finishPanel3;
    private LoyaltyPanel loyaltyPanel;
    private JPanel mainPanel;
    private CardLayout layout;

    public GUIModel() {
        //Initialize all the panel
        mainPanel = new JPanel();
        welcomePanel = new WelcomePanel();


        //Set the listener
        welcomePanel.confirm.addActionListener(new WelcomeConfirmListener());


        //Set the main frame
        layout = new CardLayout();
        mainPanel.setLayout(layout);
        mainPanel.add(welcomePanel, "welcome");


        setContentPane(mainPanel);
        layout.show(mainPanel, "welcome");

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


    public class WelcomeConfirmListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (!welcomePanel.but1.isSelected() && !welcomePanel.but2.isSelected()) {
                JOptionPane.showMessageDialog(null, "Please select the function!", "Warning", JOptionPane.WARNING_MESSAGE);
            } else if (welcomePanel.but1.isSelected()) {
                menuPanel = new MenuPanel();
                menuPanel.confirm.addActionListener(new MenuConfirmListener());
                menuPanel.back.addActionListener(new MenuBackListener());
                mainPanel.add(menuPanel, "menu");
                layout.show(mainPanel, "menu");
            } else if (welcomePanel.but2.isSelected()) {
                //下部分待补充
            }
        }
    }

    public class MenuBackListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            layout.show(mainPanel, "welcome");
        }
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
                eatAskPanel = new EatAskPanel();
                eatAskPanel.confirm.addActionListener(new EatAskConfirmListener());
                eatAskPanel.back.addActionListener(new EatAskBackListener());
                mainPanel.add(eatAskPanel, "eatask");
                layout.show(mainPanel, "eatask");
//                payPanel = new PayPanel();
//                payPanel.back.addActionListener(new PayBackListener());
//                payPanel.confirm.addActionListener(new PayConfirmListener());
//                mainPanel.add(payPanel, "pay");
//                layout.show(mainPanel, "pay");
            }
        }
    }

    public class EatAskBackListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            layout.show(mainPanel, "menu");
        }
    }

    public class EatAskConfirmListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (!eatAskPanel.but1.isSelected() && !eatAskPanel.but2.isSelected()) {
                JOptionPane.showMessageDialog(null, "Please select one of the button!", "Warning", JOptionPane.WARNING_MESSAGE);
            } else {
                loyaltyAskPanel = new LoyaltyAskPanel();
                loyaltyAskPanel.confirm.addActionListener(new LoyaltyAskConfirmListener());
                loyaltyAskPanel.back.addActionListener(new LoyaltyAskBackListener());
                mainPanel.add(loyaltyAskPanel, "loyaltyask");
                layout.show(mainPanel, "loyaltyask");
            }
        }
    }

    public class LoyaltyAskBackListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            layout.show(mainPanel, "eatask");
        }
    }

    public class LoyaltyAskConfirmListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (!loyaltyAskPanel.but1.isSelected()&&!loyaltyAskPanel.but2.isSelected()&&!loyaltyAskPanel.but3.isSelected()){
                JOptionPane.showMessageDialog(null, "Please select one of the button!", "Warning", JOptionPane.WARNING_MESSAGE);
            }
            else if(loyaltyAskPanel.but1.isSelected()){
                inputPanel = new InputPanel();
            }
            else if(loyaltyAskPanel.but2.isSelected()){
                registerPanel = new RegisterPanel();
            }
            else if(loyaltyAskPanel.but3.isSelected()){
                payPanel = new PayPanel();
            }
        }
    }

    public class InputBackListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            layout.show(mainPanel,"loyaltyask");
        }
    }

    public class InputConfirmListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            //待补充
        }
    }

    public class RegisterBackListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            layout.show(mainPanel,"loyaltyask");
        }
    }
    public class RegisterConfirmListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            //待补充
        }
    }

    public class PayBackListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            layout.show(mainPanel, "menu");
        }
    }
    public class PayConfirmListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (payPanel.but1.isSelected() == false && payPanel.but2.isSelected() == false) {
                JOptionPane.showMessageDialog(null, "Please select the way of payment!", "Warning", JOptionPane.WARNING_MESSAGE);
            } else {
                if (payPanel.but1.isSelected() == true) {
                    currentOrder.setDiningOption("Cash");
                } else {
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


    public class TicketBackListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            layout.show(mainPanel, "pay");
        }
    }
}
