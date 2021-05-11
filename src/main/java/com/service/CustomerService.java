package com.service;

import com.po.Customer;

import java.util.List;

public interface CustomerService {
    Customer findCustomerById(Integer id);
    List<Customer> findCustomerByName(String username);
    int addCustomer(Customer customer);
    int deleteCustomer(Integer id);
    int updateCustomer(Customer customer); //更新客户

}
