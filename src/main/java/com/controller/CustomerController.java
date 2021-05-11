package com.controller;
import com.po.Customer;
import com.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
public class CustomerController {
    private CustomerService customerService;
    @Autowired
    public void setCustomerService(CustomerService customerService){
        this.customerService=customerService;
    }

    //根所id查找客户
    @RequestMapping("/findCustomer")
    public String findCustomerById(Integer id, Model model) {
        Customer customer = customerService.findCustomerById(id);
        model.addAttribute("customer", customer);
        System.out.println(customer.toString());
        System.out.println(id);
        return "customer";
    }

    //跳转到模糊查询
    @RequestMapping("/tofindCustomerByName")
    public String tofindCustomerByName(){
        return "customer2"; }

    //模糊查找
    @RequestMapping("/findCustomerByName")
    public String findCustomerById(String username, Model model) {
        List<Customer> customer = customerService.findCustomerByName(username);
        model.addAttribute("customer", customer);
        for(Customer customer1:customer){
            System.out.println(customer.toString());
        }
        return "customer2";
    }

    // 跳转到增加客户页面
    @RequestMapping("/toaddCustomer")
    public String toAddPaper() {
        return "addCustomer";
    }

    //添加客户
    @RequestMapping("/addCustomer")
    public String addCustomer(Customer customer){
       customerService.addCustomer(customer);
        return "success";
    }

    //跳转到删除客户页面
    @RequestMapping("/todelete")
    public  String toDeleteCustomer(){
        return  "deleteCustomer";
    }

    //删除客户
    @RequestMapping("/deleteCustomer")
    public  String deleteCustomer(Integer id){
        customerService.deleteCustomer(id);
        return "success";
    }

    //跳转到更新客户
    @RequestMapping("/toupdate")
    public String toupdate(){
        return "updateCustomer";
    }

    //更新客户信息
    @RequestMapping("/updateCustomer")
    public String updateCustomer(Customer customer){
        customerService.updateCustomer(customer);
        return "success";
    }
}
