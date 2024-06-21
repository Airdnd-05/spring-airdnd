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
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Room extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rooms_id")
    private Long roomsId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "host_id", nullable = false)
    private Host host;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "location_id", nullable = false)
    private Location location;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "building_id", nullable = false)
    private BuildingType buildingType;

    @Column(name = "rooms_name", nullable = false)
    private String roomsName;

    @Column(name = "rooms_info", nullable = false)
    private String roomsInfo;

    @Column(name = "rooms_guest_favorite", nullable = false)
    private Boolean roomsGuestFavorite;

    @Column(name = "rooms_price_per_day", nullable = false)
    private int roomsPricePerDay;

    @Column(name = "rooms_description", nullable = false)
    private String roomsDescription;

    @Column(name = "rooms_available_start_date", nullable = false)
    private LocalDateTime roomsAvailableStartDate;

    @Column(name = "rooms_available_end_date", nullable = false)
    private LocalDateTime roomsAvailableEndDate;

    @Column(name = "rooms_is_infant", nullable = false)
    private Boolean roomsIsInfant;

    @Column(name = "rooms_is_pet", nullable = false)
    private Boolean roomsIsPet;

    @Column(name = "rooms_available_guest_count", nullable = false)
    private int roomsAvailableGuestCount;

    @Column(name = "rooms_bedroom_count", nullable = false)
    private int roomsBedroomCount;

    @Column(name = "rooms_bed_count", nullable = false)
    private int roomsBedCount;

    @Column(name = "rooms_bathroom_count", nullable = false)
    private int roomsBathroomCount;

    @Column(name = "rooms_self_check_in", nullable = false)
    private Boolean roomsSelfCheckIn;

    @Column(name = "rooms_immediate_reservation", nullable = false)
    private Boolean roomsImmediateReservation;

    @Column(name = "rooms_rent_type", nullable = false)
    private String roomsRentType;

    @Column(name = "rooms_url_1", nullable = false)
    private String roomsUrl1;

    @Column(name = "rooms_url_2", nullable = false)
    private String roomsUrl2;

    @Column(name = "rooms_url_3", nullable = false)
    private String roomsUrl3;

    @Column(name = "rooms_url_4", nullable = false)
    private String roomsUrl4;

    @Column(name = "rooms_url_5", nullable = false)
    private String roomsUrl5;

    @Column(name = "rooms_cleanliness_avg")
    private Float roomsCleanlinessAvg;

    @Column(name = "rooms_accuracy_avg")
    private Float roomsAccuracyAvg;

    @Column(name = "rooms_check_in_avg")
    private Float roomsCheckInAvg;

    @Column(name = "rooms_communication_avg")
    private Float roomsCommunicationAvg;

    @Column(name = "rooms_location_avg")
    private Float roomsLocationAvg;

    @Column(name = "rooms_value_avg")
    private Float roomsValueAvg;

    @Column(name = "rooms_overall_avg")
    private Float roomsOverallAvg;

    @Column(name = "rooms_review_count")
    private Integer roomsReviewCount;

    @Column(name = "rooms_latitude", nullable = false)
    private BigDecimal roomsLatitude;

    @Column(name = "rooms_longitude", nullable = false)
    private BigDecimal roomsLongitude;

    @Column(name = "rooms_distance_to_seoul", nullable = false)
    private int roomsDistanceToSeoul;

    @OneToMany(mappedBy = "room", fetch = FetchType.LAZY)
    @Builder.Default
    private List<AmenityRoom> amenityRooms = new ArrayList<>();

    @OneToMany(mappedBy = "room", fetch = FetchType.LAZY)
    @Builder.Default
    private List<BedroomType> bedroomTypes = new ArrayList<>();

    @OneToMany(mappedBy = "room", fetch = FetchType.LAZY)
    @Builder.Default
    private List<RoomsCategory> roomsCategories = new ArrayList<>();

    @OneToMany(mappedBy = "room", fetch = FetchType.LAZY)
    @Builder.Default
    private List<Review> reviews = new ArrayList<>();

    @OneToMany(mappedBy = "room", fetch = FetchType.LAZY)
    @Builder.Default
    private List<Reservation> reservations = new ArrayList<>();

    @OneToMany(mappedBy = "room", fetch = FetchType.LAZY)
    @Builder.Default
    private List<Wishlist> wishlists = new ArrayList<>();
}