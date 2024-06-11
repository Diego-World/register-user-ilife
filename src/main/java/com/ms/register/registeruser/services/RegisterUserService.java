package com.ms.register.registeruser.services;

import com.ms.register.registeruser.dtos.RegisterUserDto;
import com.ms.register.registeruser.models.RegisterUserModel;
import com.ms.register.registeruser.repositories.RegisterUserRepository;
import jakarta.validation.ValidationException;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Service
public class RegisterUserService {
    final RegisterUserRepository registerUserRepository;

    public RegisterUserService(RegisterUserRepository registerUserRepository) {
        this.registerUserRepository = registerUserRepository;
    }

    public void saveNewUser(RegisterUserDto registerUserDto) throws ValidationException{
        if (!registerUserDto.getPassword().equals(registerUserDto.getConfirmPassword())) {
            throw new ValidationException("As senhas não coincidem");
        }

//        Integer result = registerUserRepository.existsByEmail(registerUserDto.getEmail());
//        System.out.println(result);
        if (registerUserRepository.existsByEmail(registerUserDto.getEmail())) {
            throw new ValidationException("Usuário já registrado, faça login");
        }



        RegisterUserModel newUser = new RegisterUserModel();
        BeanUtils.copyProperties(registerUserDto, newUser);
        newUser.setBirth(LocalDate.parse(registerUserDto.getBirthDate()));
        newUser.setRegisterDate(LocalDateTime.now());
        registerUserRepository.save(newUser);
    }

}
