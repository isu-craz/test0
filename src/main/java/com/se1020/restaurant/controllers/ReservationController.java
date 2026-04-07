package com.se1020.restaurant.controllers;

import com.se1020.restaurant.models.Reservation;
import com.se1020.restaurant.repositories.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/reservations")
public class ReservationController {

    @Autowired
    private ReservationRepository reservationRepository;

    // When the customer visits http://localhost:8080/reservations
    @GetMapping
    public String showReservationPage(Model model) {

        // This is required so Thymeleaf has an empty object to fill with form data
        model.addAttribute("newReservation", new Reservation());

        // This links directly to that amazing Tailwind HTML prototype I built for you!
        return "book"; // Look for src/main/resources/templates/book.html
    }
}