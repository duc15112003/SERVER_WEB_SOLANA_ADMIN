package com.solana.main.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Data
@Entity
@Table(name = "Role")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String role_name;

    @OneToMany(mappedBy = "role")
    private Set<RoleMapping> roleMappings;

    // Getters and setters
}
