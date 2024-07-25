package com.solana.main.dto;

import java.time.LocalDate;

public class CustomerDTO {
    private Long id;
    private String firstname;
    private String lastname;
    private String avatar;
    private LocalDate birthday;
    private String address;
    private String phoneNumber;
    private String publicKey;
    private LocalDate createAt;

    public CustomerDTO() {
    }

    public CustomerDTO(Long id, String firstname, String lastname, String avatar, LocalDate birthday, String address, String phoneNumber, String publicKey, LocalDate createAt) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.avatar = avatar;
        this.birthday = birthday;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.publicKey = publicKey;
        this.createAt = createAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    public LocalDate getCreateAt() {
        return createAt;
    }

    public void setCreateAt(LocalDate createAt) {
        this.createAt = createAt;
    }

    @Override
    public String toString() {
        return "CustomerDTO{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", avatar='" + avatar + '\'' +
                ", birthday=" + birthday +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", publicKey='" + publicKey + '\'' +
                ", createAt=" + createAt +
                '}';
    }
}
