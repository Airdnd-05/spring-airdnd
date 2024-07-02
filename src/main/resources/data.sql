
# 유저
INSERT INTO `users` (`user_lastname`, `user_firstname`, `user_nickname`, `user_email`, `user_phone`, `user_government_id`, `user_address`, `user_emergency_contact`, `user_is_host`)
VALUES
    ('김', '철수', '철수', 'chulsoo@gmail.com', '010-1234-5678', TRUE, '서울특별시 강남구 테헤란로 1', '010-8765-4321', TRUE),
    ('이', '영희', '영희', 'younghee@gmail.com', '010-2345-6789', TRUE, '서울특별시 서초구 반포대로 2', '010-9876-5432', TRUE),
    ('박', '민수', '민수', 'minsoo@gmail.com', '010-3456-7890', TRUE, '서울특별시 마포구 마포대로 3', '010-0987-6543', TRUE),
    ('최', '지영', '지영', 'jiyoung@gmail.com', '010-4567-8901', TRUE, '서울특별시 용산구 용산대로 4', '010-1098-7654', TRUE),
    ('정', '준혁', '준혁', 'junhyuk@gmail.com', '010-5678-9012', TRUE, '서울특별시 영등포구 영등포로 5', '010-2109-8765', TRUE),
    ('홍', '길동', '길동', 'gildong@gmail.com', '010-6789-0123', TRUE, '서울특별시 동작구 상도로 6', '010-3210-9876', TRUE),
    ('강', '다영', '다영', 'dayoung@gmail.com', '010-7890-1234', TRUE, '서울특별시 종로구 종로대로 7', '010-4321-0987', TRUE),
    ('윤', '서준', '서준', 'seojoon@gmail.com', '010-8901-2345', TRUE, '서울특별시 강동구 강동대로 8', '010-5432-1098', TRUE),
    ('서', '지원', '지원', 'jiwon@gmail.com', '010-9012-3456', TRUE, '서울특별시 송파구 송파대로 9', '010-6543-2109', TRUE),
    ('신', '민아', '민아', 'mina@gmail.com', '010-0123-4567', TRUE, '서울특별시 강북구 강북대로 10', '010-7654-3210', TRUE),
    ('장', '하준', '하준', 'hajoon@gmail.com', '010-1111-2222', TRUE, '서울특별시 은평구 은평로 11', '010-2222-3333', TRUE),
    ('조', '민지', '민지', 'minji@gmail.com', '010-3333-4444', TRUE, '서울특별시 중구 중로 12', '010-4444-5555', TRUE),
    ('한', '재원', '재원', 'jaewon@gmail.com', '010-5555-6666', TRUE, '서울특별시 강서구 강서로 13', '010-6666-7777', TRUE),
    ('최', '수진', '수진', 'soojin@gmail.com', '010-7777-8888', TRUE, '서울특별시 강북구 강북대로 14', '010-8888-9999', TRUE),
    ('임', '세준', '세준', 'sejoon@gmail.com', '010-9999-0000', TRUE, '서울특별시 금천구 금천로 15', '010-0000-1111', TRUE),
    ('백', '서영', '서영', 'seoyoung@gmail.com', '010-2222-1111', TRUE, '서울특별시 성동구 성동로 16', '010-1111-2222', TRUE),
    ('윤', '나연', '나연', 'nayeon@gmail.com', '010-3333-2222', TRUE, '서울특별시 동대문구 동대문로 17', '010-2222-3333', TRUE),
    ('오', '진우', '진우', 'jinwoo@gmail.com', '010-4444-3333', TRUE, '서울특별시 성북구 성북로 18', '010-3333-4444', TRUE),
    ('김', '현아', '현아', 'hyunah@gmail.com', '010-5555-4444', TRUE, '서울특별시 관악구 관악로 19', '010-4444-5555', TRUE),
    ('정', '민석', '민석', 'minseok@gmail.com', '010-6666-5555', TRUE, '서울특별시 서대문구 서대문로 20', '010-5555-6666', TRUE);

