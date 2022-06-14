package com.hongjo.museumreservation.controller;

import com.hongjo.museumreservation.entity.UserEntity;
import com.hongjo.museumreservation.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;

@RestController
@NoArgsConstructor
@AllArgsConstructor
public class UserController {
    private UserRepository userRepository;

    // USER GENERATE TEST
    @GetMapping(value = "/user/generate/{role}/{username}/{password}")
    public UserEntity createUser(@ModelAttribute UserEntity userEntity) {
        return userRepository.save(userEntity);
    }
}
