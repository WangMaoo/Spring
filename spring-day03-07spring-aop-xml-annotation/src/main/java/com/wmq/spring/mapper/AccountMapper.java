package com.wmq.spring.mapper;

import com.wmq.spring.pojo.Account;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @Description：
 */
public class AccountMapper implements RowMapper<Account> {


    @Override
    public Account mapRow(ResultSet resultSet, int i) throws SQLException {
        Account account = new Account();
        account.setId(resultSet.getInt("id"));
        account.setAccountName(resultSet.getString("account_names"));
        account.setMoney(resultSet.getFloat("money"));
        return account;
    }
}
