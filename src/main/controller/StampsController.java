package main.controller;

import main.entity.Customer;

import java.util.List;

public class StampsController {
    public static void addStamps(String membershipNum, List<Customer> customerList){
        Customer resultCustomer = new Customer();
        int i=0;
        for(Customer customer : customerList){
            if(customer.getMembershipNum().equals(membershipNum)){
                resultCustomer = customer;
            }
        }
        customerList.remove(resultCustomer);
        if(resultCustomer.getStamps()!=9){
            resultCustomer.setStamps(resultCustomer.getStamps()+1);
        }else{
            resultCustomer.setStamps(0);
        }
        customerList.add(resultCustomer);
        CustomerInfosController.updateCustomerTotalInfos(CustomerInfosController.list2Json(customerList));
    }

    public static void main(String[] args) {
        System.out.println(CustomerInfosController.json2List(CustomerInfosController.readCustomerTotalInfos()));
        addStamps("67714058",CustomerInfosController.json2List(CustomerInfosController.readCustomerTotalInfos()));

    }
}
