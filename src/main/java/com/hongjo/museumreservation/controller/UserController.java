package com.hongjo.museumreservation.controller;

import com.hongjo.museumreservation.service.UserService;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Log4j2
@Controller
@AllArgsConstructor
@RequestMapping(value = "/user")
public class UserController {
    private final UserService userService;
}
