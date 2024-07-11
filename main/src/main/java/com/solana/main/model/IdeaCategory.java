package com.solana.main.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Idea_Category")
public class IdeaCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String description;

    @Column(name = "createAt", nullable = false)
    private LocalDate createAt;

    @Column(name = "deleteAt", nullable = false)
    private LocalDate deleteAt;

    // Getters and setters
}
