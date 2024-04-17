package com.micro.user.service.external.services;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.micro.user.service.entities.Hotel;
import com.micro.user.service.entities.Rating;

import java.util.Map;
import java.util.Objects;

@Service
@FeignClient(name = "RATING-SERVICE")
public interface RatingService {


    //get
	 @GetMapping("/ratings/users/{ratingId}")
	    Rating[] getRating(@PathVariable("ratingId") String ratingId);
    //POST

    @PostMapping("/ratings")
    public ResponseEntity<Rating> createRating(Rating values);


    //PUT
    @PutMapping("/ratings/{ratingId}")
    public ResponseEntity<Rating> updateRating(@PathVariable("ratingId") String ratingId, Rating rating);


    @DeleteMapping("/ratings/{ratingId}")
    public void deleteRating(@PathVariable String ratingId);
}
