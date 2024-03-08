package com.example.FlightBookingAppHotels.Controller;

import com.example.FlightBookingAppHotels.Model.Hotel;
import com.example.FlightBookingAppHotels.Service.IHotelService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HotelController {

    private final IHotelService hotelService;

    public HotelController(IHotelService hotelService) {
        this.hotelService = hotelService;
    }

    @GetMapping(value = "hotels", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Hotel> getHotels(){
        return hotelService.getAvailableHotels();
    }
}
