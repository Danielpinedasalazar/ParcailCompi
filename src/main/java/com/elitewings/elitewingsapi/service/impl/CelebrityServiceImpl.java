package com.elitewings.elitewingsapi.service.impl;

import com.elitewings.elitewingsapi.dto.CelebrityDTO;
import com.elitewings.elitewingsapi.entity.Celebrity;
import com.elitewings.elitewingsapi.repository.CelebrityRepository;
import com.elitewings.elitewingsapi.service.CelebrityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class CelebrityServiceImpl implements CelebrityService {

    @Autowired
    private CelebrityRepository celebrityRepository;

    @Override
    public Celebrity createCelebrity(CelebrityDTO dto) {
        Celebrity celebrity = new Celebrity();
        celebrity.setName(dto.getName());
        celebrity.setProfession(dto.getProfession());
        celebrity.setNetWorth(dto.getNetWorth());
        celebrity.setSuspiciousActivity(dto.isSuspiciousActivity());
        return celebrityRepository.save(celebrity);
    }

    @Override
    public Celebrity getCelebrity(UUID id) {
        return celebrityRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Celebrity not found"));
    }

    @Override
    public List<Celebrity> getAllCelebrities() {
        return celebrityRepository.findAll();
    }

    @Override
    public Celebrity updateCelebrity(UUID id, CelebrityDTO dto) {
        Celebrity celebrity = celebrityRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Celebrity not found"));
        celebrity.setName(dto.getName());
        celebrity.setProfession(dto.getProfession());
        celebrity.setNetWorth(dto.getNetWorth());
        celebrity.setSuspiciousActivity(dto.isSuspiciousActivity());
        return celebrityRepository.save(celebrity);
    }

    @Override
    public void deleteCelebrity(UUID id) {
        if (!celebrityRepository.existsById(id)) {
            throw new RuntimeException("Celebrity not found");
        }
        celebrityRepository.deleteById(id);
    }
}
