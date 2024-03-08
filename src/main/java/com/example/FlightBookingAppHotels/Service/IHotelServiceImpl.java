package com.example.FlightBookingAppHotels.Service;

import com.example.FlightBookingAppHotels.Model.Hotel;
import com.example.FlightBookingAppHotels.Repository.HotelRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class IHotelServiceImpl implements IHotelService{

    private final HotelRepository hotelRepository;

    public IHotelServiceImpl(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    @Override
    public List<Hotel> getHotels() {
        return hotelRepository.findAll();
    }

    @Override
    public List<Hotel> getAvailableHotels() {
        List<Hotel> hotels = hotelRepository.findAll();
        return hotels.stream().filter(t->t.getAvailable()== 1).collect(Collectors.toList());
    }
}
