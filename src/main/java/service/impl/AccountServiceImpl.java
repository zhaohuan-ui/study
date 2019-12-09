package service.impl;

import dao.AccountDao;
import pojo.Account;
import service.AccountService;

import java.util.List;

public class AccountServiceImpl implements AccountService {
    AccountDao accountDao;

    @Override
    public List<Account> findAll() {
        return accountDao.findAll();
    }
    public void setAccountServiceImpl(AccountDao accountDao){
        this.accountDao =accountDao;
    }
}
