package com.wmq.spring.service.impl;

import com.wmq.spring.dao.AccountDao;
import com.wmq.spring.dao.impl.AccountImplB;
import com.wmq.spring.pojo.Account;
import com.wmq.spring.service.AccountService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Wang
 * @version 1.0.0
 * @createTime 2020年07月26日 19:20:00
 * @Description: TODO
 */
@Service
public class AccountServiceImpl implements AccountService {

    /*@Autowired*/
    @Resource(name ="accountDao")
    private AccountDao accountDaoC;


    @Override
    public List<Account> findAll() {
        return accountDaoC.findAll();
    }

    @Override
    public int deleteAccountById(int id) {
        return accountDaoC.deleteAccountById(id);
    }

    @Override
    public int updateAccountById(Account account) {
        return accountDaoC.updateAccountById(account);
    }

    @Override
    public Integer countAccount() {
        return accountDaoC.countAccount();
    }

    @Override
    public Account findAccountById(int id) {
        return accountDaoC.findAccountById(id);
    }

    @Override
    public int saveAccount(Account account) {
        return accountDaoC.saveAccount(account);
    }
}
