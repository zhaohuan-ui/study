package cn.dao;

import cn.pojo.Account;

import java.util.List;
//@Component
public interface AccountDao {
    public List<Account> findAll();

    void update(Integer id);
}
