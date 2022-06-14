package com.hongjo.museumreservation.controller;

import com.hongjo.museumreservation.dto.UserDto;
import com.hongjo.museumreservation.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@AllArgsConstructor
@RequestMapping(value = "/user")
public class UserController {
    private final UserService userService;

    @GetMapping(value = "/register")
    public String getRegister() {
        return "/content/home";
    }

    @PostMapping("/register")
    public String postRegister(UserDto userDto) {
        userService.registerUser(userDto);

        return "redirect:/login";
    }
}
