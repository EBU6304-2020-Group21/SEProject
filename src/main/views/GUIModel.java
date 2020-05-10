package main.views;

import main.controller.*;
import main.entity.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GUIModel extends JFrame implements ActionListener {
    public static Order currentOrder = new Order();
    public static Customer currentCustomer = new Customer();
    public static MenuPrice currentMenu = new MenuPrice();
    public static MenuAvailablity currentAvailablity = new MenuAvailablity();
    Setter setter = new Setter();
    private WelcomePanel welcomePanel;
    private MenuPanel menuPanel;
    private EatAskPanel eatAskPanel;
    private LoyaltyAskPanel loyaltyAskPanel;
    private RegisterPanel registerPanel;
    private CongratulationPanel congratulationPanel;
    private InputPanel inputPanel;
    private FreePanel freePanel;
    private NofreePanel nofreePanel;
    private PayPanel payPanel;
    private TicketPanel ticketPanel;
    private FinishPanel finishPanel;
    private LoyaltyPanel loyaltyPanel;
    private StartPanel startPanel;
    private StatPanel statPanel;
    private SendPanel sendPanel;
    private ManageStartPanel manageStartPanel;
    private ModifyPanel modifyPanel;
    private Modifyavaliable modifyavaliable;
    private ModifyPrice modifyPrice;
    private JPanel mainPanel;
    private CardLayout layout;

    public GUIModel() {
        //initialize the menu
        currentMenu = MenuInfoController.getMenuPriceInfo();
        currentAvailablity = MenuInfoController.getMenuAvailabilityInfo();
        //Initialize all the panel
        mainPanel = new JPanel();
        startPanel = new StartPanel();


        //Set the listener
        startPanel.confirm.addActionListener(new StartConfirmListener());

        //Set the main frame
        layout = new CardLayout();
        mainPanel.setLayout(layout);
        mainPanel.add(startPanel, "start");


        setContentPane(mainPanel);
        layout.show(mainPanel, "start");

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


    public class StartConfirmListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            if(!startPanel.enterManager.isSelected()&&!startPanel.enterWelcome.isSelected()){
                JOptionPane.showMessageDialog(null, "Please select the function!", "Warning", JOptionPane.WARNING_MESSAGE);
            }
            if(startPanel.enterWelcome.isSelected()){
                welcomePanel = new WelcomePanel();
                welcomePanel.back.addActionListener(new WelcomeBackListener());
                welcomePanel.confirm.addActionListener(new WelcomeConfirmListener());
                mainPanel.add(welcomePanel,"welcome");
                layout.show(mainPanel,"welcome");
            }
            else if(startPanel.enterManager.isSelected()){
                manageStartPanel = new ManageStartPanel();
                manageStartPanel.back.addActionListener(new ManagerStartBackListener());
                manageStartPanel.confirm.addActionListener(new ManagerStartConfirmListener());
                mainPanel.add(manageStartPanel,"managestart");
                layout.show(mainPanel,"managestart");
            }
        }
    }
    public class ManagerStartBackListener implements  ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            layout.show(mainPanel,"start");
        }
    }

    public class ManagerStartConfirmListener implements  ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            if(!manageStartPanel.ModifyMenu.isSelected()&&!manageStartPanel.SeeSales.isSelected()){
                JOptionPane.showMessageDialog(null, "Please select the function!", "Warning", JOptionPane.WARNING_MESSAGE);
            }
            else if(manageStartPanel.ModifyMenu.isSelected()){
                modifyPanel = new ModifyPanel();
                modifyPanel.back.addActionListener(new ModifyBackListener());
                modifyPanel.confirm.addActionListener(new ModifyConfirmListener());
                mainPanel.add(modifyPanel,"modify");
                layout.show(mainPanel,"modify");
            }
            else if(manageStartPanel.SeeSales.isSelected()){
                Report report = ReportController.generateWeeklyReport();
                statPanel = new StatPanel(
                report.getTonkotsuNum(),
                report.getShoyuNum(),
                report.getShioNum(),
                report.getSoftNum(),
                report.getMediumNum(),
                report.getFirmNum(),
                report.getNoNum(),
                report.getJustNum(),
                report.getLotNum(),
                report.getNoriyesNum(),
                report.getNorinoNum(),
                report.getChashuyesNum(),
                report.getChashunoNum(),
                report.getEggyesNum(),
                report.getEggnoNum(),
                report.getSpi0(),
                report.getSpi1(),
                report.getSpi2(),
                report.getSpi3(),
                report.getSpi4(),
                report.getSpi5(),
                report.getExtraNoriNum(),
                report.getExtraEggNum(),
                report.getExtraBambooNum(),
                report.getExtraChashuNum());
                statPanel.back.addActionListener(new StatBackListener());
                statPanel.confirm.addActionListener(new StatConfirmListener());
                statPanel.tonkotsuLabel.updateUI();
                statPanel.setVisible(true);
                mainPanel.add(statPanel,"stat");
                layout.show(mainPanel,"stat");
            }
        }
    }
    public class ModifyBackListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            layout.show(mainPanel,"managestart");
        }
    }

    public class ModifyConfirmListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            if(!modifyPanel.ModifyPrice.isSelected()&&!modifyPanel.AvaUnava.isSelected()){
                JOptionPane.showMessageDialog(null, "Please select the function!", "Warning", JOptionPane.WARNING_MESSAGE);
            }
            else if(modifyPanel.ModifyPrice.isSelected()){
                modifyPrice = new ModifyPrice();
                modifyPrice.back.addActionListener(new ModifyPriceBackListener());
                modifyPrice.confirm.addActionListener(new ModifyPriceConfirmListener());
                mainPanel.add(modifyPrice,"modifyprice");
                layout.show(mainPanel,"modifyprice");
            }
            else if(modifyPanel.AvaUnava.isSelected()){
                modifyavaliable = new Modifyavaliable();
                //set current availablity
                modifyavaliable.RamenAvaliable.setSelected(currentAvailablity.isRamenAvailable());
                modifyavaliable.RamenUnavaliable.setSelected(!currentAvailablity.isRamenAvailable());
                modifyavaliable.TonkostuAvaliable.setSelected(currentAvailablity.isTonkotsuAvailable());
                modifyavaliable.TonkostuUnavaliable.setSelected(!currentAvailablity.isTonkotsuAvailable());
                modifyavaliable.ShoyuAvaliable.setSelected(currentAvailablity.isShoyuAvailable());
                modifyavaliable.ShoyuUnavaliable.setSelected(!currentAvailablity.isShoyuAvailable());
                modifyavaliable.ShioAvaliable.setSelected(currentAvailablity.isShioAvailable());
                modifyavaliable.ShioUnavaliable.setSelected(!currentAvailablity.isShioAvailable());
                modifyavaliable.NoriAvaliable.setSelected(currentAvailablity.isNoriAvailable());
                modifyavaliable.NoriUnavaliable.setSelected(!currentAvailablity.isNoriAvailable());
                modifyavaliable.ChashuAvaliable.setSelected(currentAvailablity.isChashuAvailable());
                modifyavaliable.ChashuUnavaliable.setSelected(!currentAvailablity.isChashuAvailable());
                modifyavaliable.BambooshootsAvaliable.setSelected(currentAvailablity.isBamShootAvailable());
                modifyavaliable.BambooshootsUnavaliable.setSelected(!currentAvailablity.isBamShootAvailable());
                modifyavaliable.BoiledeggAvaliable.setSelected(currentAvailablity.isBoilEggAvailable());
                modifyavaliable.BoiledeggUnavaliable.setSelected(!currentAvailablity.isBoilEggAvailable());
                modifyavaliable.back.addActionListener(new ModifyAvailableBackListener());
                modifyavaliable.confirm.addActionListener(new ModifyAvailableConfirmListener());
                mainPanel.add(modifyavaliable,"modifyavailable");
                layout.show(mainPanel,"modifyavailable");
            }
        }
    }
    public class ModifyAvailableBackListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            layout.show(mainPanel,"modify");
        }
    }
    public class ModifyAvailableConfirmListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            MenuAvailablity newAvailablity = new MenuAvailablity();
            newAvailablity.setRamenAvailable(modifyavaliable.RamenAvaliable.isSelected());
            newAvailablity.setBamShootAvailable(modifyavaliable.BambooshootsAvaliable.isSelected());
            newAvailablity.setBoilEggAvailable(modifyavaliable.BoiledeggAvaliable.isSelected());
            newAvailablity.setChashuAvailable(modifyavaliable.ChashuAvaliable.isSelected());
            newAvailablity.setNoriAvailable(modifyavaliable.NoriAvaliable.isSelected());
            newAvailablity.setShioAvailable(modifyavaliable.ShioAvaliable.isSelected());
            newAvailablity.setShoyuAvailable(modifyavaliable.ShoyuAvaliable.isSelected());
            newAvailablity.setTonkotsuAvailable(modifyavaliable.TonkostuAvaliable.isSelected());
            MenuInfoController.updateMenuAvailabilityInfo(newAvailablity);
            JOptionPane.showMessageDialog(null, "Success!", "Congratulations!", JOptionPane.INFORMATION_MESSAGE);
            layout.show(mainPanel,"managestart");
            currentAvailablity = MenuInfoController.getMenuAvailabilityInfo();
        }
    }
    public class ModifyPriceBackListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            layout.show(mainPanel,"modify");
        }
    }
    public class ModifyPriceConfirmListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            if (!isDouble(modifyPrice.RamenNowPrice.getText())) {
                JOptionPane.showMessageDialog(null, "Please input number in double format in Ramen Price!", "Warning", JOptionPane.WARNING_MESSAGE);
            } else if (!isDouble(modifyPrice.ChashuNowPrice.getText())) {
                JOptionPane.showMessageDialog(null, "Please input number in double format in chashu Price!", "Warning", JOptionPane.WARNING_MESSAGE);
            } else if (!isDouble(modifyPrice.BambooshootsNowPrice.getText())) {
                JOptionPane.showMessageDialog(null, "Please input number in double format in bamboo shoot Price!", "Warning", JOptionPane.WARNING_MESSAGE);
            } else if (!isDouble(modifyPrice.BoiledeggNowPrice.getText())) {
                JOptionPane.showMessageDialog(null, "Please input number in double format in boiled egg Price!", "Warning", JOptionPane.WARNING_MESSAGE);
            } else {
                MenuPrice newMenu = new MenuPrice();
                newMenu.setFixedPrice(Double.parseDouble(modifyPrice.RamenNowPrice.getText()));
                newMenu.setExtraNoriPrice(Double.parseDouble(modifyPrice.ChashuNowPrice.getText()));
                newMenu.setExtraBamShootPrice(Double.parseDouble(modifyPrice.BambooshootsNowPrice.getText()));
                newMenu.setExtraBoilEggPrice(Double.parseDouble(modifyPrice.BoiledeggNowPrice.getText()));
                newMenu.setExtraChashuPrice(Double.parseDouble(modifyPrice.ChashuNowPrice.getText()));
                MenuInfoController.updateMenuPriceInfo(newMenu);
                currentMenu = MenuInfoController.getMenuPriceInfo();
                JOptionPane.showMessageDialog(null, "Success!", "Congratulations!", JOptionPane.INFORMATION_MESSAGE);
                layout.show(mainPanel, "managestart");
            }
        }


    }
    boolean isDouble(String str)
    {
        try
        {
            Double.parseDouble(str);
            return true;
        }
        catch(NumberFormatException ex){}
        return false;
    }

    public class StatBackListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            layout.show(mainPanel,"managestart");
        }
    }
    public class StatConfirmListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            sendPanel = new SendPanel();
            sendPanel.back.addActionListener(new SendBackListener());
            sendPanel.confirm.addActionListener(new SendConfirmListener());
            mainPanel.add(sendPanel,"send");
            layout.show(mainPanel,"send");
        }
    }
    public class SendBackListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            layout.show(mainPanel,"stat");
        }
    }
    public class SendConfirmListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, "Success!", "Congratulations!", JOptionPane.INFORMATION_MESSAGE);
            layout.show(mainPanel,"managestart");
        }
    }
    public class WelcomeBackListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            layout.show(mainPanel,"start");
        }
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
                loyaltyPanel = new LoyaltyPanel();
                loyaltyPanel.back.addActionListener(new LoyaltyBackListener());
                loyaltyPanel.confirm.addActionListener(new LoyaltyConfirmListener());
                mainPanel.add(loyaltyPanel,"loyalty");
                layout.show(mainPanel,"loyalty");
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
            if (!loyaltyAskPanel.but1.isSelected() && !loyaltyAskPanel.but2.isSelected() && !loyaltyAskPanel.but3.isSelected()) {
                JOptionPane.showMessageDialog(null, "Please select one of the button!", "Warning", JOptionPane.WARNING_MESSAGE);
            } else if (loyaltyAskPanel.but1.isSelected()) {
                inputPanel = new InputPanel();
                inputPanel.back.addActionListener(new InputBackListener2());
                inputPanel.confirm.addActionListener(new InputConfirmListener1());
                mainPanel.add(inputPanel, "input");
                layout.show(mainPanel, "input");
            } else if (loyaltyAskPanel.but2.isSelected()) {
                registerPanel = new RegisterPanel();
                registerPanel.confirm.addActionListener(new RegisterConfirmListener1());
                registerPanel.back.addActionListener(new RegisterBackListener1());
                mainPanel.add(registerPanel, "register");
                layout.show(mainPanel, "register");
            } else if (loyaltyAskPanel.but3.isSelected()) {
                payPanel = new PayPanel();
                payPanel.back.addActionListener(new PayBackListener2());
                payPanel.confirm.addActionListener(new PayConfirmListener2());
                mainPanel.add(payPanel, "pay");
                layout.show(mainPanel, "pay");
            }
        }
    }


    public class RegisterBackListener1 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            layout.show(mainPanel, "loyaltyask");
        }
    }

    public class RegisterConfirmListener1 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String nameReg = "^[A-Za-z]+$";
            String emailReg = "[a-zA-Z_]{1,}[0-9]{0,}@(([a-zA-z0-9]-*){1,}\\.){1,3}[a-zA-z\\-]{1,}";
            String phoneReg = "^[0-9]*$";
            Pattern pattern1 = Pattern.compile(nameReg);
            Pattern pattern2 = Pattern.compile(emailReg);
            Pattern pattern3 = Pattern.compile(phoneReg);
            Matcher firstnameMatcher = pattern1.matcher(registerPanel.firstNameField.getText());
            Matcher surnameMatcher = pattern1.matcher(registerPanel.surnameField.getText());
            Matcher emailMatcher = pattern2.matcher(registerPanel.emailField.getText());
            Matcher phoneMatcher = pattern3.matcher(registerPanel.phoneNumberField.getText());
            if (registerPanel.firstNameField.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Please fill in your first name!", "Warning", JOptionPane.WARNING_MESSAGE);
            } else if (registerPanel.surnameField.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Please fill in your surname!", "Warning", JOptionPane.WARNING_MESSAGE);
            } else if (registerPanel.emailField.getText().equals("") && registerPanel.phoneNumberField.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Please fill in at least one in your email or phone number!", "Warning", JOptionPane.WARNING_MESSAGE);
            } else if (!firstnameMatcher.find()) {
                JOptionPane.showMessageDialog(null, "Please fill in your first name in english letters!", "Warning", JOptionPane.WARNING_MESSAGE);
            } else if (!surnameMatcher.find()) {
                JOptionPane.showMessageDialog(null, "Please fill in your surname in english letters!", "Warning", JOptionPane.WARNING_MESSAGE);
            } else if (!emailMatcher.find()) {
                JOptionPane.showMessageDialog(null, "Please fill in your email in right format(you must include \'@\')!", "Warning", JOptionPane.WARNING_MESSAGE);
            } else if (!phoneMatcher.find()) {
                JOptionPane.showMessageDialog(null, "Please fill in your phone number all in number!", "Warning", JOptionPane.WARNING_MESSAGE);
            } else {
                LoyaltySetterController.set();
                CustomerInfosController.genCustomerTotalInfos(currentCustomer);
                congratulationPanel = new CongratulationPanel();
                congratulationPanel.back.addActionListener(new CongratulationBackListener1());
                congratulationPanel.confirm.addActionListener(new CongratulationConfirmListener1());
                mainPanel.add(congratulationPanel, "congratulation");
                layout.show(mainPanel, "congratulation");
            }
        }
    }

    public class CongratulationBackListener1 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, "Can't back! Please press confirm", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }

    public class CongratulationConfirmListener1 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            inputPanel = new InputPanel();
            inputPanel.back.addActionListener(new InputBackListener1());
            inputPanel.confirm.addActionListener(new InputConfirmListener1());
            mainPanel.add(inputPanel, "input");
            layout.show(mainPanel, "input");
        }
    }

    public class InputBackListener1 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            layout.show(mainPanel, "congratulation");
        }
    }

    public class InputBackListener2 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            layout.show(mainPanel, "loyaltyask");
        }
    }

    public class InputConfirmListener1 implements ActionListener {
        private int virtualStamps;//初始化进行测试

        @Override
        public void actionPerformed(ActionEvent e) {

            if (inputPanel.membershipNumField.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Please fill in your membership number!", "Warning", JOptionPane.WARNING_MESSAGE);
            }
            if(CustomerQueryController.findByMemberShipNum(inputPanel.membershipNumField.getText(),CustomerInfosController.json2List(CustomerInfosController.readCustomerTotalInfos())) == null){
                JOptionPane.showMessageDialog(null, "Please check your membership number!", "Warning", JOptionPane.WARNING_MESSAGE);
            }else {
                //后端验证，这个判断条件需要后端同学修改
                //virtual stamps个数为10
                virtualStamps = CustomerQueryController.findByMemberShipNum(inputPanel.membershipNumField.getText(),
                        CustomerInfosController.json2List(CustomerInfosController.readCustomerTotalInfos())).getStamps();
                if (CustomerQueryController.findByMemberShipNum(inputPanel.membershipNumField.getText(),CustomerInfosController.json2List(CustomerInfosController.readCustomerTotalInfos())).getStamps() == 9) {
                    //Stamps add 1
                    StampsController.addStamps(inputPanel.membershipNumField.getText(),
                            CustomerInfosController.json2List(CustomerInfosController.readCustomerTotalInfos()));
                    freePanel = new FreePanel(virtualStamps);
                    freePanel.back.addActionListener(new FreeBackListener1());
                    freePanel.confirm.addActionListener(new FreeConfirmListener1());
                    mainPanel.add(freePanel, "free");
                    layout.show(mainPanel, "free");
                } else {
                    currentCustomer.setMembershipNum(CustomerQueryController.findByMemberShipNum(inputPanel.membershipNumField.getText(),CustomerInfosController.json2List(CustomerInfosController.readCustomerTotalInfos())).getMembershipNum());
                    nofreePanel = new NofreePanel(virtualStamps);
                    nofreePanel.back.addActionListener(new NofreeBackListener1());
                    nofreePanel.confirm.addActionListener(new NofreeConfirmListener1());
                    mainPanel.add(nofreePanel, "nofree");
                    layout.show(mainPanel, "nofree");
                }
            }
        }

        public class FreeBackListener1 implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                layout.show(mainPanel, "input");
            }
        }

        public class FreeConfirmListener1 implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                ticketPanel = new TicketPanel();
                ticketPanel.back.addActionListener(new TicketBackListener2());
                ticketPanel.confirm.addActionListener(new TicketConfirmListener1());
                mainPanel.add(ticketPanel, "ticket");
                layout.show(mainPanel, "ticket");
            }
        }

        public class NofreeBackListener1 implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                layout.show(mainPanel, "input");
            }
        }

        public class NofreeConfirmListener1 implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                payPanel = new PayPanel();
                payPanel.back.addActionListener(new PayBackListener1());
                payPanel.confirm.addActionListener(new PayConfirmListener1());
                mainPanel.add(payPanel, "pay");
                layout.show(mainPanel, "pay");
            }
        }
    }


    public class PayBackListener1 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            layout.show(mainPanel, "nofree");
        }
    }

    public class PayBackListener2 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            layout.show(mainPanel, "loyaltyask");
        }
    }

    public class PayConfirmListener1 implements ActionListener {
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
                //Stamps add 1
                StampsController.addStamps(inputPanel.membershipNumField.getText(),
                        CustomerInfosController.json2List(CustomerInfosController.readCustomerTotalInfos()));

                GenTicketController gtc = new GenTicketController();
                gtc.genTicket(currentOrder);
                ticketPanel = new TicketPanel();
                OrderInfoController.genOrderTotalInfos(currentOrder);
                ticketPanel.back.addActionListener(new TicketBackListener1());
                ticketPanel.confirm.addActionListener(new TicketConfirmListener1());
                mainPanel.add(ticketPanel, "ticket");
                layout.show(mainPanel, "ticket");
            }
        }
    }

    public class PayConfirmListener2 implements ActionListener {
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
                //Stamps add 1
//                StampsController.addStamps(inputPanel.membershipNumField.getText(),
//                        CustomerInfosController.json2List(CustomerInfosController.readCustomerTotalInfos()));

                GenTicketController gtc = new GenTicketController();
                gtc.genTicket(currentOrder);
                ticketPanel = new TicketPanel();
                OrderInfoController.genOrderTotalInfos(currentOrder);
                ticketPanel.back.addActionListener(new TicketBackListener3());
                ticketPanel.confirm.addActionListener(new TicketConfirmListener2());
                mainPanel.add(ticketPanel, "ticket");
                layout.show(mainPanel, "ticket");
            }
        }
    }


    public class TicketBackListener1 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            layout.show(mainPanel, "pay");
        }
    }

    public class TicketBackListener2 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            layout.show(mainPanel, "free");
        }
    }

    public class TicketBackListener3 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            layout.show(mainPanel, "pay");
        }
    }

    public class TicketConfirmListener1 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            finishPanel = new FinishPanel(CustomerQueryController.findByMemberShipNum(inputPanel.membershipNumField.getText(),
                    CustomerInfosController.json2List(CustomerInfosController.readCustomerTotalInfos())).getStamps());
            finishPanel.back.addActionListener(new FinishBackListener1());
            finishPanel.confirm.addActionListener(new FinishConfirmListener1());
            mainPanel.add(finishPanel, "finish");
            layout.show(mainPanel, "finish");
        }
    }

    public class TicketConfirmListener2 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            layout.show(mainPanel, "welcome");
        }
    }


    public class FinishBackListener1 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            layout.show(mainPanel, "ticket");
        }
    }

    public class FinishConfirmListener1 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            layout.show(mainPanel, "welcome");
        }
    }

    public class LoyaltyBackListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            layout.show(mainPanel, "welcome");
        }
    }

    public class LoyaltyConfirmListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (loyaltyPanel.but2.isSelected()) {
                //注册
                registerPanel = new RegisterPanel();
                registerPanel.back.addActionListener(new RegisterBackListener2());
                registerPanel.confirm.addActionListener(new RegisterConfirmListener2());
                mainPanel.add(registerPanel, "register");
                layout.show(mainPanel, "register");
            } else {
                //登录
                inputPanel = new InputPanel();
                inputPanel.back.addActionListener(new InputBackListener3());
                inputPanel.confirm.addActionListener(new InputConfirmListener2());
                mainPanel.add(inputPanel, "input");
                layout.show(mainPanel, "input");
            }
        }
    }

    public class RegisterBackListener2 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            layout.show(mainPanel, "loyalty");
        }
    }

    public class RegisterConfirmListener2 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String nameReg = "^[A-Za-z]+$";
            String emailReg = "[a-zA-Z_]{1,}[0-9]{0,}@(([a-zA-z0-9]-*){1,}\\.){1,3}[a-zA-z\\-]{1,}";
            String phoneReg = "^[0-9]*$";
            Pattern pattern1 = Pattern.compile(nameReg);
            Pattern pattern2 = Pattern.compile(emailReg);
            Pattern pattern3 = Pattern.compile(phoneReg);
            Matcher firstnameMatcher = pattern1.matcher(registerPanel.firstNameField.getText());
            Matcher surnameMatcher = pattern1.matcher(registerPanel.surnameField.getText());
            Matcher emailMatcher = pattern2.matcher(registerPanel.emailField.getText());
            Matcher phoneMatcher = pattern3.matcher(registerPanel.phoneNumberField.getText());
            if (registerPanel.firstNameField.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Please fill in your first name!", "Warning", JOptionPane.WARNING_MESSAGE);
            } else if (registerPanel.surnameField.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Please fill in your surname!", "Warning", JOptionPane.WARNING_MESSAGE);
            } else if (registerPanel.emailField.getText().equals("") && registerPanel.phoneNumberField.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Please fill in at least one in your email or phone number!", "Warning", JOptionPane.WARNING_MESSAGE);
            } else if (!firstnameMatcher.find()) {
                JOptionPane.showMessageDialog(null, "Please fill in your first name in english letters!", "Warning", JOptionPane.WARNING_MESSAGE);
            } else if (!surnameMatcher.find()) {
                JOptionPane.showMessageDialog(null, "Please fill in your surname in english letters!", "Warning", JOptionPane.WARNING_MESSAGE);
            } else if (!emailMatcher.find()) {
                JOptionPane.showMessageDialog(null, "Please fill in your email in right format(you must include \'@\')!", "Warning", JOptionPane.WARNING_MESSAGE);
            } else if (!phoneMatcher.find()) {
                JOptionPane.showMessageDialog(null, "Please fill in your phone number all in number!", "Warning", JOptionPane.WARNING_MESSAGE);
            } else {
                LoyaltySetterController.set();
                CustomerInfosController.genCustomerTotalInfos(currentCustomer);
                congratulationPanel = new CongratulationPanel();
                congratulationPanel.back.addActionListener(new CongratulationBackListener2());
                congratulationPanel.confirm.addActionListener(new CongratulationConfirmListener2());
                mainPanel.add(congratulationPanel, "congratulation");
                layout.show(mainPanel, "congratulation");
            }
        }
    }

    public class CongratulationBackListener2 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, "Can't back,Please press confirm!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }

    public class CongratulationConfirmListener2 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            layout.show(mainPanel,"welcome");
        }
    }


    public class InputBackListener3 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            layout.show(mainPanel,"loyalty");
        }
    }

    public class InputConfirmListener2 implements ActionListener {
            private int virtualStamps;

            @Override
            public void actionPerformed(ActionEvent e) {

                if (inputPanel.membershipNumField.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Please fill in your membership number!", "Warning", JOptionPane.WARNING_MESSAGE);
                } else {
                    //后端验证，这个判断条件需要后端同学修改
                    //virtual stamps个数为10
                    if(CustomerQueryController.findByMemberShipNum(inputPanel.membershipNumField.getText(),
                            CustomerInfosController.json2List(CustomerInfosController.readCustomerTotalInfos())) == null){
                        JOptionPane.showMessageDialog(null, "There is no such customer!", "Warning", JOptionPane.WARNING_MESSAGE);
                    }else{
                        virtualStamps = CustomerQueryController.findByMemberShipNum(inputPanel.membershipNumField.getText(),
                                CustomerInfosController.json2List(CustomerInfosController.readCustomerTotalInfos())).getStamps();
                        if (virtualStamps == 9) {
                            freePanel = new FreePanel(virtualStamps);
                            freePanel.back.addActionListener(new FreeBackListener2());
                            freePanel.confirm.addActionListener(new FreeConfirmListener2());
                            mainPanel.add(freePanel, "free");
                            layout.show(mainPanel, "free");
                        } else {
                            nofreePanel = new NofreePanel(virtualStamps);
                            nofreePanel.back.addActionListener(new NofreeBackListener2());
                            nofreePanel.confirm.addActionListener(new NofreeConfirmListener2());
                            mainPanel.add(nofreePanel, "nofree");
                            layout.show(mainPanel, "nofree");
                        }
                    }

                }}}



    public class FreeBackListener2 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            layout.show(mainPanel,"input");
        }
    }

    public class FreeConfirmListener2 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            layout.show(mainPanel,"welcome");
        }
    }

    public class NofreeBackListener2 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            layout.show(mainPanel,"input");
        }
    }

    public class NofreeConfirmListener2 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            layout.show(mainPanel,"welcome");
        }
    }
}
