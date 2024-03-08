package com.example.FlightBookingAppHotels.Repository;

import com.example.FlightBookingAppHotels.Model.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<Hotel, Integer> {
}
