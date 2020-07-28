package com.wmq.spring.mapper;

import com.wmq.spring.pojo.Account;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author Wang
 * @version 1.0.0
 * @createTime 2020年07月26日 21:40:00
 * @Description: TODO
 */
public class AccountMapper implements RowMapper {

    @Override
    public Object mapRow(ResultSet resultSet, int i) throws SQLException {
        Account account = new Account();
        account.setId(resultSet.getInt("id"));
        account.setAccountName(resultSet.getString("account_name"));
        account.setMoney(resultSet.getFloat("money"));
        return account;
    }
}
