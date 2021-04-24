package com.service.impl;

import com.dao.CustomerDao;
import com.po.Customer;
import com.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

    public int addCustomer(Customer customer) {
        return this.customerDao.addCustomer(customer);
    }

    public int deleteCustomer(Integer id) {
        return  this.customerDao.deleteCustomer(id);
    }


}
