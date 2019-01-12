package com.atech.flights.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.atech.flights.model.Flight;

public interface FlightRepository extends JpaRepository<Flight, String> {

}
