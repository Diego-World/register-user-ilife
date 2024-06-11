package com.ms.register.registeruser.models;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;
/* uniqueConstraints = {@UniqueConstraint(columnNames = {"REU_STR_EMAIL"})} */
@Entity
@Table(name = "TB_REGISTER_USER")
public class RegisterUserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "REU_UUID_ID")
    private UUID id;
    @Column(name = "REU_STR_NAME", nullable = false)
    private String name;
    @Column(name = "REU_STR_EMAIL", nullable = false)
    private String email;
    @Column(name = "REU_DATE_BIRTH", nullable = false, columnDefinition = "DATE")
    private LocalDate birth;
    @Column(name = "REU_STR_PASSWORD", nullable = false)
    private String password;
    @Column(name = "REU_STR_CONFPASSWORD", nullable = false)
    private String confirmPassword;
    @Column(name = "REU_DATE_REGISTERDATE", nullable = false)
    private LocalDateTime registerDate;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public LocalDate getBirth() {
        return birth;
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public LocalDateTime getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(LocalDateTime registerDate) {
        this.registerDate = registerDate;
    }
}
