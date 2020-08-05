package com.wmq.ssm.service;

import com.wmq.ssm.pojo.Customer;

import java.util.List;

/**
 * @author Wang
 * @version 1.0.0
 * @createTime 2020年08月03日 21:59:00
 * @Description: TODO
 */
public interface CustomerService {

    /**
     * @Description 保存用户
     * @param customer 用户对象信息
     * @return 影响行数
     */
    Integer saveCustomer(Customer customer);

    /**
     * @Description 删除用户
     * @param custId 用户Id
     * @return 影响行数
     */
    Integer deleteCustomer(Integer custId);

    /**
     * @Description 修改用户
     * @param customer 用户对象，其中custId不可以为空
     * @return 影响行数
     */
    Integer updateCusTomerByCustId(Customer customer);

    /**
     * @Description 按cusId查询用户
     * @param custId 用户Id
     * @return Customer用户对象
     */
    Customer findCustomerByCustId(Integer custId);

    /**
     * @Description 查询所有用户
     * @return 所有用户
     */
    List<Customer> findAll();
}
