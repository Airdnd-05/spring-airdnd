package com.spring.airdnd.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "rooms")
@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "room_id")
    private Long roomId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "host_id", nullable = false)
    @ToString.Exclude
    private Host host;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "location_id", nullable = false)
    @ToString.Exclude
    private Location location;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "building_type_id", nullable = false)
    @ToString.Exclude
    private BuildingType buildingType;

    @Column(name = "room_name", nullable = false, length = 50)
    private String roomName;

    @Column(name = "room_info", nullable = false)
    private String roomInfo;

    @Column(name = "room_guest_favorite", nullable = false)
    private Boolean roomGuestFavorite;

    @Column(name = "room_price_per_day", nullable = false)
    private Long roomPricePerDay;

    @Column(name = "room_description", nullable = false, length = 1000)
    private String roomDescription;

    @Column(name = "room_available_start_date", nullable = false)
    private LocalDateTime roomAvailableStartDate;

    @Column(name = "room_available_end_date", nullable = false)
    private LocalDateTime roomAvailableEndDate;

    @Column(name = "room_is_infant", nullable = false)
    private Boolean roomIsInfant;

    @Column(name = "room_is_pet", nullable = false)
    private Boolean roomIsPet;

    @Column(name = "room_available_guest_count", nullable = false)
    private Integer roomAvailableGuestCount;

    @Column(name = "room_bedroom_count", nullable = false)
    private Integer roomBedroomCount;

    @Column(name = "room_bed_count", nullable = false)
    private Integer roomBedCount;

    @Column(name = "room_bathroom_count", nullable = false)
    private Integer roomBathroomCount;

    @Column(name = "room_self_check_in", nullable = false)
    private Boolean roomSelfCheckIn;

    @Column(name = "room_immediate_reservation", nullable = false)
    private Boolean roomImmediateReservation;

    @Column(name = "room_rent_type", nullable = false, length = 30)
    private String roomRentType;

    @Column(name = "room_url_1", nullable = false)
    @ToString.Exclude
    private String roomUrl1;

    @Column(name = "room_url_2", nullable = false)
    @ToString.Exclude
    private String roomUrl2;

    @Column(name = "room_url_3", nullable = false)
    @ToString.Exclude
    private String roomUrl3;

    @Column(name = "room_url_4", nullable = false)
    @ToString.Exclude
    private String roomUrl4;

    @Column(name = "room_url_5", nullable = false)
    @ToString.Exclude
    private String roomUrl5;

    @Column(name = "room_cleanliness_avg")
    private Float roomCleanlinessAvg;

    @Column(name = "room_accuracy_avg")
    private Float roomAccuracyAvg;

    @Column(name = "room_check_in_avg")
    private Float roomCheckInAvg;

    @Column(name = "room_communication_avg")
    private Float roomCommunicationAvg;

    @Column(name = "room_location_avg")
    private Float roomLocationAvg;

    @Column(name = "room_value_avg")
    private Float roomValueAvg;

    @Column(name = "room_overall_avg")
    private Float roomOverallAvg;

    @Column(name = "room_review_count")
    private Integer roomReviewCount;

    @Column(name = "room_latitude", nullable = false)
    private BigDecimal roomLatitude;

    @Column(name = "room_longitude", nullable = false)
    private BigDecimal roomLongitude;

    @Column(name = "room_distance_to_seoul", nullable = false)
    private Integer roomDistanceToSeoul;

    @OneToMany(mappedBy = "room", fetch = FetchType.LAZY)
    @ToString.Exclude
    private List<AmenityRoom> amenityRoomList = new ArrayList<>();

    @OneToMany(mappedBy = "room", fetch = FetchType.LAZY)
    @ToString.Exclude
    private List<RoomCategory> roomsCategoryList = new ArrayList<>();

    @OneToMany(mappedBy = "room", fetch = FetchType.LAZY)
    @ToString.Exclude
    private List<Review> reviewList = new ArrayList<>();

    @OneToMany(mappedBy = "room", fetch = FetchType.LAZY)
    @ToString.Exclude
    private List<Reservation> reservationList = new ArrayList<>();

    @OneToMany(mappedBy = "room", fetch = FetchType.LAZY)
    @ToString.Exclude
    private List<WishList> wishListList = new ArrayList<>();
}
