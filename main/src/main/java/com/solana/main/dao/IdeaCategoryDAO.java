package com.solana.main.dao;

import com.solana.main.model.IdeaCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IdeaCategoryDAO extends JpaRepository<IdeaCategory, Long> {
}
