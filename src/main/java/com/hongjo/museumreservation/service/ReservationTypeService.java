package com.hongjo.museumreservation.service;

import com.hongjo.museumreservation.entity.ReservationTypeEntity;

import java.util.Optional;

public interface ReservationTypeService {
    Optional<ReservationTypeEntity> getAllReservationType();
}
