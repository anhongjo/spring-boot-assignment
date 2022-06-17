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
                .name(name)
                .phone(phone)
                .role(UserRole.USER)
                .build();
    }

    // From Entity -> DTO
    public UserDto(UserEntity userEntity) {
        this.username = userEntity.getUsername();
        this.name = userEntity.getName();
        this.phone = userEntity.getPhone();
        this.role = userEntity.getRole();
    }

    // From CustomUserDetails -> DTO
    public UserDto(CustomUserDetails customUserDetails) {
        this.username = customUserDetails.getUsername();
        this.name = customUserDetails.getUserEntity().getName();
        this.phone = customUserDetails.getUserEntity().getPhone();
        this.role = customUserDetails.getUserEntity().getRole();
    }
}
