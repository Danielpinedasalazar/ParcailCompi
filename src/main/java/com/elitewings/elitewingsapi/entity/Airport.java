package com.elitewings.elitewingsapi.entity;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
public class Airport {

    @Id
    @GeneratedValue
    private UUID id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String location;

    private int capacity;

    @Column(name = "government_owned")
    private boolean governmentOwned;

    // Getters y setters
    public UUID getId() { return id; }
    public void setId(UUID id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public int getCapacity() { return capacity; }
    public void setCapacity(int capacity) { this.capacity = capacity; }

    public boolean isGovernmentOwned() { return governmentOwned; }
    public void setGovernmentOwned(boolean governmentOwned) { this.governmentOwned = governmentOwned; }
}
