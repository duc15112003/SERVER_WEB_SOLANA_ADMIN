package com.solana.main.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Role_Mapping")
@IdClass(RoleMappingId.class)
public class RoleMapping {
    @Id
    @ManyToOne
    @JoinColumn(name = "username")
    private Account account;

    @Id
    @ManyToOne
    @JoinColumn(name = "id_role")
    private Role role;

    private String description;

    // Getters and setters
}
