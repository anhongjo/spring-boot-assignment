package com.hongjo.museumreservation.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

// FE에서 날짜 요일을 표시하기 위한 VO
@Getter
@AllArgsConstructor
@ToString
public class ReservationDateVo {
    private final String date;
    private final String dayOfWeek;

    public ReservationDateVo(LocalDate localDate) {
        this.date = localDate.toString();
        this.dayOfWeek = localDate.getDayOfWeek().getDisplayName(TextStyle.SHORT, Locale.KOREAN);
    }
}
