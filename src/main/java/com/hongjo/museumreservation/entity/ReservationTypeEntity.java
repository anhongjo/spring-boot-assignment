package com.hongjo.museumreservation.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "reservation_type_entity")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ReservationTypeEntity {
    @Id
    @GeneratedValue
    private long id;

    @Column
    private String name;
}
