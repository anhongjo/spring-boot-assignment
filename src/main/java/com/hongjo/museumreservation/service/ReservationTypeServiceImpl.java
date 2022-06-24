package com.hongjo.museumreservation.service;

import com.hongjo.museumreservation.entity.ReservationTypeEntity;
import com.hongjo.museumreservation.repository.ReservationTypeRepository;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;

@Log4j2
@Service
@AllArgsConstructor
public class ReservationTypeServiceImpl implements ReservationTypeService {
    private final ReservationTypeRepository reservationTypeRepository;

    @Override
    public List<ReservationTypeEntity> getAllReservationType() {
        return reservationTypeRepository.findAll();
    }
}
