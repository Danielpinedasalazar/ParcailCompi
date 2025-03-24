package com.elitewings.elitewingsapi.controller;

import com.elitewings.elitewingsapi.dto.FlightDTO;
import com.elitewings.elitewingsapi.entity.Flight;
import com.elitewings.elitewingsapi.service.FlightService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/flights")
public class FlightController {

    @Autowired
    private FlightService flightService;

    @PostMapping
    public Flight createFlight(@Valid @RequestBody FlightDTO dto) {
        return flightService.createFlight(dto);
    }

    @GetMapping("/{id}")
    public Flight getFlight(@PathVariable UUID id) {
        return flightService.getFlight(id);
    }

    @GetMapping("/suspicious")
    public List<Flight> getSuspiciousFlights() {
        return flightService.getSuspiciousFlights();
    }

    @DeleteMapping("/{id}")
    public void deleteFlight(@PathVariable UUID id) {
        flightService.deleteFlight(id);
    }
}
