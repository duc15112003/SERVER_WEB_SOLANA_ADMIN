package com.solana.main.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FeedbackDTO {

    private Long id;
    private String feedback;
    private LocalDateTime createAt;
    private String status;
    private Integer rate;
    private AccountDTO accountDTO;
    private IdeaDTO ideaDTO;
}
