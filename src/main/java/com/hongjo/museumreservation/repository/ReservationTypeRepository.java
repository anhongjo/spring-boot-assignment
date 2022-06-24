package com.hongjo.museumreservation.repository;

import com.hongjo.museumreservation.entity.ReservationTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReservationTypeRepository extends JpaRepository<ReservationTypeEntity, Integer> {
    List<ReservationTypeEntity> findAll();
}
