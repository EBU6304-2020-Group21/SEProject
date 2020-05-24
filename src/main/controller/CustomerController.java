package main.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import main.entity.Customer;
import main.views.RegisterPanel;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * This Class is for the Customers. It includes all of the Customers' functions here.
 * This Class links Border and Entity Layer, It helps to get the infos from views and
 * parsing them into the files.
 * @ClassName CustomerController
 * @author Yuxuan Wu
 * @version 3.0
 * @date 2020/05/24
 */
public class CustomerController {

    /**
     * Generate the customers info and send it to views
     * @param customer
     * @exception IOException
     * @author Yuxuan Wu
     * @date 2020/04/05
     */
    public static void genCustomerTotalInfos(Customer customer){
        FileWriter fileWriter;
        File file = new File("Files/Customer/GeneralCustomerInfo.json");
        List<Customer> customerList;
        if(readCustomerTotalInfos()!=""){
            customerList = json2List(readCustomerTotalInfos());
        }else{
            customerList = new ArrayList<Customer>();
        }
        customerList.add(customer);
        String fileStr = list2Json(customerList);
        try{
            if(!file.exists()){
                file.createNewFile();
            }
            fileWriter = new FileWriter(file);
            fileWriter.write(fileStr);
            fileWriter.flush();
            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /**
     * If the Customer's info updated, it will be updated to the files.
     * @exception IOException
     * @param fileStr
     * @author Yuxuan Wu
     * @date 2020/04/05
     */
    public static void updateCustomerTotalInfos(String fileStr){
        FileWriter fileWriter;
        File file = new File("Files/Customer/GeneralCustomerInfo.json");
//        List<Customer> customerList;
//        if(readCustomerTotalInfos()!=""){
//            customerList = json2List(readCustomerTotalInfos());
//        }else{
//            customerList = new ArrayList<Customer>();
//        }
        try{
            if(!file.exists()){
                file.createNewFile();
            }
            fileWriter = new FileWriter(file);
            fileWriter.write(fileStr);
            fileWriter.flush();
            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /**
     * Read the customer total infos from GeneralCustomerInfo.json
     * @return readString
     * @author Yuxuan Wu
     * @date 2020/04/05
     */
    public static String readCustomerTotalInfos(){
        FileReader fileReader;
        File file = new File("Files/Customer/GeneralCustomerInfo.json");
        BufferedReader reader = null;
        String readString = "";
        try{
            if(!file.exists()){
                System.out.println("The file doesn't exists!");
                file.createNewFile();
            }
            reader = new BufferedReader(new FileReader(file));
            String tempString = null;
            while ((tempString = reader.readLine())!=null){
                readString += tempString;
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(reader != null){
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            }
        return readString;
        }

    /**
     * Make the String from the customer file to ArrayList
     * @param str
     * @return customerList
     * @author Yuxuan Wu
     * @date 2020/04/06
     */
    public static List<Customer> json2List(String str){
        JSONArray customerArray = JSONArray.parseArray(str);
        List<Customer> customerList = JSONObject.parseArray(customerArray.toJSONString(), Customer.class);
        return customerList;
    }

    /**
     * Make the Arraylist to String
     * @param customerList
     * @return string
     * @author Yuxuan Wu
     * @date 2020/04/06
     */
    public static String list2Json(List<Customer> customerList){
        JSONArray customerArray = JSONArray.parseArray(JSON.toJSONString(customerList));
        return customerArray.toString();
    }

    /**
     * Find the customer when the user input the membership number
     * @param membershipNum
     * @param customerList
     * @return Customer
     * @author Yuxuan Wu
     * @date 2020/04/06
     */
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

    /**
     * Add the stamps of customer and update
     * @param membershipNum
     * @param customerList
     * @author Yuxuan Wu
     * @date 2020/04/06
     */
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
        CustomerController.updateCustomerTotalInfos(CustomerController.list2Json(customerList));
    }

    /**
     * Read the customer info from the panel
     * @param registerPanel
     * @return
     * @author Yuxuan Wu
     * @date 2020/04/06
     */
    public static Customer customerFromView(RegisterPanel registerPanel){
        Customer newCustomer = new Customer();
        newCustomer.setFirstName(registerPanel.firstNameField.getText());
        newCustomer.setSurname(registerPanel.surnameField.getText());
        newCustomer.setEmail(registerPanel.emailField.getText());
        newCustomer.setMobileNum(registerPanel.phoneNumberField.getText());
        newCustomer.setStamps(0);
        newCustomer.setMembershipNum(UtilsController.genMembershipNums());
        return newCustomer;
    }

    /**
     * Add the Customer infos to file
     * @param registerPanel
     * @author Yuxuan Wu
     * @date 2020/04/10
     */
    public static void addCustomer2Files(RegisterPanel registerPanel){
        genCustomerTotalInfos(customerFromView(registerPanel));
    }

    /**
     * used for test
     * @param args\
     * @author Yuxuan Wu
     * @date 2020/04/15
     */
    public static void main(String[] args) {
        Customer customer = new Customer();
        CustomerController customerController = new CustomerController();
        customer.setEmail("wyx@soda.com");
        customer.setFirstName("Yuxuan");
        customer.setSurname("Wu");
        customer.setMobileNum("18813057698");
        customer.setStamps(5);
        customer.setMembershipNum(UtilsController.genMembershipNums());
        customerController.genCustomerTotalInfos(customer);
        System.out.println(json2List(customerController.readCustomerTotalInfos()));
    }
}
