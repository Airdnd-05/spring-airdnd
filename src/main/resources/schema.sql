
DROP DATABASE IF EXISTS airdnd;
CREATE DATABASE airdnd;
USE airdnd;

CREATE TABLE `users` (
                         `user_id` BIGINT NOT NULL AUTO_INCREMENT,
                         `user_lastname` VARCHAR(50) NOT NULL,
                         `user_firstname` VARCHAR(50) NOT NULL,
                         `user_nickname` VARCHAR(50),
                         `user_email` VARCHAR(100) NOT NULL,
                         `user_phone` VARCHAR(20),
                         `user_government_id` BOOLEAN,
                         `user_address` VARCHAR(255),
                         `user_emergency_contact` VARCHAR(255),
                         `user_is_host` BOOLEAN NOT NULL,
                         PRIMARY KEY (`user_id`)
);

CREATE TABLE `hosts` (
                         `host_id` BIGINT NOT NULL AUTO_INCREMENT,
                         `user_id` BIGINT NOT NULL,
                         `host_experience` INT NOT NULL,
                         `host_review_count` INT,
                         `host_rate` FLOAT,
                         `host_language` VARCHAR(50),
                         `host_is_super` BOOLEAN NOT NULL,
                         `host_response_rate` INT NOT NULL,
                         `host_response_time` INT NOT NULL,
                         `host_description` VARCHAR(1000),
                         `host_location` VARCHAR(255),
                         `host_url` VARCHAR(255),
                         `host_starting_year` INT NOT NULL,
                         PRIMARY KEY (`host_id`),
                         UNIQUE KEY `unique_user_id` (`user_id`),
                         CONSTRAINT `fk_hosts_user` FOREIGN KEY (`user_id`) REFERENCES `users`(`user_id`)
);

CREATE TABLE `amenities` (
                             `amenity_id` BIGINT NOT NULL AUTO_INCREMENT,
                             `amenity_svg` VARCHAR(255) NOT NULL,
                             `amenity_group` VARCHAR(30) NOT NULL,
                             `amenity_name` VARCHAR(50) NOT NULL,
                             PRIMARY KEY (`amenity_id`)
);

CREATE TABLE `building_types` (
                                  `building_type_id` BIGINT NOT NULL AUTO_INCREMENT,
                                  `building_type` VARCHAR(50) NOT NULL,
                                  PRIMARY KEY (`building_type_id`)
);

CREATE TABLE `locations` (
                             `location_id` BIGINT NOT NULL AUTO_INCREMENT,
                             `location_country` VARCHAR(50) NOT NULL,
                             `location_city` VARCHAR(50) NOT NULL,
                             `location_local` VARCHAR(50) NOT NULL,
                             PRIMARY KEY (`location_id`)
);

CREATE TABLE `rooms` (
                         `room_id` BIGINT NOT NULL AUTO_INCREMENT,
                         `host_id` BIGINT NOT NULL,
                         `location_id` BIGINT NOT NULL,
                         `building_type_id` BIGINT NOT NULL,
                         `room_name` VARCHAR(50) NOT NULL,
                         `room_info` VARCHAR(255) NOT NULL,
                         `room_guest_favorite` BOOLEAN NOT NULL,
                         `room_price_per_day` BIGINT NOT NULL,
                         `room_description` VARCHAR(1000) NOT NULL,
                         `room_available_start_date` DATETIME NOT NULL,
                         `room_available_end_date` DATETIME NOT NULL,
                         `room_is_infant` BOOLEAN NOT NULL,
                         `room_is_pet` BOOLEAN NOT NULL,
                         `room_available_guest_count` INT NOT NULL,
                         `room_bedroom_count` INT NOT NULL,
                         `room_bed_count` INT NOT NULL,
                         `room_bathroom_count` INT NOT NULL,
                         `room_self_check_in` BOOLEAN NOT NULL,
                         `room_immediate_reservation` BOOLEAN NOT NULL,
                         `room_rent_type` VARCHAR(30) NOT NULL,
                         `room_url_1` VARCHAR(255) NOT NULL,
                         `room_url_2` VARCHAR(255) NOT NULL,
                         `room_url_3` VARCHAR(255) NOT NULL,
                         `room_url_4` VARCHAR(255) NOT NULL,
                         `room_url_5` VARCHAR(255) NOT NULL,
                         `room_cleanliness_avg` FLOAT,
                         `room_accuracy_avg` FLOAT,
                         `room_check_in_avg` FLOAT,
                         `room_communication_avg` FLOAT,
                         `room_location_avg` FLOAT,
                         `room_value_avg` FLOAT,
                         `room_overall_avg` FLOAT,
                         `room_review_count` INT,
                         `room_latitude` DECIMAL(10, 8) NOT NULL,
                         `room_longitude` DECIMAL(11, 8) NOT NULL,
                         `room_distance_to_seoul` INT NOT NULL,
                         PRIMARY KEY (`room_id`),
                         CONSTRAINT `fk_rooms_host` FOREIGN KEY (`host_id`) REFERENCES `hosts`(`host_id`),
                         CONSTRAINT `fk_rooms_location` FOREIGN KEY (`location_id`) REFERENCES `locations`(`location_id`),
                         CONSTRAINT `fk_rooms_building_type` FOREIGN KEY (`building_type_id`) REFERENCES `building_types`(`building_type_id`)
);

