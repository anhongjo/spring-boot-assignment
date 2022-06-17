package com.hongjo.museumreservation.service;

import com.hongjo.museumreservation.dto.UserDto;
import com.hongjo.museumreservation.entity.UserEntity;

import java.util.Optional;

public interface UserService {
    Long registerUser(UserDto dto);
    Optional<UserEntity> findUserByUsername(String id);
    boolean checkUserValid(UserDto userDto);
}
