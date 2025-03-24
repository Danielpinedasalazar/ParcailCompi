package com.elitewings.elitewingsapi.controller;

import com.elitewings.elitewingsapi.dto.AirportDTO;
import com.elitewings.elitewingsapi.entity.Airport;
import com.elitewings.elitewingsapi.service.AirportService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/airports")
public class AirportController {

    @Autowired
    private AirportService airportService;

    @PostMapping
    public Airport createAirport(@Valid @RequestBody AirportDTO dto) {
        return airportService.createAirport(dto);
    }

    @GetMapping
    public List<Airport> getAllAirports() {
        return airportService.getAllAirports();
    }

    @GetMapping("/{id}")
    public Airport getAirport(@PathVariable UUID id) {
        return airportService.getAirport(id);
    }

    @PutMapping("/{id}")
    public Airport updateAirport(@PathVariable UUID id, @Valid @RequestBody AirportDTO dto) {
        return airportService.updateAirport(id, dto);
    }

    @DeleteMapping("/{id}")
    public void deleteAirport(@PathVariable UUID id) {
        airportService.deleteAirport(id);
    }
}
