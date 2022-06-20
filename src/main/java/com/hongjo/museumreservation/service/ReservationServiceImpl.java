package com.hongjo.museumreservation.service;

import com.hongjo.museumreservation.vo.ReservationDateVo;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Log4j2
@Service
public class ReservationServiceImpl implements ReservationService {
    @Override
    // 최근 2주 중 월요일을 제외한 날짜를 Return
    public List<ReservationDateVo> getAvailableDate() {
        List<ReservationDateVo> result = new ArrayList<>();
        for(int i = 1; i < 15; i++) {
            LocalDate localDate = LocalDate.now().plusDays(i);
            // 월요일인 경우 1
            if(localDate.getDayOfWeek().getValue() != 1) {
                ReservationDateVo reservationDateVo = new ReservationDateVo(localDate);
                result.add(reservationDateVo);
            }
        }

        return result;
    }
}
