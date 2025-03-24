package com.elitewings.elitewingsapi.service.impl;

import com.elitewings.elitewingsapi.dto.AirportDTO;
import com.elitewings.elitewingsapi.entity.Airport;
import com.elitewings.elitewingsapi.repository.AirportRepository;
import com.elitewings.elitewingsapi.service.AirportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class AirportServiceImpl implements AirportService {

    @Autowired
    private AirportRepository airportRepository;

    @Override
    public Airport createAirport(AirportDTO dto) {
        Airport airport = new Airport();
        airport.setName(dto.getName());
        airport.setLocation(dto.getLocation());
        airport.setCapacity(dto.getCapacity());
        airport.setGovernmentOwned(dto.isGovernmentOwned());
        return airportRepository.save(airport);
    }

    @Override
    public List<Airport> getAllAirports() {
        return airportRepository.findAll();
    }

    @Override
    public Airport getAirport(UUID id) {
        return airportRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Airport not found"));
    }

    @Override
    public Airport updateAirport(UUID id, AirportDTO dto) {
        Airport airport = getAirport(id);
        airport.setName(dto.getName());
        airport.setLocation(dto.getLocation());
        airport.setCapacity(dto.getCapacity());
        airport.setGovernmentOwned(dto.isGovernmentOwned());
        return airportRepository.save(airport);
    }

    @Override
    public void deleteAirport(UUID id) {
        if (!airportRepository.existsById(id)) {
            throw new RuntimeException("Airport not found");
        }
        airportRepository.deleteById(id);
    }
}
