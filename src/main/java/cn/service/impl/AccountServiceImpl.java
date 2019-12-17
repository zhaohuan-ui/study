package cn.service.impl;

import cn.dao.AccountDao;
import cn.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cn.pojo.Account;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    AccountDao accountDao;

    @Override
    public List<Account> findAll() {
        return accountDao.findAll();
    }
    public void setAccountServiceImpl(AccountDao accountDao){
        this.accountDao =accountDao;
    }
}
