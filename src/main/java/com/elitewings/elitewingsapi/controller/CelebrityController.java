package com.elitewings.elitewingsapi.controller;

import com.elitewings.elitewingsapi.dto.CelebrityDTO;
import com.elitewings.elitewingsapi.entity.Celebrity;
import com.elitewings.elitewingsapi.service.CelebrityService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/celebrities")
public class CelebrityController {

    @Autowired
    private CelebrityService celebrityService;

    @PostMapping
    public Celebrity createCelebrity(@Valid @RequestBody CelebrityDTO dto) {
        return celebrityService.createCelebrity(dto);
    }

    @GetMapping("/{id}")
    public Celebrity getCelebrity(@PathVariable UUID id) {
        return celebrityService.getCelebrity(id);
    }

    @GetMapping
    public List<Celebrity> getAllCelebrities() {
        return celebrityService.getAllCelebrities();
    }

    @PutMapping("/{id}")
    public Celebrity updateCelebrity(@PathVariable UUID id, @Valid @RequestBody CelebrityDTO dto) {
        return celebrityService.updateCelebrity(id, dto);
    }

    @DeleteMapping("/{id}")
    public void deleteCelebrity(@PathVariable UUID id) {
        celebrityService.deleteCelebrity(id);
    }
}
