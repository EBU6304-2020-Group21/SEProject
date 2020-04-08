package main.views;
import javax.swing.*;
import java.awt.event.*;
public class GUITemplate extends JFrame implements ActionListener{

    public GUITemplate(){

        //Set the main frame
        this.setSize(800, 600);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setTitle("GUITemplate");
        this.add(new RegisterPanel()); //Here add your panel to test ******************
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
        }
    }
}
