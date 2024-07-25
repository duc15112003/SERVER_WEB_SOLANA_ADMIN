package com.solana.main.dto;

import com.solana.main.model.Account;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReportDTO {

    private Long id;
    private String report;
    private String reply;
    private LocalDateTime createAt;
    private LocalDateTime replyAt;
    private String status;
    private AccountDTO account;
    private IdeaDTO idea;
    private FeedbackDTO feedback;

}
