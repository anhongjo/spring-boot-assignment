package com.hongjo.museumreservation.entity;

import com.hongjo.museumreservation.dto.UserRole;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user")
public class UserEntity {
    @Id
    @GeneratedValue
    // 내부 분류용 ID
    private long id;

    // 로그인 할 때 ID로 사용 그래서 unique 옵션 넣음.
    @Column(unique = true, length = 100)
    private String username;

    @Column
    private String password;

    @Column
    private String phone;

    @Column(length = 50)
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private UserRole role;
}
