package main.controller;

import main.views.RegisterPanel;


/**
 * @author Jianning Qu
 */
//TODO 颜恺在使用新的数据传输方法后，可以将此类代替，随后可以删除
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
        return UtilsController.genMembershipNums();
    }
}
