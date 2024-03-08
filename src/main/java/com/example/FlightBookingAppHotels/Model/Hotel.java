package com.example.FlightBookingAppHotels.Model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "hoteles")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Hotel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int category;
    private double price;
    private byte available;



}
