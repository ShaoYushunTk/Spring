package org.example.dao;

import org.apache.ibatis.annotations.*;
import org.example.domain.Account;

import java.util.List;

public interface AccountDao {

    @Update("update tb_account set money = money + #{money} where name = #{name}")
    void inMoney(@Param("name") String name, @Param("money") Double money);

    @Update("update tb_account set money = money - #{money} where name = #{name}")
    void outMoney(@Param("name") String name, @Param("money") Double money);
}