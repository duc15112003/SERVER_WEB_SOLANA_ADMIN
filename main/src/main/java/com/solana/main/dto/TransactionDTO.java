package com.solana.main.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransactionDTO {

    private Long id;

    private String transactionType;

    private String description;
    private String status;
    private BigDecimal amount;
    private BigDecimal feeTransaction;
    private LocalDateTime timestamp;
    private String blockHash;
    private AccountDTO account;
}
