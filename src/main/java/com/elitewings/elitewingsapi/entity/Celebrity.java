package com.elitewings.elitewingsapi.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.util.UUID;

@Entity
public class Celebrity {

    @Id
    @GeneratedValue
    private UUID id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String profession;

    private BigDecimal netWorth;

    private boolean suspiciousActivity = false;

    // Getters y Setters
    public UUID getId() {
        return id;
    }
    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getProfession() {
        return profession;
    }
    public void setProfession(String profession) {
        this.profession = profession;
    }

    public BigDecimal getNetWorth() {
        return netWorth;
    }
    public void setNetWorth(BigDecimal netWorth) {
        this.netWorth = netWorth;
    }

    public boolean isSuspiciousActivity() {
        return suspiciousActivity;
    }
    public void setSuspiciousActivity(boolean suspiciousActivity) {
        this.suspiciousActivity = suspiciousActivity;
    }
}