# 호스트
INSERT INTO `hosts` (`user_id`, `host_experience`, `host_review_count`, `host_rate`, `host_language`, `host_is_super`, `host_response_rate`, `host_response_time`, `host_description`, `host_location`, `host_url`, `host_starting_year`)
VALUES
    (1, 5, 10, 4.5, '한국어, 영어', TRUE, 95, 24, '5년 경력의 친절한 호스트입니다.', '서울', 'http://hosturl.com/chulsoo', 2015),
    (2, 3, 20, 4.7, '한국어, 일본어', TRUE, 90, 36, '여행을 좋아하는 경험 많은 호스트입니다.', '서울', 'http://hosturl.com/younghee', 2017),
    (3, 2, 15, 4.6, '한국어', FALSE, 85, 48, '환대에 열정적인 새로운 호스트입니다.', '서울', 'http://hosturl.com/minsoo', 2019),
    (4, 4, 25, 4.8, '한국어, 중국어', TRUE, 92, 30, '훌륭한 리뷰를 받은 전문 호스트입니다.', '서울', 'http://hosturl.com/jiyoung', 2016),
    (5, 6, 30, 4.9, '한국어, 프랑스어', TRUE, 93, 42, '많은 재방문 손님을 보유한 전문가 호스트입니다.', '서울', 'http://hosturl.com/junhyuk', 2014),
    (6, 1, 5, 4.3, '한국어', FALSE, 80, 60, '열정적인 새로운 호스트입니다.', '서울', 'http://hosturl.com/gildong', 2020),
    (7, 5, 40, 4.8, '한국어, 영어', TRUE, 97, 20, '다양한 경험을 가진 베테랑 호스트입니다.', '서울', 'http://hosturl.com/dayoung', 2015),
    (8, 4, 35, 4.7, '한국어, 스페인어', TRUE, 92, 25, '고객 만족도가 높은 호스트입니다.', '서울', 'http://hosturl.com/seojoon', 2016),
    (9, 3, 20, 4.6, '한국어, 독일어', TRUE, 90, 30, '친절하고 신뢰할 수 있는 호스트입니다.', '서울', 'http://hosturl.com/jiwon', 2017),
    (10, 2, 10, 4.5, '한국어, 러시아어', FALSE, 85, 35, '성실하고 열정적인 호스트입니다.', '서울', 'http://hosturl.com/mina', 2019);

# 건물유형
INSERT INTO `building_types` (`building_type`)
VALUES
    ('단독 또는 다세대 주택'),
    ('아파트'),
    ('게스트용 별채'),
    ('호텔');

# 지역
INSERT INTO `locations` (`location_country`, `location_city`, `location_local`)
VALUES
    ('한국', '서울', '강남구'),
    ('한국', '서울', '종로구'),
    ('한국', '서울', '서초구'),
    ('한국', '부산', '해운대구'),
    ('한국', '부산', '수영구'),
    ('한국', '부산', '남구'),
    ('한국', '속초', '조양동'),
    ('한국', '속초', '영랑동'),
    ('한국', '속초', '청호동'),
    ('한국', '강릉', '경포동'),
    ('한국', '강릉', '홍제동'),
    ('한국', '강릉', '옥천동'),
    ('한국', '전주', '완산구'),
    ('한국', '전주', '덕진구'),
    ('한국', '전주', '효자구'),
    ('한국', '대구', '중구'),
    ('한국', '대구', '수성구'),
    ('한국', '대구', '달서구'),
    ('한국', '경주', '동천동'),
    ('한국', '경주', '황성동'),
    ('한국', '경주', '성건동'),
    ('한국', '여수', '여서동'),
    ('한국', '여수', '문수동'),
    ('한국', '여수', '미평동'),
    ('한국', '서귀포', '대정읍'),
    ('한국', '서귀포', '성산읍'),
    ('한국', '서귀포', '안덕면'),
    ('한국', '대전', '유성구'),
    ('한국', '대전', '서구'),
    ('한국', '대전', '동구'),
    ('한국', '제주도', '한림읍'),
    ('한국', '제주도', '애월읍'),
    ('한국', '제주도', '표선면'),
    ('한국', '인천', '남동구'),
    ('한국', '인천', '연수구'),
    ('한국', '인천', '부평구');

