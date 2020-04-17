package main.controller;

import main.entity.Customer;
import main.views.RegisterPanel;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Jianning Qu
 */

class LoyaltySetterControllerTest {
    LoyaltySetterController lsc = new LoyaltySetterController();
    Customer currentCustomer = new Customer();
    LoyaltyGetterController getter = new LoyaltyGetterController();
    RegisterPanel registerPanel = new RegisterPanel();

    @Test
    void set() {
        registerPanel.firstNameField.setText("Jianning");
        getter.getFirstName();
        registerPanel.surnameField.setText("Qu");
        getter.getSurName();
        registerPanel.emailField.setText("qujianning0401@bupt.edu.cn");
        getter.getEmail();
        registerPanel.phoneNumberField.setText("18810008025");
        getter.getMobileNum();
        lsc.set();
        assertEquals("Jianning",getter.getFirstName());
        assertEquals("Qu",getter.getSurName());
        assertEquals("qujianning0401@bupt.edu.cn",getter.getEmail());
        assertEquals("18810008025",getter.getMobileNum());
    }
}