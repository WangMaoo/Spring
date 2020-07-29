package com.wmq.spring.service.impl;

import com.wmq.spring.dao.AccountDao;
import com.wmq.spring.pojo.Account;
import com.wmq.spring.service.DealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description：交易实现类
 */
@Service("dealService")
public class DealServiceImpl implements DealService {

    @Autowired
    AccountDao accountDao;

    @Override
    public Integer doDeal(Float money, Integer payId, Integer rePayId) {
        Integer flag =0;
        //支付
        flag = accountDao.dealMoney(payId, -money);
        if (flag == 0){
            throw new RuntimeException("支付失败");
        }
        //int i = 1 / 0;
        //收款
        flag = flag+accountDao.dealMoney(rePayId, money);
        if (flag == 1){
            throw new RuntimeException("收款失败");
        }
        return flag;
    }

    @Override
    public void printAccountInfo(Integer payId, Integer rePayId) {
        Account payAccount = accountDao.findAccountById(payId);
        System.out.println("支付者账号余额："+payAccount.getMoney());
        Account receiptAccount = accountDao.findAccountById(rePayId);
        System.out.println("收款者账户余额："+receiptAccount.getMoney());
        Float sumMoney = payAccount.getMoney()+receiptAccount.getMoney();
        System.out.println("两人账户总余额："+sumMoney);
    }
}
