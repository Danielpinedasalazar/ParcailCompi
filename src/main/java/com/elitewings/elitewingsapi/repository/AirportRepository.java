package com.elitewings.elitewingsapi.repository;

import com.elitewings.elitewingsapi.entity.Airport;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AirportRepository extends JpaRepository<Airport, UUID> {
}
