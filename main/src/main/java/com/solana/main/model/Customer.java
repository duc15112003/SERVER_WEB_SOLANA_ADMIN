package com.solana.main.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String firstname;

    @Column(nullable = false)
    private String lastname;

    @Column(nullable = false)
    private String avatar;

    @Column(nullable = false)
    private LocalDate birthday;

    @Column(nullable = false)
    private String address;

    @Column(name = "phone_number", nullable = false)
    private String phoneNumber;

    private String publicKey;

    @Column(name = "createAt", nullable = false)
    private LocalDate createAt;

    // Getters and setters
}
