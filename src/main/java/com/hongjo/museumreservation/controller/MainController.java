package com.hongjo.museumreservation.controller;

import com.hongjo.museumreservation.dto.UserDto;
import com.hongjo.museumreservation.service.UserService;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@AllArgsConstructor
@Log4j2
public class MainController {
    private final UserService userService;

    @GetMapping(value = "/home")
    public String goHome() {
        return "content/home";
    }

    @GetMapping(value = "/login")
    public String getLogin(Model model, @RequestParam(name = "fail", required = false) boolean fail) {
        log.info("FAIL STATUS: " + fail);
        model.addAttribute("fail", fail);

        return "/content/login";
    }

    @GetMapping(value = "/register")
    public String getRegister() {
        return "/content/register";
    }

    @PostMapping("/register")
    public String postRegister(UserDto userDto) {
        userService.registerUser(userDto);

        return "redirect:/login";
    }
}