# 편의시설
INSERT INTO `amenities` (`amenity_svg`, `amenity_group`, `amenity_name`)
VALUES
    ('wifi.svg', '필수', '무선 인터넷'),
    ('kitchen.svg', '필수', '주방'),
    ('washing-machine.svg', '필수', '세탁기'),
    ('dryer.svg', '필수', '건조기'),
    ('air-conditioner.svg', '필수', '에어컨'),
    ('heating.svg', '필수', '난방'),
    ('workspace.svg', '필수', '업무 전용 공간'),
    ('tv.svg', '필수', 'TV'),
    ('hair-dryer.svg', '필수', '헤어드라이어'),
    ('iron.svg', '필수', '다리미'),
    ('pool.svg', '특징', '수영장'),
    ('bathtub.svg', '특징', '대형 욕조'),
    ('parking.svg', '특징', '무료 주차 공간'),
    ('electric-car-charging.svg', '특징', '전기차 충전시설'),
    ('baby-bed.svg', '특징', '아기 침대'),
    ('king-bed.svg', '특징', '킹사이즈 침대'),
    ('gym.svg', '특징', '헬스장'),
    ('bbq.svg', '특징', '바비큐 그릴'),
    ('breakfast.svg', '특징', '아침식사'),
    ('fireplace.svg', '특징', '실내 벽난로'),
    ('smoking.svg', '특징', '흡연 가능'),
    ('beach.svg', '위치', '해변에 인접'),
    ('waterfront.svg', '위치', '수변'),
    ('fire-alarm.svg', '안전', '화재경보기'),
    ('carbon-monoxide-alarm.svg', '안전', '일산화탄소 경보기');

