package com.solana.main.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "Feedback")
public class Feedback {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String feedback;

    @Column(name = "createAt", nullable = false)
    private LocalDateTime createAt;

    private String status;
    private Integer rate;

    @ManyToOne
    @JoinColumn(name = "username")
    private Account account;

    @ManyToOne
    @JoinColumn(name = "id_idea")
    private Idea idea;

    // Getters and setters
}
