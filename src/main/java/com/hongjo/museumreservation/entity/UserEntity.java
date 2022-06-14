package com.hongjo.museumreservation.entity;

import com.hongjo.museumreservation.dto.UserRole;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

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

    private String password;

    @Column
    private String name;

    @Column
    private String email;

    @Column
    private LocalDate birthday;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private UserRole role;
}
