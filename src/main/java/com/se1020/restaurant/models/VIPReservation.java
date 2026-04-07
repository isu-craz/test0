package com.se1020.restaurant.models;

import jakarta.persistence.Entity;

@Entity
public class VIPReservation extends Reservation implements Discountable {

    private String specialRequest; // Only VIPs get to make special requests!

    // Implement the Interface logic
    @Override
    public double applyDiscount(double basePrice) {
        // VIPs get 15% off their booking fee!
        return basePrice * 0.85;
    }

    // TODO: Right click -> Generate -> Getters and Setters
}