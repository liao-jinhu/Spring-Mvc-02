package com.dao;

import com.po.Customer;

import java.util.List;

public interface CustomerDao {
    Customer findCustomerById(Integer id);  //根据id查询
    List<Customer> findCustomerByName(String username); //模糊查询
    int addCustomer(Customer customer);  //添加客户
    int deleteCustomer(Integer id);   //删除客户
    int updateCustomer(Customer customer); //更新客户

}
