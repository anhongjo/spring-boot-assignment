package com.hongjo.museumreservation.vo;

import com.hongjo.museumreservation.dto.UserRole;
import com.hongjo.museumreservation.entity.UserEntity;
import lombok.Getter;

import java.io.Serializable;

@Getter
public class UserSessionVo implements Serializable {
    private final String username;
    private final String password;
    private final String name;
    private final String phone;
    private final UserRole role;

    /* Entity -> DTO */
    public UserSessionVo(UserEntity user) {
        this.username = user.getUsername();
        this.password = user.getPassword();
        this.phone = user.getPhone();
        this.name = user.getName();
        this.role = user.getRole();
    }
}
