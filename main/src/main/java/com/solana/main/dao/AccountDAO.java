package com.solana.main.dao;

import com.solana.main.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

public interface AccountDAO extends JpaRepository<Account,String> {
    @Query("select acc from Account acc where acc.username=?1")
    Account findByUsername(String username);
}
