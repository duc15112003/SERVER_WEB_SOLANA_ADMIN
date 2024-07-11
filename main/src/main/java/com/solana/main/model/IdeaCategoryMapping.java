package com.solana.main.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Idea_Category_Mapping")
@IdClass(IdeaCategoryMappingId.class)
public class IdeaCategoryMapping {
    @Id
    @ManyToOne
    @JoinColumn(name = "IdeaID")
    private Idea idea;

    @Id
    @ManyToOne
    @JoinColumn(name = "CategoryID")
    private IdeaCategory ideaCategory;

    // Getters and setters
}
