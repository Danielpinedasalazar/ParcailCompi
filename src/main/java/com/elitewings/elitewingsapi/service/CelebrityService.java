package com.elitewings.elitewingsapi.service;

import com.elitewings.elitewingsapi.dto.CelebrityDTO;
import com.elitewings.elitewingsapi.entity.Celebrity;

import java.util.List;
import java.util.UUID;

public interface CelebrityService {
    Celebrity createCelebrity(CelebrityDTO dto);
    Celebrity getCelebrity(UUID id);
    List<Celebrity> getAllCelebrities();
    Celebrity updateCelebrity(UUID id, CelebrityDTO dto);
    void deleteCelebrity(UUID id);
}
