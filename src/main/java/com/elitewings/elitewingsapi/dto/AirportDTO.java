package com.elitewings.elitewingsapi.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public class AirportDTO {

    @NotBlank
    private String name;

    @NotBlank
    private String location;

    @Min(1)
    private int capacity;

    private boolean governmentOwned;

    // Getters y setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public int getCapacity() { return capacity; }
    public void setCapacity(int capacity) { this.capacity = capacity; }

    public boolean isGovernmentOwned() { return governmentOwned; }
    public void setGovernmentOwned(boolean governmentOwned) { this.governmentOwned = governmentOwned; }
}
