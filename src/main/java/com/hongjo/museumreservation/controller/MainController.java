package com.hongjo.museumreservation.controller;

import com.hongjo.museumreservation.dto.CustomUserDetails;
import com.hongjo.museumreservation.vo.UserSessionVo;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@AllArgsConstructor
@Log4j2
public class MainController {
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
        final UserSessionVo userSessionVo = new UserSessionVo(customUserDetails.getUserEntity());
        log.info("userSessionVo: " + userSessionVo);
        return "content/home";
    }
}
