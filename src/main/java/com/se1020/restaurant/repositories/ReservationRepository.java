package com.se1020.restaurant.repositories;

import com.se1020.restaurant.models.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
    // Spring Boot writes all the SQL instantly! You don't need to add anything.
}