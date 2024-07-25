package com.solana.main.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class IdeaDTO {

    private Long id;
    private String title;
    private String description;
    private String status;
    private String image;
    private LocalDateTime createdAt;
    private LocalDateTime updateAt;
    private LocalDateTime endAt;
    private Long countFeedback;
    private BigDecimal awardForOneFeedback;
    private AccountDTO accountDTO;

    // Getters and setters
}
