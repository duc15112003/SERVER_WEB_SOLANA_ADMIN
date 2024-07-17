package com.solana.main.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Role_Mapping")
public class RoleMapping {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "username")
    private Account account;
    @ManyToOne
    @JoinColumn(name = "id_role")
    private Role role;
    private String description;
    // Getters and setters
}
