package main.views;
import javax.swing.*;
import java.awt.event.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GUITemplate extends JFrame implements ActionListener{

    private RegisterPanel registerPanel;
    public GUITemplate(){

        //Set the main frame
        this.setSize(800, 600);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setTitle("GUITemplate");
        registerPanel = new RegisterPanel();
        registerPanel.confirm.addActionListener(new RegisterConfirmListener());
//        this.add(registerPanel); //Here add your panel to test ******************
        this.add(new LoyaltyPanel());
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

    public class RegisterConfirmListener implements  ActionListener{
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
            if(registerPanel.firstNameField.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Please fill in your first name!", "Warning", JOptionPane.WARNING_MESSAGE);
            }
            else if(registerPanel.surnameField.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Please fill in your surname!", "Warning", JOptionPane.WARNING_MESSAGE);
            }
            else if(registerPanel.emailField.getText().equals("")&&registerPanel.phoneNumberField.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Please fill in at least one in your email or phone number!", "Warning", JOptionPane.WARNING_MESSAGE);
            }
            else if(!firstnameMatcher.find()){
                JOptionPane.showMessageDialog(null, "Please fill in your first name in english letters!", "Warning", JOptionPane.WARNING_MESSAGE);
            } else if (!surnameMatcher.find()) {
                JOptionPane.showMessageDialog(null, "Please fill in your surname in english letters!", "Warning", JOptionPane.WARNING_MESSAGE);
            }
            else if(!emailMatcher.find()){
                JOptionPane.showMessageDialog(null, "Please fill in your email in right format(you must include \'@\')!", "Warning", JOptionPane.WARNING_MESSAGE);
            } else if (!phoneMatcher.find()) {
                JOptionPane.showMessageDialog(null, "Please fill in your phone number all in number!", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        }
    }
}
