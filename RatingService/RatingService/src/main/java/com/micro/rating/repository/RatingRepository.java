package com.micro.rating.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.micro.rating.entities.Rating;

import java.util.List;

public interface RatingRepository extends JpaRepository<Rating,Integer>
{
    //custom finder methods
    List<Rating> findByUserId(String userId);
    List<Rating> findByHotelId(String hotelId);

}
