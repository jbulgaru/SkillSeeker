package com.skillseeker.service;

import com.skillseeker.model.SpecialistSpecialization;
import com.skillseeker.repository.SpecialistSpecializationRepository;
import com.skillseeker.service.interfaces.ISpecialistSpecializationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class SpecialistSpecializationServiceImpl implements ISpecialistSpecializationService {

    private final SpecialistSpecializationRepository specialistSpecializationRepository;

    @Override
    public SpecialistSpecialization saveSpecialistSpecialization(SpecialistSpecialization specialistSpecialization) {
        return specialistSpecializationRepository.save(specialistSpecialization);
    }

    @Override
    public Optional<SpecialistSpecialization> findSpecialistSpecializationById(Long id) {
        return specialistSpecializationRepository.findById(id);
    }

    @Override
    public List<SpecialistSpecialization> findAllSpecialistSpecializations() {
        return specialistSpecializationRepository.findAll();
    }

    @Override
    public void deleteSpecialistSpecializationById(Long id) {
        specialistSpecializationRepository.deleteById(id);
    }
}
