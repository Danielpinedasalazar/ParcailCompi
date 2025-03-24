package com.elitewings.elitewingsapi.service.impl;

import com.elitewings.elitewingsapi.dto.FlightDTO;
import com.elitewings.elitewingsapi.entity.Celebrity;
import com.elitewings.elitewingsapi.entity.Flight;
import com.elitewings.elitewingsapi.entity.PrivateJet;
import com.elitewings.elitewingsapi.repository.CelebrityRepository;
import com.elitewings.elitewingsapi.repository.FlightRepository;
import com.elitewings.elitewingsapi.repository.PrivateJetRepository;
import com.elitewings.elitewingsapi.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class FlightServiceImpl implements FlightService {

    @Autowired
    private FlightRepository flightRepository;

    @Autowired
    private CelebrityRepository celebrityRepository;

    @Autowired
    private PrivateJetRepository privateJetRepository;

    @Override
    public Flight createFlight(FlightDTO dto) {
        Celebrity celeb = celebrityRepository.findById(dto.getCelebrityId())
                .orElseThrow(() -> new RuntimeException("Celebrity not found"));
        PrivateJet jet = privateJetRepository.findById(dto.getJetId())
                .orElseThrow(() -> new RuntimeException("Jet not found"));

        Flight flight = new Flight();
        flight.setCelebrity(celeb);
        flight.setJet(jet);
        flight.setDepartureAirport(dto.getDepartureAirport());
        flight.setArrivalAirport(dto.getArrivalAirport());
        flight.setDepartureTime(dto.getDepartureTime());
        flight.setArrivalTime(dto.getArrivalTime());
        flight.setPurpose(dto.getPurpose());

        return flightRepository.save(flight);
    }

    @Override
    public Flight getFlight(UUID id) {
        return flightRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Flight not found"));
    }

    @Override
    public List<Flight> getSuspiciousFlights() {
        return flightRepository.findByPurpose(Flight.Purpose.SUSPICIOUS);
    }

    @Override
    public void deleteFlight(UUID id) {
        if (!flightRepository.existsById(id)) {
            throw new RuntimeException("Flight not found");
        }
        flightRepository.deleteById(id);
    }
}
