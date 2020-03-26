package main.views;
import javax.swing.*;
import java.awt.event.*;
public class GUITemplate extends JFrame implements ActionListener{
    JFrame basicFrame = new JFrame(" ");
    JPanel basicPanel;

    public GUITemplate(){
        basicPanel = new JPanel();
        basicFrame.add(basicPanel);
        basicFrame.setSize(800, 600);
        basicFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String[] args) {
        GUITemplate guiTemplate = new GUITemplate();
    }
}
//Kai Yan test for update