package com.hongjo.museumreservation.dto;

import com.hongjo.museumreservation.entity.UserEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    private String username;
    private String password;
    private String name;
    private String email;
    private LocalDate birthday;
    private UserRole role;

    public UserEntity toEntity() {
        return UserEntity.builder()
                .username(username)
                .password(password)
                .email(email)
                .birthday(birthday)
                .role(role.USER)
                .build();
    }
}
