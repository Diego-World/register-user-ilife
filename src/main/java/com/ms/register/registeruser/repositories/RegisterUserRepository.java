package com.ms.register.registeruser.repositories;

import com.ms.register.registeruser.models.RegisterUserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.UUID;

public interface RegisterUserRepository extends JpaRepository<RegisterUserModel, UUID> {
    boolean existsByEmail(String email);

}