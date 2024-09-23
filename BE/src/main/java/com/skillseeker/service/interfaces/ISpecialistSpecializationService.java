package com.skillseeker.service.interfaces;

import com.skillseeker.model.SpecialistSpecialization;

import java.util.List;
import java.util.Optional;

public interface ISpecialistSpecializationService {
    SpecialistSpecialization saveSpecialistSpecialization(SpecialistSpecialization specialistSpecialization);
    Optional<SpecialistSpecialization> findSpecialistSpecializationById(Long id);
    List<SpecialistSpecialization> findAllSpecialistSpecializations();
    void deleteSpecialistSpecializationById(Long id);
}