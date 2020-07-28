package com.wmq.spring.pojo;

/**
 * @author Wang
 * @version 1.0.0
 * @createTime 2020年07月26日 19:12:00
 * @Description: TODO
 */
public class Account {

    private Integer id;
    private String accountName;
    private Float money;

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", accountName='" + accountName + '\'' +
                ", money=" + money +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public Float getMoney() {
        return money;
    }

    public void setMoney(Float money) {
        this.money = money;
    }
}
