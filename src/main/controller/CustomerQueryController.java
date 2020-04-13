package main.controller;

import main.entity.Customer;

import java.util.List;

/**
 * 查询接口
 * @author 吴宇轩
 *
 */
public class CustomerQueryController {
    public static Customer findByMemberShipNum(String membershipNum, List<Customer> customerList){
        Customer resultCustomer = new Customer();
        int j=0;
        for(Customer customer : customerList){
//            System.out.println(customer.getMembershipNum());
//            System.out.println(customer.getEmail());
            if(membershipNum.equals(customer.getMembershipNum())){
                resultCustomer = customer;
                break;
            }else{
                j++;
            }
        }
        if(j==customerList.size()){
            return null;
        }else{
            return resultCustomer;
        }
    }

    public static void main(String[] args) {
        //System.out.println(CustomerInfosController.json2List(CustomerInfosController.readCustomerTotalInfos()));
        System.out.println(CustomerQueryController.findByMemberShipNum("12345677",
                CustomerInfosController.json2List(CustomerInfosController.readCustomerTotalInfos()))==null);
    }
}
