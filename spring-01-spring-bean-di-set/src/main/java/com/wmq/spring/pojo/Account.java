package com.wmq.spring.pojo;

/**
 * @Description：账户类
 */
public class Account {

    //编号
    private String id;
    //姓名
    private String accountName;
    //账号余额
    private  Float money;

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    @Override
    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", accountName='" + accountName + '\'' +
                ", money=" + money +
                '}';
    }
}
