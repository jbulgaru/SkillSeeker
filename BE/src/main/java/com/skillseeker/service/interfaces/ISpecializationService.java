package com.skillseeker.service.interfaces;

import com.skillseeker.model.Specialization;

import java.util.List;
import java.util.Optional;

public interface ISpecializationService {
    Specialization saveSpecialization(Specialization specialization);
    Optional<Specialization> findSpecializationById(Long id);
    List<Specialization> findAllSpecializations();
    void deleteSpecializationById(Long id);
}
