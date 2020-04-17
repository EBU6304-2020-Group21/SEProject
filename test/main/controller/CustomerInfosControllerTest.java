package main.controller;

import main.entity.Customer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerInfosControllerTest {
    Customer customer = new Customer();
    CustomerQueryController cqc = new CustomerQueryController();
    CustomerInfosController cic = new CustomerInfosController();

    @Test
    void genCustomerTotalInfos() {
        customer.setMembershipNum("test");
        cic.genCustomerTotalInfos(customer);
        assertEquals(false, cqc.findByMemberShipNum("test",
                cic.json2List(cic.readCustomerTotalInfos()))==null);
    }

    @Test
    void readCustomerTotalInfos() {
        customer.setEmail("qujianning0401@bupt.edu.cn");
        customer.setFirstName("Jianning");
        customer.setSurname("Qu");
        customer.setMobileNum("18810008025");
        customer.setStamps(5);
        cic.genCustomerTotalInfos(customer);
        System.out.println(cic.readCustomerTotalInfos() == null);
        assertEquals(false,cic.readCustomerTotalInfos() == null);
    }
}