# 숙소
# 숙소
INSERT INTO `rooms` (
    `host_id`, `location_id`, `building_type_id`, `room_name`, `room_info`,
    `room_guest_favorite`, `room_price_per_day`, `room_description`,
    `room_available_start_date`, `room_available_end_date`, `room_is_infant`,
    `room_is_pet`, `room_available_guest_count`, `room_bedroom_count`,
    `room_bed_count`, `room_bathroom_count`, `room_self_check_in`,
    `room_immediate_reservation`, `room_rent_type`, `room_url_1`,
    `room_url_2`, `room_url_3`, `room_url_4`, `room_url_5`, `room_cleanliness_avg`,
    `room_accuracy_avg`, `room_check_in_avg`, `room_communication_avg`,
    `room_location_avg`, `room_value_avg`, `room_overall_avg`, `room_review_count`,
    `room_latitude`, `room_longitude`, `room_distance_to_seoul`
) VALUES
      (1, 1, 1, '강남 아파트', '강남 한복판에 위치한 모던한 아파트입니다.', TRUE, 100000, '최고의 위치와 편의시설을 갖춘 아파트입니다.', '2024-01-01 00:00:00', '2024-12-31 23:59:59', TRUE, FALSE, 4, 2, 2, 1, TRUE, TRUE, '전체', 'http://roomurl.com/room1-1', 'http://roomurl.com/room1-2', 'http://roomurl.com/room1-3', 'http://roomurl.com/room1-4', 'http://roomurl.com/room1-5', 4.5, 4.6, 4.7, 4.8, 4.9, 5.0, 4.8, 15, 37.4979558, 127.0276367, 1),
      (2, 2, 2, '서초 단독 주택', '조용하고 아늑한 단독 주택입니다.', TRUE, 120000, '서초구에 위치한 조용한 단독 주택입니다.', '2024-01-01 00:00:00', '2024-12-31 23:59:59', TRUE, TRUE, 6, 3, 3, 2, TRUE, TRUE, '전체', 'http://roomurl.com/room2-1', 'http://roomurl.com/room2-2', 'http://roomurl.com/room2-3', 'http://roomurl.com/room2-4', 'http://roomurl.com/room2-5', 4.4, 4.5, 4.6, 4.7, 4.8, 4.9, 4.7, 20, 37.4879558, 127.0276367, 2),
      (3, 3, 3, '마포 공동 주택', '트렌디한 공동 주택입니다.', TRUE, 90000, '마포구에 위치한 트렌디한 공동 주택입니다.', '2024-01-01 00:00:00', '2024-12-31 23:59:59', FALSE, FALSE, 3, 1, 1, 1, TRUE, TRUE, '개인실', 'http://roomurl.com/room3-1', 'http://roomurl.com/room3-2', 'http://roomurl.com/room3-3', 'http://roomurl.com/room3-4', 'http://roomurl.com/room3-5', 4.3, 4.4, 4.5, 4.6, 4.7, 4.8, 4.6, 10, 37.5479558, 126.9576367, 3),
      (4, 4, 4, '용산 빌라', '럭셔리한 빌라입니다.', TRUE, 150000, '용산구에 위치한 럭셔리한 빌라입니다.', '2024-01-01 00:00:00', '2024-12-31 23:59:59', TRUE, TRUE, 8, 4, 4, 2, TRUE, TRUE, '전체', 'http://roomurl.com/room4-1', 'http://roomurl.com/room4-2', 'http://roomurl.com/room4-3', 'http://roomurl.com/room4-4', 'http://roomurl.com/room4-5', 4.6, 4.7, 4.8, 4.9, 5.0, 4.9, 4.8, 25, 37.5379558, 126.9776367, 4),
      (5, 5, 1, '영등포 오피스텔', '편리한 오피스텔입니다.', TRUE, 80000, '영등포구에 위치한 편리한 오피스텔입니다.', '2024-01-01 00:00:00', '2024-12-31 23:59:59', FALSE, TRUE, 2, 1, 1, 1, TRUE, TRUE, '개인실', 'http://roomurl.com/room5-1', 'http://roomurl.com/room5-2', 'http://roomurl.com/room5-3', 'http://roomurl.com/room5-4', 'http://roomurl.com/room5-5', 4.2, 4.3, 4.4, 4.5, 4.6, 4.7, 4.5, 5, 37.5179558, 126.9076367, 5),
      (1, 6, 2, '강남 호텔', '고급 호텔입니다.', TRUE, 200000, '강남에 위치한 고급 호텔입니다.', '2024-01-01 00:00:00', '2024-12-31 23:59:59', TRUE, FALSE, 5, 2, 2, 1, TRUE, TRUE, '전체', 'http://roomurl.com/room6-1', 'http://roomurl.com/room6-2', 'http://roomurl.com/room6-3', 'http://roomurl.com/room6-4', 'http://roomurl.com/room6-5', 4.8, 4.7, 4.6, 4.5, 4.4, 4.3, 4.2, 10, 37.4979558, 127.0276367, 1),
      (2, 7, 3, '서초 게스트하우스', '아늑한 게스트하우스입니다.', TRUE, 70000, '서초구에 위치한 아늑한 게스트하우스입니다.', '2024-01-01 00:00:00', '2024-12-31 23:59:59', TRUE, TRUE, 3, 1, 1, 1, TRUE, TRUE, '개인실', 'http://roomurl.com/room7-1', 'http://roomurl.com/room7-2', 'http://roomurl.com/room7-3', 'http://roomurl.com/room7-4', 'http://roomurl.com/room7-5', 4.1, 4.2, 4.3, 4.4, 4.5, 4.6, 4.4, 8, 37.4879558, 127.0276367, 2),
      (3, 8, 4, '마포 호텔', '편안한 호텔입니다.', TRUE, 110000, '마포구에 위치한 편안한 호텔입니다.', '2024-01-01 00:00:00', '2024-12-31 23:59:59', FALSE, FALSE, 4, 2, 2, 1, TRUE, TRUE, '전체', 'http://roomurl.com/room8-1', 'http://roomurl.com/room8-2', 'http://roomurl.com/room8-3', 'http://roomurl.com/room8-4', 'http://roomurl.com/room8-5', 4.5, 4.6, 4.7, 4.8, 4.9, 5.0, 4.8, 12, 37.5479558, 126.9576367, 3),
      (4, 9, 1, '용산 아파트', '현대적인 아파트입니다.', TRUE, 95000, '용산구에 위치한 현대적인 아파트입니다.', '2024-01-01 00:00:00', '2024-12-31 23:59:59', TRUE, TRUE, 4, 2, 2, 1, TRUE, TRUE, '전체', 'http://roomurl.com/room9-1', 'http://roomurl.com/room9-2', 'http://roomurl.com/room9-3', 'http://roomurl.com/room9-4', 'http://roomurl.com/room9-5', 4.3, 4.4, 4.5, 4.6, 4.7, 4.8, 4.5, 14, 37.5379558, 126.9776367, 4),
      (5, 10, 2, '영등포 단독 주택', '전통적인 단독 주택입니다.', TRUE, 85000, '영등포구에 위치한 전통적인 단독 주택입니다.', '2024-01-01 00:00:00', '2024-12-31 23:59:59', FALSE, TRUE, 5, 3, 3, 2, TRUE, TRUE, '전체', 'http://roomurl.com/room10-1', 'http://roomurl.com/room10-2', 'http://roomurl.com/room10-3', 'http://roomurl.com/room10-4', 'http://roomurl.com/room10-5', 4.4, 4.5, 4.6, 4.7, 4.8, 4.9, 4.6, 9, 37.5179558, 126.9076367, 5);

