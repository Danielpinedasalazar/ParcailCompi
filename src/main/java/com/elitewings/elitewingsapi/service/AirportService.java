package com.elitewings.elitewingsapi.service;

import com.elitewings.elitewingsapi.dto.AirportDTO;
import com.elitewings.elitewingsapi.entity.Airport;

import java.util.List;
import java.util.UUID;

public interface AirportService {
    Airport createAirport(AirportDTO dto);
    List<Airport> getAllAirports();
    Airport getAirport(UUID id);
    Airport updateAirport(UUID id, AirportDTO dto);
    void deleteAirport(UUID id);
}
