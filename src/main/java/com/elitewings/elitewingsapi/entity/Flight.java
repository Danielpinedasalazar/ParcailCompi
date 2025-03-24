package com.elitewings.elitewingsapi.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
public class Flight {

    @Id
    @GeneratedValue
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "celebrity_id", nullable = false)
    private Celebrity celebrity;

    @ManyToOne
    @JoinColumn(name = "jet_id", nullable = false)
    private PrivateJet jet;

    @Column(nullable = false)
    private String departureAirport;

    @Column(nullable = false)
    private String arrivalAirport;

    @Column(nullable = false)
    private LocalDateTime departureTime;

    @Column(nullable = false)
    private LocalDateTime arrivalTime;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Purpose purpose;

    public enum Purpose {
        BUSINESS, VACATION, SUSPICIOUS
    }

    // ✅ Getters y setters
    public UUID getId() {
        return id;
    }
    public void setId(UUID id) {
        this.id = id;
    }

    public Celebrity getCelebrity() {
        return celebrity;
    }
    public void setCelebrity(Celebrity celebrity) {
        this.celebrity = celebrity;
    }

    public PrivateJet getJet() {
        return jet;
    }
    public void setJet(PrivateJet jet) {
        this.jet = jet;
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
