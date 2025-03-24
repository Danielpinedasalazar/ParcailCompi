package com.elitewings.elitewingsapi.repository;

import com.elitewings.elitewingsapi.entity.Celebrity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CelebrityRepository extends JpaRepository<Celebrity, UUID> {
}