# 편의시설-숙소
# 편의시설-숙소
INSERT INTO `amenities_rooms` (`room_id`, `amenity_id`)
VALUES
    -- 강남 아파트
    (1, 1), (1, 2), (1, 3), (1, 4), (1, 5),
    (1, 6), (1, 7), (1, 8), (1, 9), (1, 10),

    -- 서초 단독 주택
    (2, 1), (2, 2), (2, 3), (2, 4), (2, 5),
    (2, 6), (2, 7), (2, 8), (2, 9), (2, 10),

    -- 마포 공동 주택
    (3, 1), (3, 2), (3, 3), (3, 4), (3, 5),
    (3, 6), (3, 7), (3, 8), (3, 9), (3, 10),

    -- 용산 빌라
    (4, 1), (4, 2), (4, 3), (4, 4), (4, 5),
    (4, 6), (4, 7), (4, 8), (4, 9), (4, 10),

    -- 영등포 오피스텔
    (5, 1), (5, 2), (5, 3), (5, 4), (5, 5),
    (5, 6), (5, 7), (5, 8), (5, 9), (5, 10),

    -- 강남 호텔
    (6, 1), (6, 2), (6, 3), (6, 4), (6, 5),
    (6, 6), (6, 7), (6, 8), (6, 9), (6, 10),

    -- 서초 게스트하우스
    (7, 1), (7, 2), (7, 3), (7, 4), (7, 5),
    (7, 6), (7, 7), (7, 8), (7, 9), (7, 10),

    -- 마포 호텔
    (8, 1), (8, 2), (8, 3), (8, 4), (8, 5),
    (8, 6), (8, 7), (8, 8), (8, 9), (8, 10),

    -- 용산 아파트
    (9, 1), (9, 2), (9, 3), (9, 4), (9, 5),
    (9, 6), (9, 7), (9, 8), (9, 9), (9, 10),

    -- 영등포 단독 주택
    (10, 1), (10, 2), (10, 3), (10, 4), (10, 5),
    (10, 6), (10, 7), (10, 8), (10, 9), (10, 10);

# SELECT * FROM users;
# SELECT * FROM hosts;
# SELECT * FROM building_types;
# SELECT * FROM locations;
# SELECT * FROM amenities;
# SELECT * FROM rooms;
# SELECT * FROM amenities_rooms;

# 카테고리
INSERT INTO `categories` (`category_name`, `category_svg`)
VALUES
    ('바다 근처', 'sea.svg'),
    ('산 근처', 'mountain.svg'),
    ('도시 중심부', 'city.svg'),
    ('농촌 지역', 'countryside.svg');

# 숙소-카테고리
INSERT INTO `rooms_categories` (`category_id`, `room_id`)
VALUES
    (1, 1), (1, 2), (2, 3), (2, 4), (3, 5),
    (3, 6), (4, 7), (4, 8), (1, 9), (1, 10);

