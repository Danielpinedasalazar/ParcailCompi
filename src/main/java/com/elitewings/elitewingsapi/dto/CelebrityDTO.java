package com.elitewings.elitewingsapi.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.math.BigDecimal;

public class CelebrityDTO {

    @NotBlank(message = "Name is required")
    @Size(min = 2, max = 50)
    private String name;

    @NotBlank(message = "Profession is required")
    private String profession;
    private BigDecimal netWorth;
    private boolean suspiciousActivity;


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
