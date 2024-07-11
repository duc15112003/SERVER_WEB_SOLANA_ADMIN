package com.solana.main.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "Notification")
public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "username", nullable = false)
    private Account account;

    @Column(nullable = false)
    private String message;

    @Column(name = "CreatedAt", nullable = false)
    private LocalDateTime createdAt;

    // Getters and setters
}