# 예약
INSERT INTO `reservations` (
    `room_id`, `user_id`, `reservation_check_in`, `reservation_check_out`,
    `reservation_pet_count`, `reservation_guest_count`, `reservation_infant_count`,
    `reservation_date`
)
VALUES
    (1, 2, '2024-07-01 14:00:00', '2024-07-10 11:00:00', 0, 2, 0, '2024-06-20 10:00:00'),
    (2, 3, '2024-08-01 14:00:00', '2024-08-05 11:00:00', 1, 4, 1, '2024-07-15 12:00:00'),
    (3, 4, '2024-09-01 14:00:00', '2024-09-07 11:00:00', 0, 3, 0, '2024-08-10 14:00:00'),
    (4, 5, '2024-10-01 14:00:00', '2024-10-05 11:00:00', 2, 5, 2, '2024-09-15 16:00:00'),
    (5, 6, '2024-11-01 14:00:00', '2024-11-07 11:00:00', 0, 2, 0, '2024-10-10 18:00:00'),
    (6, 7, '2024-12-01 14:00:00', '2024-12-10 11:00:00', 1, 4, 1, '2024-11-15 20:00:00'),
    (7, 8, '2025-01-01 14:00:00', '2025-01-05 11:00:00', 0, 3, 0, '2024-12-20 10:00:00'),
    (8, 9, '2025-02-01 14:00:00', '2025-02-07 11:00:00', 2, 5, 2, '2025-01-15 12:00:00'),
    (9, 10, '2025-03-01 14:00:00', '2025-03-05 11:00:00', 0, 2, 0, '2025-02-10 14:00:00'),
    (10, 1, '2025-04-01 14:00:00', '2025-04-07 11:00:00', 1, 4, 1, '2025-03-15 16:00:00');

# 리뷰
INSERT INTO `reviews` (
    `user_id`, `room_id`, `review_cleanliness_rating`, `review_accuracy_rating`,
    `review_check_in_rating`, `review_communication_rating`, `review_location_rating`,
    `review_value_rating`, `review_content`, `review_avg`, `review_date`
)
VALUES
    (2, 1, 4.5, 4.6, 4.7, 4.8, 4.9, 5.0, '매우 깨끗하고 편안했습니다.', 4.75, '2024-07-11 10:00:00'),
    (3, 2, 4.4, 4.5, 4.6, 4.7, 4.8, 4.9, '조용하고 아늑했습니다.', 4.65, '2024-08-06 12:00:00'),
    (4, 3, 4.3, 4.4, 4.5, 4.6, 4.7, 4.8, '위치가 좋아서 편리했습니다.', 4.55, '2024-09-08 14:00:00'),
    (5, 4, 4.6, 4.7, 4.8, 4.9, 5.0, 4.9, '럭셔리한 빌라였습니다.', 4.75, '2024-10-06 16:00:00'),
    (6, 5, 4.2, 4.3, 4.4, 4.5, 4.6, 4.7, '편리한 오피스텔입니다.', 4.45, '2024-11-08 18:00:00'),
    (7, 6, 4.8, 4.7, 4.6, 4.5, 4.4, 4.3, '고급 호텔이었습니다.', 4.55, '2024-12-11 10:00:00'),
    (8, 7, 4.1, 4.2, 4.3, 4.4, 4.5, 4.6, '아늑한 게스트하우스였습니다.', 4.35, '2025-01-06 12:00:00'),
    (9, 8, 4.5, 4.6, 4.7, 4.8, 4.9, 5.0, '편안한 호텔이었습니다.', 4.75, '2025-02-08 14:00:00'),
    (10, 9, 4.3, 4.4, 4.5, 4.6, 4.7, 4.8, '현대적인 아파트였습니다.', 4.55, '2025-03-06 16:00:00'),
    (1, 10, 4.4, 4.5, 4.6, 4.7, 4.8, 4.9, '전통적인 단독 주택이었습니다.', 4.65, '2025-04-08 18:00:00');

# 위시리스트
INSERT INTO `wishLists` (`room_id`, `user_id`)
VALUES
    (1, 2), (2, 3), (3, 4), (4, 5), (5, 6),
    (6, 7), (7, 8), (8, 9), (9, 10), (10, 1);

