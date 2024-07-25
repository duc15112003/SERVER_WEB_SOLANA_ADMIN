package com.solana.main.dao;

import com.solana.main.model.RoleMapping;
import com.solana.main.model.RoleMappingId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleMappingDAO extends JpaRepository<RoleMapping, RoleMappingId> {

}
