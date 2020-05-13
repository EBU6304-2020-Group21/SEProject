package main.controller;

import main.entity.Customer;
import main.controller.LoyaltySetterController;
import static main.views.GUIModel.currentCustomer;

/**
 * @author Jianning Qu
 */
//TODO 颜恺在使用新的数据传输方法后，可以将此类代替，随后可以删除
public class LoyaltySetterController {
    static LoyaltyGetterController getter = new LoyaltyGetterController();

    public static void set(){

        currentCustomer.setFirstName(getter.getFirstName());
        currentCustomer.setSurname(getter.getSurName());
        currentCustomer.setEmail(getter.getEmail());
        currentCustomer.setMobileNum(getter.getMobileNum());
        currentCustomer.setMembershipNum(getter.getMembershipNum());
    }
}
