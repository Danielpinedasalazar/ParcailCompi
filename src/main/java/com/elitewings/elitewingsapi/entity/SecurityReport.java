package com.elitewings.elitewingsapi.entity;

import jakarta.persistence.*;
import java.util.UUID;

@Entity
public class SecurityReport {

    @Id
    @GeneratedValue
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "flight_id", nullable = false)
    private Flight flight;

    @Column(nullable = false)
    private String reportedBy;

    @Column(nullable = false, length = 500)
    private String description;

    private boolean isResolved = false;

    // Getters y Setters

    public UUID getId() {
        return id;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public String getReportedBy() {
        return reportedBy;
    }

    public void setReportedBy(String reportedBy) {
        this.reportedBy = reportedBy;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isResolved() {
        return isResolved;
    }

    public void setResolved(boolean resolved) {
        isResolved = resolved;
    }
}
