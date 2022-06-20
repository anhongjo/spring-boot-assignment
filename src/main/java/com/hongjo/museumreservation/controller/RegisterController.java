package com.hongjo.museumreservation.controller;

import com.hongjo.museumreservation.dto.UserDto;
import com.hongjo.museumreservation.entity.UserEntity;
import com.hongjo.museumreservation.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;

@Log4j2
@Controller
@RequestMapping(value = "/register")
@RequiredArgsConstructor
public class RegisterController {
    private final UserService userService;

    @GetMapping(value = "")
    @PreAuthorize("isAnonymous()")
    public String getRegister() {
        return "/content/register";
    }

    @PostMapping("")
    @PreAuthorize("isAnonymous()")
    public String postRegister(UserDto userDto) {
        log.info("UserDto: " + userDto);
        userService.registerUser(userDto);

        return "redirect:/login?new_user=true";
    }

    @PostMapping(value = "/check_id")
    @ResponseBody
    public Boolean checkId(String username) {
        log.info("Received Check ID Request: " + username);
        Optional<UserEntity> userEntity = userService.findUserByUsername(username);
        log.info("Username Ability: " + userEntity.isEmpty());
        // True = username 사용 가능
        return userEntity.isEmpty();
    }
}
