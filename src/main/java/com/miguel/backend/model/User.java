package com.miguel.backend.model;

import javax.persistence.Column;
import javax.persistence.Entity;

import lombok.Data;

@Data
@Entity
public class User {
    
    @Column(length = 50)
    private String name;

    @Column(unique = true)
    private String email;

    @Column(length = 12)
    private String password;

    @Column(length = 12)
    private String role;
}
