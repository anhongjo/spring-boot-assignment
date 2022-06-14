package com.hongjo.museumreservation.vo;

import com.hongjo.museumreservation.dto.UserRole;
import com.hongjo.museumreservation.entity.UserEntity;
import lombok.Getter;

import java.io.Serializable;
import java.time.LocalDate;

@Getter
public class UserSessionVo implements Serializable {
    private final String username;
    private final String password;
    private final String name;
    private final String email;
    private final LocalDate birthday;
    private final UserRole role;

    /* Entity -> DTO */
    public UserSessionVo(UserEntity user) {
        this.username = user.getUsername();
        this.password = user.getPassword();
        this.name = user.getName();
        this.email = user.getEmail();
        this.birthday = user.getBirthday();
        this.role = user.getRole();
    }
}
