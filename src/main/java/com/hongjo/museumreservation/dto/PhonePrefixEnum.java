package com.hongjo.museumreservation.dto;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum PhonePrefixEnum {
    WCDMA("010"),
    SEOUL("02");

    final String prefix;
}
