package main.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import main.entity.Customer;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Yuxuan Wu
 */
public class CustomerController {

    /**
     * 将新的customer写入GeneralCustomerInfo.json文件
     * @param customer
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
     * 从文件里读出来字符串
     * @return
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
     * 字符串变为ArrayList
      * @param str
     * @return
     */
    public static List<Customer> json2List(String str){
        JSONArray customerArray = JSONArray.parseArray(str);
        List<Customer> customerList = JSONObject.parseArray(customerArray.toJSONString(), Customer.class);
        return customerList;
    }

    /**
     * List变为JSONstr
     * @param customerList
     * @return
     */
    public static String list2Json(List<Customer> customerList){
        JSONArray customerArray = JSONArray.parseArray(JSON.toJSONString(customerList));
        return customerArray.toString();
    }

    /**
     *
     * @param membershipNum
     * @param customerList
     * @return
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
     *
     * @param membershipNum
     * @param customerList
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

    //TODO 从panel里面读出数据，封装为Customer，参数为Panel
    public static Customer customerFromView(){
        return new Customer();
    }

    //TODO GUIModel 直接调用这个方法
    public static void addCustomer2Files(){
        genCustomerTotalInfos(customerFromView());
    }

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
