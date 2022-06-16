package com.hongjo.museumreservation.dto;

import com.hongjo.museumreservation.entity.UserEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    private String username;
    private String password;
    private String name;
    private PhonePrefixEnum phonePrefix;
    private String phone;
    private UserRole role;

    public UserEntity toEntity() {
        return UserEntity.builder()
                .username(username)
                .password(password)
                .phonePrefix(phonePrefix)
                .phone(phone)
                .role(role.USER)
                .build();
    }
}
