package main.controller;

import main.entity.Customer;
import main.controller.LoyaltySetterController;
import static main.views.GUIModel.currentCustomer;

/**
 * @author Jianning Qu
 */

public class LoyaltySetterController {
    static LoyaltyGetterController getter = new LoyaltyGetterController();

    public static void set(){
        currentCustomer.setMembershipNum(getter.getMembershipNum());
        currentCustomer.setFirstName(getter.getFirstName());
        currentCustomer.setSurname(getter.getSurName());
        currentCustomer.setEmail(getter.getEmail());
        currentCustomer.setMobileNum(getter.getMobileNum());
    }
}
