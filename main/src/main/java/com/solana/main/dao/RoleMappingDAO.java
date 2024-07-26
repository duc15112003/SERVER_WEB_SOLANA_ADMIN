package com.solana.main.dao;

import com.solana.main.model.RoleMapping;
<<<<<<< HEAD
import com.solana.main.model.RoleMappingId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleMappingDAO extends JpaRepository<RoleMapping, RoleMappingId> {

=======
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleMappingDAO extends JpaRepository<RoleMapping, Long> {
>>>>>>> origin/dev-duc
}
