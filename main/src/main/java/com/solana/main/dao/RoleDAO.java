package com.solana.main.dao;

import com.solana.main.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleDAO  extends JpaRepository<Role,Long> {
}
