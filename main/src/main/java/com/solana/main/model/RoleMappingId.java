package com.solana.main.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class RoleMappingId implements Serializable {
    private String account;
    private Long role;

    // Getters, setters, equals, and hashCode
}
