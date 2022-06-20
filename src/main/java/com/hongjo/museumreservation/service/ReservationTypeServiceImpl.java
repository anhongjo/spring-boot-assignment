package com.hongjo.museumreservation.service;

import com.hongjo.museumreservation.entity.ReservationTypeEntity;
import com.hongjo.museumreservation.repository.ReservationTypeRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Log4j2
@Service
@RequiredArgsConstructor
public class ReservationTypeServiceImpl implements ReservationTypeService {
    private final ReservationTypeRepository reservationTypeRepository;

    @Override
    public Optional<ReservationTypeEntity> getAllReservationType() {
        return reservationTypeRepository.getAllReservationType();
    }
}
