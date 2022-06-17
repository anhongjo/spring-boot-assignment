package com.hongjo.museumreservation.entity;

import lombok.*;

import javax.persistence.*;

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

    @ManyToOne
    @JoinColumn(name="reserved_user")
    private UserEntity userEntity;

    @ManyToOne
    @JoinColumn(name="reservation_type")
    private ReservationTypeEntity reservationTypeEntity;
}
