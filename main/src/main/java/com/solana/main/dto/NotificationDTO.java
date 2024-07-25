package com.solana.main.dto;

import com.solana.main.model.Account;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NotificationDTO {

    private Long id;
    private AccountDTO accountDTO;
    private String message;
    private LocalDateTime createdAt;

}
