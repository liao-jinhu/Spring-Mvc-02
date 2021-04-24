package com.service;

import com.po.Customer;

public interface CustomerService {
    public Customer findCustomerById(Integer id);
    int addCustomer(Customer customer);
    int deleteCustomer(Integer id);
}
