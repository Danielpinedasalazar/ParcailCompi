package com.elitewings.elitewingsapi.dto;

import com.elitewings.elitewingsapi.entity.Flight.Purpose;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;
import java.util.UUID;

public class FlightDTO {

    @NotNull
    private UUID celebrityId;

    @NotNull
    private UUID jetId;

    @NotBlank
    private String departureAirport;

    @NotBlank
    private String arrivalAirport;

    @NotNull
    private LocalDateTime departureTime;

    @NotNull
    private LocalDateTime arrivalTime;

    @NotNull
    private Purpose purpose;

    public UUID getCelebrityId() {
        return celebrityId;
    }

    public void setCelebrityId(UUID celebrityId) {
        this.celebrityId = celebrityId;
    }

    public UUID getJetId() {
        return jetId;
    }

    public void setJetId(UUID jetId) {
        this.jetId = jetId;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    public void setArrivalAirport(String arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalDateTime departureTime) {
        this.departureTime = departureTime;
    }

    public LocalDateTime getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(LocalDateTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public Purpose getPurpose() {
        return purpose;
    }

    public void setPurpose(Purpose purpose) {
        this.purpose = purpose;
    }
}
