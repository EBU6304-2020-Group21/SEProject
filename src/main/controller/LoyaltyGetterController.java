package main.controller;

import main.entity.Customer;
import main.views.RegisterPanel;


/**
 * @author Jianning Qu
 */

public class LoyaltyGetterController {
    //This class is used to get and set for Loyalty Service

    //Use as getter
    public String getFirstName(){
        return RegisterPanel.firstNameField.getText();
    }

    public String getSurName(){
        return RegisterPanel.surnameField.getText();
    }

    public String getEmail(){
        return RegisterPanel.emailField.getText();
    }

    public String getMobileNum(){
        return RegisterPanel.phoneNumberField.getText();
    }

    public String getMembershipNum(){
        return GenNumbersController.genMembershipNums();
    }
}
