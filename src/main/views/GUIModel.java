package main.views;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class GUIModel extends JFrame implements ActionListener{
    private MenuPanel menuPanel;
    private PayPanel payPanel;
    private TicketPanel ticketPanel;
    private JPanel mainPanel;
    private CardLayout layout;

    public GUIModel(){
        //Initialize all the panel
        mainPanel = new JPanel();
        menuPanel = new MenuPanel();
        payPanel  = new PayPanel();
        ticketPanel = new TicketPanel();
        //Set the listener
        menuPanel.confirm.addActionListener(new MenuConfirmListener());
        payPanel.back.addActionListener(new PayBackListener());
        payPanel.confirm.addActionListener(new PayConfirmListener());
        ticketPanel.back.addActionListener(new TicketBackListener());
        //Set the main frame
        layout = new CardLayout();
        mainPanel.setLayout(layout);
        mainPanel.add(menuPanel,"menu");
        mainPanel.add(payPanel,"pay");
        mainPanel.add(ticketPanel,"ticket");
        setContentPane(mainPanel);
        layout.show(mainPanel,"menu");

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

    public class MenuConfirmListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            if(menuPanel.tonkotsu.isSelected()==false&&menuPanel.shoyu.isSelected()==false&&menuPanel.shio.isSelected()==false){
                JOptionPane.showMessageDialog(null,"Please select the soup type!","Warning",JOptionPane.WARNING_MESSAGE);
            }
            else if(menuPanel.soft.isSelected()==false&&menuPanel.medium.isSelected()==false&&menuPanel.firm.isSelected()==(false)){
                JOptionPane.showMessageDialog(null,"Please select the noodle type!","Warning",JOptionPane.WARNING_MESSAGE);
            }
            else{
                layout.show(mainPanel,"pay");
            }
        }
    }

    public class PayConfirmListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            layout.show(mainPanel,"ticket");
        }
    }

    public class PayBackListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            layout.show(mainPanel,"menu");
        }
    }

    public class TicketBackListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            layout.show(mainPanel,"pay");
        }
    }
}
