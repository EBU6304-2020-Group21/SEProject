package main.controller;

import main.entity.Customer;
import org.junit.jupiter.api.Test;

/**
 * @author Jianning Qu
 */

import static org.junit.jupiter.api.Assertions.*;

class CustomerQueryControllerTest {
    CustomerQueryController c = new CustomerQueryController();
    Customer customer = new Customer();

    @Test
    void findByMemberShipNum(){
        customer.setMembershipNum("123456");
        CustomerInfosController.genCustomerTotalInfos(customer);
        System.out.println(c.findByMemberShipNum("123456",CustomerInfosController.json2List(CustomerInfosController.readCustomerTotalInfos())).getMembershipNum());
        assertEquals("123456",c.findByMemberShipNum("123456",CustomerInfosController.json2List(CustomerInfosController.readCustomerTotalInfos())).getMembershipNum());
    }
}