package com.wmq.spring.dao.impl;

import com.wmq.spring.dao.AccountDao;
import com.wmq.spring.mapper.AccountMapper;
import com.wmq.spring.pojo.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Description：
 */
@Component("accountDao")
public class AccountDaoImpl implements AccountDao {

    //jdbctemplate
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int saveAccount(Account account) {
        String sql ="INSERT INTO `account` ( `account_name`, `money`) VALUES ( ?, ?)";
        return jdbcTemplate.update(sql,account.getAccountName(),account.getMoney());
    }

    @Override
    public int deleteAccountById(int id) {
        String sql = "delete from account where id =?";
        return jdbcTemplate.update(sql,id);
    }

    @Override
    public int updateAccountById(Account account) {
        String sql = "update account set account_name=?,money=? where id = ?";
        return jdbcTemplate.update(sql,account.getAccountName(),account.getMoney(),account.getId());
    }

    @Override
    public Account findAccountById(int id) {
        String sql = "select * from account where id =?";
        return jdbcTemplate.queryForObject(sql, new AccountMapper(),id);
    }

    @Override
    public List<Account> findAll() {
        //写sql
        String sql = "select * from account";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Account.class));
    }

    @Override
    public Integer countAccount() {
        String sql = "select count(1) from account";
        return jdbcTemplate.queryForObject(sql,Integer.class );
    }

    @Override
    public Integer dealMoney(Integer id, Float money) {
        String sql = "update account set money = money+? where id = ? and money+?>=0";
        return jdbcTemplate.update(sql, money,id,money);
    }

}
