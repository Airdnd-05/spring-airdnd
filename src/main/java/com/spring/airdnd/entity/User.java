package com.spring.airdnd.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long userId;

    @Column(name = "user_lastname", nullable = false)
    private String userLastname;

    @Column(name = "user_firstname", nullable = false)
    private String userFirstname;

    @Column(name = "user_nickname")
    private String userNickname;

    @Column(name = "user_email", nullable = false)
    private String userEmail;

    @Column(name = "user_phone")
    private String userPhone;

    @Column(name = "user_government_id")
    private Boolean userGovernmentId;

    @Column(name = "user_address")
    private String userAddress;

    @Column(name = "user_emergency_contact")
    private String userEmergencyContact;

    @Column(name = "user_is_host", nullable = false)
    private Boolean userIsHost;

    @OneToOne(mappedBy = "user", fetch = FetchType.LAZY)
    private Host host;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private List<Review> reviewList = new ArrayList<>();

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private List<Reservation> reservationList = new ArrayList<>();

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private List<WishList> wishListList = new ArrayList<>();
}