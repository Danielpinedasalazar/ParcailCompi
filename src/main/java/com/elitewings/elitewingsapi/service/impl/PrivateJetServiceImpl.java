package com.elitewings.elitewingsapi.service.impl;

import com.elitewings.elitewingsapi.dto.PrivateJetDTO;
import com.elitewings.elitewingsapi.entity.Celebrity;
import com.elitewings.elitewingsapi.entity.PrivateJet;
import com.elitewings.elitewingsapi.repository.CelebrityRepository;
import com.elitewings.elitewingsapi.repository.PrivateJetRepository;
import com.elitewings.elitewingsapi.service.PrivateJetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class PrivateJetServiceImpl implements PrivateJetService {

    @Autowired
    private PrivateJetRepository privateJetRepository;

    @Autowired
    private CelebrityRepository celebrityRepository;

    @Override
    public PrivateJet createJet(PrivateJetDTO dto) {
        Celebrity owner = celebrityRepository.findById(dto.getOwnerId())
                .orElseThrow(() -> new RuntimeException("Celebrity owner not found"));

        PrivateJet jet = new PrivateJet();
        jet.setModel(dto.getModel());
        jet.setCapacity(dto.getCapacity());
        jet.setOwner(owner);

        return privateJetRepository.save(jet);
    }

    @Override
    public PrivateJet getJet(UUID id) {
        return privateJetRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Private Jet not found"));
    }

    @Override
    public List<PrivateJet> getAllJets() {
        return privateJetRepository.findAll();
    }

    @Override
    public PrivateJet updateJet(UUID id, PrivateJetDTO dto) {
        PrivateJet jet = getJet(id);
        Celebrity owner = celebrityRepository.findById(dto.getOwnerId())
                .orElseThrow(() -> new RuntimeException("Celebrity owner not found"));

        jet.setModel(dto.getModel());
        jet.setCapacity(dto.getCapacity());
        jet.setOwner(owner);

        return privateJetRepository.save(jet);
    }

    @Override
    public void deleteJet(UUID id) {
        if (!privateJetRepository.existsById(id)) {
            throw new RuntimeException("Private Jet not found");
        }
        privateJetRepository.deleteById(id);
    }
}
