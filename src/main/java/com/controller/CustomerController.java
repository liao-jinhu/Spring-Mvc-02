package com.controller;
import com.po.Customer;
import com.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomerController {

    private CustomerService customerService;
    @Autowired
    public void setCustomerService(CustomerService customerService){
        this.customerService=customerService;
    }

    @RequestMapping("/findCustomer")
    public String findCustomerById(Integer id, Model model) {
        Customer customer = customerService.findCustomerById(id);
        model.addAttribute("customer", customer);
        System.out.println(customer.toString());
        System.out.println(id);
        return "customer";
    }


    // 跳转到增加客户页面
    @RequestMapping("/toaddCustomer")
    public String toAddPaper() {
        return "addCustomer";
    }


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

    @RequestMapping("/deleteCustomer")
    public  String deleteCustomer(Integer id){
        customerService.deleteCustomer(id);
        return "success";
    }



}
