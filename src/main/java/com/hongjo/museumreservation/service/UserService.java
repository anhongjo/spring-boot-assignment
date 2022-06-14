package com.hongjo.museumreservation.service;

import com.hongjo.museumreservation.dto.UserDto;

public interface UserService {
    Long registerUser(UserDto dto);
}
