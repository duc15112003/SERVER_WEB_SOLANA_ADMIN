package com.solana.main.dao;

import com.solana.main.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

public interface AccountDAO extends JpaRepository<Account,String> {
}
