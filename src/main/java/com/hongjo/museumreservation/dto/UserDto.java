package com.hongjo.museumreservation.dto;

import com.hongjo.museumreservation.entity.UserEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    private String username;
    private String password;
    private String name;
    private String phone;
    private UserRole role;

    public UserEntity toEntity() {
        return UserEntity.builder()
                .username(username)
                .password(password)
                .phone(phone)
                .role(role)
                .build();
    }
}
