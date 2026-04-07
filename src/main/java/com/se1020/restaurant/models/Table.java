package com.se1020.restaurant.models;

import jakarta.persistence.*;

@Entity
@jakarta.persistence.Table(name = "tables") // Renamed so it doesn't conflict with SQL keyword
public class Table {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // You literally don't need to add anything else! Member 3 will finish this later.
    // Be sure to generate a Getter/Setter for the ID:
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
}