package com.solana.main.model;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "Transaction")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "transaction_type")
    private String transactionType;

    private String description;
    private String status;
    private BigDecimal amount;
    private BigDecimal feeTransaction;
    private LocalDateTime timestamp;
    private String blockHash;

    @ManyToOne
    @JoinColumn(name = "username")
    private Account account;

    // Getters and setters
}
