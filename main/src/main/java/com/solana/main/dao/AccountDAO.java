package com.solana.main.dao;

import com.solana.main.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;

@Repository
public interface AccountDAO extends JpaRepository<Account,Long> {
    @Query("select acc from Account acc where acc.username=?1")
    Account findByUsername(String username);

}
