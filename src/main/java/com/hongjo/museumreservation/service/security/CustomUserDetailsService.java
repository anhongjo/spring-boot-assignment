package com.hongjo.museumreservation.service.security;

import com.hongjo.museumreservation.dto.CustomUserDetails;
import com.hongjo.museumreservation.entity.UserEntity;
import com.hongjo.museumreservation.repository.UserRepository;
import com.hongjo.museumreservation.vo.UserSessionVo;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpSession;

// 참고: https://dev-coco.tistory.com/120
@RequiredArgsConstructor
@Component
@Log4j2
public class CustomUserDetailsService implements UserDetailsService {
    private final UserRepository userRepository;
    private final HttpSession httpSession;

    // User가 DB에 있는지 확인
    @Override
    public UserDetails loadUserByUsername(String username) {
        UserEntity userEntity = userRepository.findByUsername(username).orElseThrow(() ->
                new UsernameNotFoundException("User Not Found: " + username)
        );
        log.info("UserEntity: {}", userEntity);
        httpSession.setAttribute("user", new UserSessionVo(userEntity));

        return new CustomUserDetails(userEntity);
    }

}
