package com.solana.main.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StaffDTO {

    private Long id;
    private String firstname;
    private String lastname;
    private String avatar;
    private LocalDate birthday;
    private String address;
    private String phoneNumber;
    private String publicKey;
    private LocalDate createAt;
}
