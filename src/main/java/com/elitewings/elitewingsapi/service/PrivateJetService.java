package com.elitewings.elitewingsapi.service;

import com.elitewings.elitewingsapi.dto.PrivateJetDTO;
import com.elitewings.elitewingsapi.entity.PrivateJet;

import java.util.List;
import java.util.UUID;

public interface PrivateJetService {
    PrivateJet createJet(PrivateJetDTO dto);
    PrivateJet getJet(UUID id);
    List<PrivateJet> getAllJets();
    PrivateJet updateJet(UUID id, PrivateJetDTO dto);
    void deleteJet(UUID id);
}
