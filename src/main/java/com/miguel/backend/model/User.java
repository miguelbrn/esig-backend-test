package com.miguel.backend.model;

import javax.persistence.Column;
import javax.persistence.Entity;

import lombok.Data;

@Data
@Entity
public class User {
    
    @Column(length = 50, nullable = false)
    private String name;

    @Column(unique = true, nullable = false)
    private String email;

    @Column(length = 12, nullable = false)
    private String password;

    @Column(length = 12, nullable = false)
    private String role;
}
