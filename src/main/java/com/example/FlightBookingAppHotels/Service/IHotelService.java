package com.example.FlightBookingAppHotels.Service;

import com.example.FlightBookingAppHotels.Model.Hotel;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IHotelService {

    public List<Hotel> getHotels();
    public List<Hotel> getAvailableHotels();
}
