package com.example.FlightBookingAppHotels;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.SpringVersion;

@SpringBootApplication
public class FlightBookingAppHotelsApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlightBookingAppHotelsApplication.class, args);
		System.out.println(SpringVersion.getVersion());
	}

}
