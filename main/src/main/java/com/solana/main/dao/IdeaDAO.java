package com.solana.main.dao;

import com.solana.main.model.Idea;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IdeaDAO extends JpaRepository<Idea, Long> {
}
