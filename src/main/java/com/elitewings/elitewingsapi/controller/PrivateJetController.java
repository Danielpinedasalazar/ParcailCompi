package com.elitewings.elitewingsapi.controller;

import com.elitewings.elitewingsapi.dto.PrivateJetDTO;
import com.elitewings.elitewingsapi.entity.PrivateJet;
import com.elitewings.elitewingsapi.service.PrivateJetService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/jets")
public class PrivateJetController {

    @Autowired
    private PrivateJetService privateJetService;

    @PostMapping
    public PrivateJet createJet(@Valid @RequestBody PrivateJetDTO dto) {
        return privateJetService.createJet(dto);
    }

    @GetMapping("/{id}")
    public PrivateJet getJet(@PathVariable UUID id) {
        return privateJetService.getJet(id);
    }

    @GetMapping
    public List<PrivateJet> getAllJets() {
        return privateJetService.getAllJets();
    }

    @PutMapping("/{id}")
    public PrivateJet updateJet(@PathVariable UUID id, @Valid @RequestBody PrivateJetDTO dto) {
        return privateJetService.updateJet(id, dto);
    }

    @DeleteMapping("/{id}")
    public void deleteJet(@PathVariable UUID id) {
        privateJetService.deleteJet(id);
    }
}
