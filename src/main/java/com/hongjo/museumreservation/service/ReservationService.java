package com.hongjo.museumreservation.service;

import com.hongjo.museumreservation.vo.ReservationDateVo;

import java.util.List;

public interface ReservationService {
    List<ReservationDateVo> getAvailableDate();
}
