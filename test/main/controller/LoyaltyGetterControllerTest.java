package main.controller;

import main.entity.Customer;
import main.views.RegisterPanel;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Jianning Qu
 */

class LoyaltyGetterControllerTest {
    Customer customer = new Customer();
    LoyaltyGetterController lgc = new LoyaltyGetterController();
    RegisterPanel registerPanel = new RegisterPanel();

    @Test
    void getFirstName() {
        registerPanel.firstNameField.setText("Jianning");
        assertEquals("Jianning",lgc.getFirstName());
    }

    @Test
    void getSurName() {
        registerPanel.surnameField.setText("Qu");
        assertEquals("Qu",lgc.getSurName());
    }

    @Test
    void getEmail() {
        registerPanel.emailField.setText("qujianning0401@bupt.edu.cn");
        assertEquals("qujianning0401@bupt.edu.cn", lgc.getEmail());
    }

    @Test
    void getMobileNum() {
        registerPanel.phoneNumberField.setText("18810008025");
        assertEquals("18810008025", lgc.getMobileNum());
    }

}