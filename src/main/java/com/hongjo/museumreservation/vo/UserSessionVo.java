package com.hongjo.museumreservation.vo;

import com.hongjo.museumreservation.dto.UserRole;
import com.hongjo.museumreservation.entity.UserEntity;
import lombok.Getter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@ToString
public class UserSessionVo implements Serializable {
    private final String username;
    private final String password;
    private final String name;
    private final String phone;
    private final UserRole role;

    // Entity -> Vo
    public UserSessionVo(UserEntity user) {
        this.username = user.getUsername();
        this.password = user.getPassword();
        this.phone = user.getPhone();
        this.name = user.getName();
        this.role = user.getRole();
    }
}
