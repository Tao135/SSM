package com.czt.service;

import com.czt.domain.Account;

import java.io.IOException;
import java.util.List;

public interface AccountService {

    public void save(Account account);

    public List<Account> findAll();
}
