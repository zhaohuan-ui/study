package dao;

import pojo.Account;

import java.util.List;

public interface AccountDao {
    public List<Account> findAll();
}