# 침실 유형
INSERT INTO `bedroom_types` (`room_id`, `type_bedroom_name`, `type_bed_and_icon`)
VALUES
    (1, '침실 1', '{"roomId": 2, "beds": [{"bedType": "퀸 사이즈 침대", "count": 1, "icon": "RoomCouch"}, {"bedType": "이층 침대", "count": 1, "icon": "RoomBunkBed"}]}'),
    (1, '침실 2', '{"roomId": 2, "beds": [{"bedType": "퀸 사이즈 침대", "count": 1,"icon": "RoomCouch"}, {"bedType": "바닥용 에어매트리스", "count": 1, "icon": "RoomAirMattress"}]}'),
    (2, '침실 1', '{"roomId": 2, "beds": [{"bedType": "퀸 사이즈 침대", "count": 1}, {"bedType": "싱글 침대", "count": 1}]}'),
    (2, '침실 2', '{"roomId": 2, "beds": [{"bedType": "퀸 사이즈 침대", "count": 1}, {"bedType": "싱글 침대", "count": 1}]}'),
    (3, '침실 1', '{"roomId": 2, "beds": [{"bedType": "퀸 사이즈 침대", "count": 1}, {"bedType": "싱글 침대", "count": 1}]}'),
    (3, '침실 2', '{"roomId": 2, "beds": [{"bedType": "퀸 사이즈 침대", "count": 1}, {"bedType": "싱글 침대", "count": 1}]}'),
    (4, '침실 1', '{"roomId": 2, "beds": [{"bedType": "퀸 사이즈 침대", "count": 1}, {"bedType": "싱글 침대", "count": 1}]}'),
    (4, '침실 2', '{"roomId": 2, "beds": [{"bedType": "퀸 사이즈 침대", "count": 1}, {"bedType": "싱글 침대", "count": 1}]}'),
    (5, '침실 1', '{"roomId": 2, "beds": [{"bedType": "퀸 사이즈 침대", "count": 1}, {"bedType": "싱글 침대", "count": 1}]}'),
    (5, '침실 2', '{"roomId": 2, "beds": [{"bedType": "퀸 사이즈 침대", "count": 1}, {"bedType": "싱글 침대", "count": 1}]}');

# SELECT * FROM categories;
# SELECT * FROM rooms_categories;
# SELECT * FROM reservations;
# SELECT * FROM reviews;
# SELECT * FROM wishLists;
# SELECT * FROM bedroom_types;

INSERT INTO `histogram_data` (price_range, count) VALUES
                                                       ('0-9999', 0),
                                                       ('10000-19999', 3),
                                                       ('20000-29999', 8),
                                                       ('30000-39999', 9),
                                                       ('40000-49999', 2),
                                                       ('50000-59999', 8),
                                                       ('60000-69999', 5),
                                                       ('70000-79999', 6),
                                                       ('80000-89999', 12),
                                                       ('90000-99999', 6),
                                                       ('100000-109999', 13),
                                                       ('110000-119999', 4),
                                                       ('120000-129999', 13),
                                                       ('130000-139999', 8),
                                                       ('140000-149999', 9),
                                                       ('150000-159999', 12),
                                                       ('160000-169999', 7),
                                                       ('170000-179999', 6),
                                                       ('180000-189999', 6),
                                                       ('190000-199999', 7),
                                                       ('200000-209999', 6),
                                                       ('210000-219999', 8),
                                                       ('220000-229999', 5),
                                                       ('230000-239999', 4),
                                                       ('240000-249999', 9),
                                                       ('250000-259999', 7),
                                                       ('260000-269999', 5),
                                                       ('270000-279999', 11),
                                                       ('280000-289999', 13),
                                                       ('290000-299999', 4),
                                                       ('300000-309999', 10),
                                                       ('310000-319999', 4),
                                                       ('320000-329999', 9),
                                                       ('330000-339999', 6),
                                                       ('340000-349999', 5),
                                                       ('350000-359999', 6),
                                                       ('360000-369999', 6),
                                                       ('370000-379999', 12),
                                                       ('380000-389999', 4),
                                                       ('390000-399999', 3),
                                                       ('400000-409999', 9),
                                                       ('410000-419999', 6),
                                                       ('420000-429999', 4);
