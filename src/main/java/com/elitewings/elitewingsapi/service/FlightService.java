package com.elitewings.elitewingsapi.service;

import com.elitewings.elitewingsapi.dto.FlightDTO;
import com.elitewings.elitewingsapi.entity.Flight;

import java.util.List;
import java.util.UUID;

public interface FlightService {
    Flight createFlight(FlightDTO dto);
    Flight getFlight(UUID id);
    List<Flight> getSuspiciousFlights();
    void deleteFlight(UUID id);
}
