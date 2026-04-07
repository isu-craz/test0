package com.se1020.restaurant.models;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE) // Required so children save to SQL
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int partySize;
    private LocalDateTime bookingTime;

    // The magical links to other components!
    @ManyToOne
    private User customer;

    @ManyToOne
    private Table bookedTable;

    // TODO: Right click -> Generate -> Getters and Setters for all variables!
}