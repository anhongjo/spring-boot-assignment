package com.hongjo.museumreservation.repository;

import com.hongjo.museumreservation.entity.ReservationTypeEntity;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ReservationTypeRepository {
    Optional<ReservationTypeEntity> getAllReservationType();
}
