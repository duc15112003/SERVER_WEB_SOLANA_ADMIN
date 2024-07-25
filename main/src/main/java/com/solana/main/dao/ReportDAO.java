package com.solana.main.dao;

import com.solana.main.model.Report;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReportDAO extends JpaRepository<Report,Long> {
}
