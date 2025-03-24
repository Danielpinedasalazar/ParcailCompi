package com.elitewings.elitewingsapi.repository;

import com.elitewings.elitewingsapi.entity.Flight;
import com.elitewings.elitewingsapi.entity.Flight.Purpose;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface FlightRepository extends JpaRepository<Flight, UUID> {
    List<Flight> findByPurpose(Purpose purpose);
}
