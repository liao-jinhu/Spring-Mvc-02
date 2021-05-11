package com.service.impl;

import com.dao.CustomerDao;
import com.po.Customer;
import com.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CustomerServiceImpl  implements CustomerService {

    private CustomerDao customerDao;
    @Autowired
    public void setCustomerDao(CustomerDao customerDao){
        this.customerDao = customerDao;
    }


    public Customer findCustomerById(Integer id) {
        return this.customerDao.findCustomerById(id);
    }

    public List<Customer> findCustomerByName(String username){
        return this.customerDao.findCustomerByName(username);
    }

    public int addCustomer(Customer customer) {
        return this.customerDao.addCustomer(customer);
    }

    public int deleteCustomer(Integer id) {
        return  this.customerDao.deleteCustomer(id);
    }

    public int updateCustomer(Customer customer) {
        return this.customerDao.updateCustomer(customer);
    }


}