CREATE TABLE `amenities_rooms` (
                                   `amenity_room_id` BIGINT NOT NULL AUTO_INCREMENT,
                                   `room_id` BIGINT NOT NULL,
                                   `amenity_id` BIGINT NOT NULL,
                                   PRIMARY KEY (`amenity_room_id`),
                                   CONSTRAINT `fk_amenities_rooms_room` FOREIGN KEY (`room_id`) REFERENCES `rooms`(`room_id`),
                                   CONSTRAINT `fk_amenities_rooms_amenity` FOREIGN KEY (`amenity_id`) REFERENCES `amenities`(`amenity_id`)
);

CREATE TABLE `bedroom_types` (
                                 `bedroom_id` BIGINT NOT NULL AUTO_INCREMENT,
                                 `room_id` BIGINT NOT NULL,
                                 `type_bedroom_name` VARCHAR(50) NOT NULL,
                                 `type_bed_and_icon` JSON NOT NULL,
                                 PRIMARY KEY (`bedroom_id`),
                                 CONSTRAINT `fk_bedroom_types_room` FOREIGN KEY (`room_id`) REFERENCES `rooms`(`room_id`)
);

CREATE TABLE `categories` (
                              `category_id` BIGINT NOT NULL AUTO_INCREMENT,
                              `category_name` VARCHAR(50) NOT NULL,
                              `category_svg` VARCHAR(255) NOT NULL,
                              PRIMARY KEY (`category_id`)
);

CREATE TABLE `rooms_categories` (
                                    `room_category_id` BIGINT NOT NULL AUTO_INCREMENT,
                                    `category_id` BIGINT NOT NULL,
                                    `room_id` BIGINT NOT NULL,
                                    PRIMARY KEY (`room_category_id`),
                                    CONSTRAINT `fk_rooms_categories_category` FOREIGN KEY (`category_id`) REFERENCES `categories`(`category_id`),
                                    CONSTRAINT `fk_rooms_categories_room` FOREIGN KEY (`room_id`) REFERENCES `rooms`(`room_id`)
);

CREATE TABLE `reservations` (
                                `reservation_id` BIGINT NOT NULL AUTO_INCREMENT,
                                `room_id` BIGINT NOT NULL,
                                `user_id` BIGINT NOT NULL,
                                `reservation_check_in` DATETIME NOT NULL,
                                `reservation_check_out` DATETIME NOT NULL,
                                `reservation_pet_count` INT,
                                `reservation_guest_count` INT NOT NULL,
                                `reservation_infant_count` INT,
                                `reservation_date` DATETIME NOT NULL,
                                PRIMARY KEY (`reservation_id`),
                                CONSTRAINT `fk_reservations_room` FOREIGN KEY (`room_id`) REFERENCES `rooms`(`room_id`),
                                CONSTRAINT `fk_reservations_user` FOREIGN KEY (`user_id`) REFERENCES `users`(`user_id`)
);

CREATE TABLE `reviews` (
                           `review_id` BIGINT NOT NULL AUTO_INCREMENT,
                           `user_id` BIGINT NOT NULL,
                           `room_id` BIGINT NOT NULL,
                           `review_cleanliness_rating` FLOAT NOT NULL,
                           `review_accuracy_rating` FLOAT NOT NULL,
                           `review_check_in_rating` FLOAT NOT NULL,
                           `review_communication_rating` FLOAT NOT NULL,
                           `review_location_rating` FLOAT NOT NULL,
                           `review_value_rating` FLOAT NOT NULL,
                           `review_content` VARCHAR(255) NOT NULL,
                           `review_avg` FLOAT NOT NULL,
                           `review_date` DATETIME NOT NULL,
                           PRIMARY KEY (`review_id`),
                           CONSTRAINT `fk_reviews_user` FOREIGN KEY (`user_id`) REFERENCES `users`(`user_id`),
                           CONSTRAINT `fk_reviews_room` FOREIGN KEY (`room_id`) REFERENCES `rooms`(`room_id`)
);

CREATE TABLE `wishLists` (
                             `wishList_id` BIGINT NOT NULL AUTO_INCREMENT,
                             `room_id` BIGINT NOT NULL,
                             `user_id` BIGINT NOT NULL,
                             PRIMARY KEY (`wishList_id`),
                             CONSTRAINT `fk_wishLists_room` FOREIGN KEY (`room_id`) REFERENCES `rooms`(`room_id`),
                             CONSTRAINT `fk_wishLists_user` FOREIGN KEY (`user_id`) REFERENCES `users`(`user_id`)
);

CREATE TABLE `contents` (
                            `content_id` INT NOT NULL AUTO_INCREMENT,
                            `content_component` VARCHAR(30) NOT NULL,
                            `content_name` VARCHAR(100) NOT NULL,
                            `content` JSON NOT NULL,
                            PRIMARY KEY (`content_id`)
);

CREATE TABLE `histogram_data` (
                                  `histogram_id` INT NOT NULL AUTO_INCREMENT,
                                  `price_range` VARCHAR(30) NOT NULL,
                                  `count` INT NOT NULL,
                                  PRIMARY KEY (`histogram_id`)
);
