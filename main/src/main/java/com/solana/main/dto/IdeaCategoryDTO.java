package com.solana.main.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class IdeaCategoryDTO {

    private Long id;
    private String name;
    private String description;
    private LocalDate createAt;
    private LocalDate deleteAt;

}
