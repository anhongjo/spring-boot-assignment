package com.hongjo.museumreservation.controller;

import com.hongjo.museumreservation.dto.CustomUserDetails;
import com.hongjo.museumreservation.dto.UserDto;
import com.hongjo.museumreservation.entity.UserEntity;
import com.hongjo.museumreservation.service.UserService;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.apache.catalina.User;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;

@Controller
@AllArgsConstructor
@Log4j2
public class MainController {
    private final UserService userService;

    @GetMapping(value = {"/home", "/"})
    public String goHome() {
        return "content/home";
    }

    @GetMapping(value = "/login")
    public String getLogin(Model model, @RequestParam(name = "fail", required = false) boolean fail,
                           @RequestParam(name = "new_user", required = false) boolean newUser) {
        log.info("Received /login Request");

        log.info("FAIL STATUS: " + fail);
        model.addAttribute("fail", fail);
        log.info("newUser STATUS: " + newUser);
        model.addAttribute("newUser", newUser);

        return "/content/login";
    }

    @GetMapping(value = "/check_security")
    public String getSecurity(@AuthenticationPrincipal CustomUserDetails customUserDetails) {
        final UserDto userDto = new UserDto(customUserDetails);
        log.info("userDto: " + userDto);
        return "content/home";
    }
}
