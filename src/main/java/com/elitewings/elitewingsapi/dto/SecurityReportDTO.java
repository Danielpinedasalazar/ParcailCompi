package com.elitewings.elitewingsapi.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.util.UUID;

public class SecurityReportDTO {

    @NotNull
    private UUID flightId;

    @NotNull
    @Size(min = 2, message = "El nombre del reportante debe tener al menos 2 caracteres")
    private String reportedBy;

    @NotNull
    @Size(min = 5, max = 500, message = "La descripción debe tener entre 5 y 500 caracteres")
    private String description;

    // Getters y Setters

    public UUID getFlightId() {
        return flightId;
    }

    public void setFlightId(UUID flightId) {
        this.flightId = flightId;
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
}
