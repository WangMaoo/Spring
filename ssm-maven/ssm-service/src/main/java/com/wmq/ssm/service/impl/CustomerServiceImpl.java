package com.wmq.ssm.service.impl;

import com.wmq.ssm.mapper.CustomerMapper;
import com.wmq.ssm.pojo.Customer;
import com.wmq.ssm.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Wang
 * @version 1.0.0
 * @createTime 2020年08月03日 22:00:00
 * @Description: TODO
 */
@Service(value = "customerService")
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerMapper customerMapper;

    @Override
    @Transactional
    public Integer saveCustomer(Customer customer) {
        return customerMapper.saveCustomer(customer);
    }

    @Override
    @Transactional
    public Integer deleteCustomer(Integer custId) {
        return customerMapper.deleteCustomer(custId);
    }

    @Override
    @Transactional
    public Integer updateCusTomerByCustId(Customer customer) {
        return customerMapper.updateCusTomerByCustId(customer);
    }

    @Override
    public Customer findCustomerByCustId(Integer custId) {
        return customerMapper.findCustomerByCustId(custId);
    }

    @Override
    public List<Customer> findAll() {
        return customerMapper.findAll();
    }
}
