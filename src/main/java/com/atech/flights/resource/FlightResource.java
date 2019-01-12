package com.atech.flights.resource;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.atech.flights.model.Flight;
import com.atech.flights.repository.FlightRepository;

@RestController
@RequestMapping("/flight")
public class FlightResource {
	
	@Autowired
	private FlightRepository fr;
	
	@GetMapping(produces="application/json")
	public @ResponseBody Iterable<Flight> list(){
		Iterable<Flight> flightsList = fr.findAll();
		return flightsList;
	}

	@PostMapping
	public Flight create(@RequestBody @Valid Flight flight){
		return fr.save(flight);
	}
	
	@DeleteMapping()
	public Flight delete(@RequestBody Flight flight){
		fr.delete(flight);
		return flight;
	}
	

}
