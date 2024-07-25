package com.solana.main.dao;

import com.solana.main.model.IdeaCategoryMappingId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IdeaCategoryMappingDAO extends JpaRepository<IdeaCategoryMappingDAO, IdeaCategoryMappingId>{
}
