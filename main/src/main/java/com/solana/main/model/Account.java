package com.solana.main.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Data
@Entity
@Table(name = "Account")
public class Account {
    @Id
    private String username;
    @Column(nullable = false)
    private String password;

    @ManyToOne
    @JoinColumn(name = "id_user")
    private Customer user;
    @OneToMany(mappedBy = "account")
    private Set<RoleMapping> roleMappings;
    @ManyToOne
    @JoinColumn(name = "id_admin")
    private Staff admin;

    // Getters and setters
}
