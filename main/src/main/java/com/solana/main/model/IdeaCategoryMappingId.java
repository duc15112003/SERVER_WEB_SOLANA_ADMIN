package com.solana.main.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class IdeaCategoryMappingId implements Serializable {
    private Long idea;
    private Long ideaCategory;

    // Getters, setters, equals, and hashCode
}
