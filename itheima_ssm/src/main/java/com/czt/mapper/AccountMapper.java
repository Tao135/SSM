package com.czt.mapper;

import com.czt.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface AccountMapper {

    @Insert("INSERT INTO account VALUES(#{id},#{name},#{money})")
    void save(Account account);

    @Select("SELECT * FROM account")
    List<Account> findAll();
}
