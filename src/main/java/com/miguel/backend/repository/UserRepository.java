package com.miguel.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.miguel.backend.model.User;

@Repository
public class UserRepository extends JpaRepository<User, String>{
    User findByEmail(String email);
}
