package com.spring.airdnd.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long userId;

    @Column(name = "user_lastname", nullable = false, length = 50)
    private String userLastname;

    @Column(name = "user_firstname", nullable = false, length = 50)
    private String userFirstname;

    @Column(name = "user_nickname", length = 50)
    private String userNickname;

    @Column(name = "user_email", nullable = false, length = 100)
    private String userEmail;

    @Column(name = "user_phone", length = 20)
    private String userPhone;

    @Column(name = "user_government_id")
    private Boolean userGovernmentId;

    @Column(name = "user_address", length = 255)
    private String userAddress;

    @Column(name = "user_emergency_contact", length = 255)
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

//    @Builder
//    private User(String userLastname, String userFirstname, String userNickname, String userEmail, String userPhone, Boolean userGovernmentId, String userAddress, String userEmergencyContact, Boolean userIsHost) {
//        this.userLastname = userLastname;
//        this.userFirstname = userFirstname;
//        this.userNickname = userNickname;
//        this.userEmail = userEmail;
//        this.userPhone = userPhone;
//        this.userGovernmentId = userGovernmentId;
//        this.userAddress = userAddress;
//        this.userEmergencyContact = userEmergencyContact;
//        this.userIsHost = userIsHost;
//    }
}
