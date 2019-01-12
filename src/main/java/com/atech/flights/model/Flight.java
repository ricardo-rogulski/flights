package com.atech.flights.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.validator.constraints.NotBlank;

@Entity
public class Flight {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank
	private String departureTime;
	@NotBlank
	private String arrivalTime;
	@NotBlank
	private String status;
	
	@ManyToOne
	private Pilot pilot;
	
	@ManyToOne
	private Aircraft aircraft;
	
	@ManyToOne
	private City departureCity;
	
	@ManyToOne
	private City arrivalCity;

	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

	public String getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Pilot getPilot() {
		return pilot;
	}

	public void setPilot(Pilot pilot) {
		this.pilot = pilot;
	}

	public Aircraft getAircraft() {
		return aircraft;
	}

	public void setAircraft(Aircraft aircraft) {
		this.aircraft = aircraft;
	}

	public City getDepartureCity() {
		return departureCity;
	}

	public void setDepartureCity(City departureCity) {
		this.departureCity = departureCity;
	}

	public City getArrivalCity() {
		return arrivalCity;
	}

	public void setArrivalCity(City arrivalCity) {
		this.arrivalCity = arrivalCity;
	}
	
	
}
