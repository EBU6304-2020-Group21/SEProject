package main.views;
import javax.swing.*;
import java.awt.event.*;
public class GUITemplate extends JFrame implements ActionListener{
    private MenuPanel menuPanel;
    private PayPanel payPanel;
    private TicketPanel ticketPanel;

    public GUITemplate(){
        //Initialize all the panel
        menuPanel = new MenuPanel();
        payPanel  = new PayPanel();
        ticketPanel = new TicketPanel();
        //Set the listener
        menuPanel.confirm.addActionListener(new MenuConfirmListener());
        //Set the main frame
        this.setSize(800, 600);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setTitle("GUITemplate");
        this.setContentPane(menuPanel); //Here add your panel to test ******************
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String[] args) {
        GUITemplate guiTemplate = new GUITemplate();
    }

    public class MenuConfirmListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            menuPanel.setVisible(false);
            payPanel.setVisible(true);
        }
    }
}
