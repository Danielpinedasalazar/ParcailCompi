package com.elitewings.elitewingsapi.repository;

import com.elitewings.elitewingsapi.entity.PrivateJet;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PrivateJetRepository extends JpaRepository<PrivateJet, UUID> {
}
