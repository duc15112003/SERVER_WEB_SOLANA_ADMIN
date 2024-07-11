package com.solana.main.model;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "Ideas")
public class Idea {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private String status;

    @Column(nullable = false)
    private String image;

    @Column(name = "CreatedAt", nullable = false)
    private LocalDateTime createdAt;

    @Column(name = "updateAt")
    private LocalDateTime updateAt;

    @Column(name = "endAt", nullable = false)
    private LocalDateTime endAt;

    @Column(name = "count_feedback")
    private Long countFeedback;

    @Column(name = "award_for_one_feedback", precision = 18, scale = 8)
    private BigDecimal awardForOneFeedback;

    @ManyToOne
    @JoinColumn(name = "username", nullable = false)
    private Account account;

    // Getters and setters
}
