package com.hongjo.museumreservation.controller;

import com.hongjo.museumreservation.service.ReservationService;
import com.hongjo.museumreservation.service.ReservationTypeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Log4j2
@Controller
@RequestMapping(value = "/reservation")
@RequiredArgsConstructor
public class ReservationController {
    private final ReservationTypeService reservationTypeService;
    private final ReservationService reservationService;

    @PreAuthorize("isAuthenticated()")
    @GetMapping(value = "")
    public String getReservationPage (Model model) {
        model.addAttribute("types", reservationTypeService.getAllReservationType());
        model.addAttribute("availableDate", reservationService.getAvailableDate());

        return "content/reservation";
    }
}
