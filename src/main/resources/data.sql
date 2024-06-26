INSERT INTO building_types VALUES (default, '단독 또는 다세대 주택');
INSERT INTO building_types VALUES (default, '아파트');
INSERT INTO building_types VALUES (default, '게스트용 별채');
INSERT INTO building_types VALUES (default, '호텔');
SELECT * FROM building_types;

INSERT INTO locations VALUES (default, '한국', '서울', '강남구');
INSERT INTO locations VALUES (default, '한국', '서울', '종로구');
INSERT INTO locations VALUES (default, '한국', '서울', '서초구');
INSERT INTO locations VALUES (default, '한국', '부산', '해운대구');
INSERT INTO locations VALUES (default, '한국', '부산', '수영구');
INSERT INTO locations VALUES (default, '한국', '부산', '남구');
INSERT INTO locations VALUES (default, '한국', '속초', '조양동');
INSERT INTO locations VALUES (default, '한국', '속초', '영랑동');
INSERT INTO locations VALUES (default, '한국', '속초', '청호동');
INSERT INTO locations VALUES (default, '한국', '강릉', '경포동');
INSERT INTO locations VALUES (default, '한국', '강릉', '홍제동');
INSERT INTO locations VALUES (default, '한국', '강릉', '옥천동');
INSERT INTO locations VALUES (default, '한국', '전주', '완산구');
INSERT INTO locations VALUES (default, '한국', '전주', '덕진구');
INSERT INTO locations VALUES (default, '한국', '전주', '효자구');
INSERT INTO locations VALUES (default, '한국', '대구', '중구');
INSERT INTO locations VALUES (default, '한국', '대구', '수성구');
INSERT INTO locations VALUES (default, '한국', '대구', '달서구');
INSERT INTO locations VALUES (default, '한국', '경주', '동천동');
INSERT INTO locations VALUES (default, '한국', '경주', '황성동');
INSERT INTO locations VALUES (default, '한국', '경주', '성건동');
INSERT INTO locations VALUES (default, '한국', '여수', '여서동');
INSERT INTO locations VALUES (default, '한국', '여수', '문수동');
INSERT INTO locations VALUES (default, '한국', '여수', '미평동');
INSERT INTO locations VALUES (default, '한국', '서귀포', '대정읍');
INSERT INTO locations VALUES (default, '한국', '서귀포', '성산읍');
INSERT INTO locations VALUES (default, '한국', '서귀포', '안덕면');
INSERT INTO locations VALUES (default, '한국', '대전', '유성구');
INSERT INTO locations VALUES (default, '한국', '대전', '서구');
INSERT INTO locations VALUES (default, '한국', '대전', '동구');
INSERT INTO locations VALUES (default, '한국', '제주도', '한림읍');
INSERT INTO locations VALUES (default, '한국', '제주도', '애월읍');
INSERT INTO locations VALUES (default, '한국', '제주도', '표선면');
INSERT INTO locations VALUES (default, '한국', '인천', '남동구');
INSERT INTO locations VALUES (default, '한국', '인천', '연수구');
INSERT INTO locations VALUES (default, '한국', '인천', '부평구');
SELECT * FROM locations;

INSERT INTO rooms (
    location_id, building_type_id, room_name, room_info, room_guest_favorite, room_price_per_day,
    room_description, room_available_start_date, room_available_end_date, room_is_infant,
    room_is_pet, room_available_guest_count, room_bedroom_count, room_bed_count,
    room_bathroom_count, room_self_check_in, room_immediate_reservation, room_rent_type,
    room_url_1, room_url_2, room_url_3, room_url_4, room_url_5, room_cleanliness_avg,
    room_accuracy_avg, room_check_in_avg, room_communication_avg, room_location_avg,
    room_value_avg, room_overall_avg, room_review_count, room_latitude, room_longitude,
    room_distance_to_seoul
) VALUES
      (1, 2, 'Luxury Apartment in Gangnam', 'Spacious and modern apartment in the heart of Gangnam', true, 150000,
       'Perfect for families and business travelers. Close to public transportation.', '2024-07-01 14:00:00', '2024-12-31 11:00:00', true,
       false, 4, 2, 2,
       1, true, true, 'Entire Place',
       'http://example.com/img1.jpg', 'http://example.com/img2.jpg', 'http://example.com/img3.jpg', 'http://example.com/img4.jpg', 'http://example.com/img5.jpg', 4.8,
       4.9, 4.7, 4.8, 4.9,
       4.8, 4.85, 200, 37.4979, 127.0276,
       0),
      (2, 2, 'Cozy Studio in Jongno', 'Charming studio with a great view of the city', false, 70000,
       'Ideal for solo travelers or couples. Close to historical sites and public transport.', '2024-07-01 14:00:00', '2024-12-31 11:00:00', false,
       true, 2, 1, 1,
       1, true, false, 'Private Room',
       'http://example.com/img1.jpg', 'http://example.com/img2.jpg', 'http://example.com/img3.jpg', 'http://example.com/img4.jpg', 'http://example.com/img5.jpg', 4.5,
       4.6, 4.4, 4.5, 4.6,
       4.5, 4.55, 150, 37.5725, 126.9780,
       0),
      (4, 2, 'Beachfront Condo in Haeundae', 'Modern condo with stunning sea views', true, 200000,
       'Perfect getaway with easy beach access. Great for relaxation and watersports.', '2024-07-01 14:00:00', '2024-12-31 11:00:00', true,
       true, 5, 3, 3,
       2, true, true, 'Entire Place',
       'http://example.com/img1.jpg', 'http://example.com/img2.jpg', 'http://example.com/img3.jpg', 'http://example.com/img4.jpg', 'http://example.com/img5.jpg', 4.9,
       4.9, 4.8, 4.9, 4.9,
       4.9, 4.9, 300, 35.1587, 129.1603,
       320);
SELECT * FROM rooms;
