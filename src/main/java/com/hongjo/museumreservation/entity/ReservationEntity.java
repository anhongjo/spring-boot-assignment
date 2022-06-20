package com.hongjo.museumreservation.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Table(name = "reservation")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ReservationEntity {
    @Id
    @GeneratedValue
    // 예약 번호
    private long id;

    @Column
    private short peopleNum;

    @Column
    private LocalDate reservationDate;

    @ManyToOne
    @JoinColumn(name="reserved_user")
    private UserEntity userEntity;

    @ManyToOne
    @JoinColumn(name="reservation_type")
    private ReservationTypeEntity reservationTypeEntity;
}
