package com.example.internproject.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import org.springframework.data.annotation.Id;
import lombok.Getter;
import lombok.Setter;







@Entity
@Table(name = "doctors")
@Getter
@Setter
public class Doctor {

    @jakarta.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String Username;
    private String password;
    private String specialty;
    private int experienceYears;
    private String bio;
    private String photoUrl;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}

