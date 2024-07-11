package com.solana.main.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "Report")
public class Report {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String report;

    private String reply;

    @Column(name = "createAt", nullable = false)
    private LocalDateTime createAt;

    private LocalDateTime replyAt;
    private String status;

    @ManyToOne
    @JoinColumn(name = "username")
    private Account account;

    @ManyToOne
    @JoinColumn(name = "id_idea")
    private Idea idea;

    @ManyToOne
    @JoinColumn(name = "id_feedback")
    private Feedback feedback;

    // Getters and setters
}
