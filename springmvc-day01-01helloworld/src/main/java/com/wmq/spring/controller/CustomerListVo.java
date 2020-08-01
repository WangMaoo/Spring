package com.wmq.spring.controller;

import java.util.List;

/**
 * @author Wang
 * @version 1.0.0
 * @createTime 2020年08月01日 09:12:00
 * @Description: TODO
 */
public class CustomerListVo {

    private List<Customer> list;

    public List<Customer> getList() {
        return list;
    }

    public void setList(List<Customer> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "CustomerListVo{" +
                "list=" + list +
                '}';
    }
}
