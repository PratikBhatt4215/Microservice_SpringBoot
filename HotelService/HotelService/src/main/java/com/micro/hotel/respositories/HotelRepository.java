package com.micro.hotel.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.micro.hotel.entites.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, String> {
}
