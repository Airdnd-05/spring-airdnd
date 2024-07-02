package com.spring.airdnd.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "reservations")
@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString
public class Reservation{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "reservation_id")
    private Long reservationId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "room_id", nullable = false)
    @ToString.Exclude
    private Room room;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    @ToString.Exclude
    private User user;

    @Column(name = "reservation_check_in", nullable = false)
    private LocalDateTime reservationCheckIn;

    @Column(name = "reservation_check_out", nullable = false)
    private LocalDateTime reservationCheckOut;

    @Column(name = "reservation_pet_count")
    private Integer reservationPetCount;

    @Column(name = "reservation_guest_count", nullable = false)
    private Integer reservationGuestCount;

    @Column(name = "reservation_infant_count")
    private Integer reservationInfantCount;

    @Column(name = "reservation_date", nullable = false)
    private LocalDateTime reservationDate;
}