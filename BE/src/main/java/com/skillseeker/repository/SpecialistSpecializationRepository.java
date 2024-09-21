package com.skillseeker.repository;

import com.skillseeker.model.SpecialistSpecialization;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpecialistSpecializationRepository extends JpaRepository<SpecialistSpecialization, Long> {}