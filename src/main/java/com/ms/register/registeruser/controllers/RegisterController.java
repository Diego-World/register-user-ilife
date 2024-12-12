package com.ms.register.registeruser.controllers;

import com.ms.register.registeruser.dtos.RegisterUserDto;
import com.ms.register.registeruser.services.RegisterUserService;
import jakarta.validation.Valid;
import jakarta.validation.ValidationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/uregister")
@CrossOrigin("*")
public class RegisterController {

    final RegisterUserService registerUserService;

    public RegisterController(RegisterUserService registerUserService) {
        this.registerUserService = registerUserService;
    }

   @PostMapping("")
    public ResponseEntity<String> registerNewUser(@Valid @RequestBody RegisterUserDto registerUserDto) {
        try {
            registerUserService.saveNewUser(registerUserDto);
            return ResponseEntity.status(HttpStatus.CREATED).body("Usuário registrado com sucesso");
        } catch (ValidationException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Erro de validação: " + e.getMessage());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Erro ao registrar usuário: " + e.getMessage());
        }
    }

}