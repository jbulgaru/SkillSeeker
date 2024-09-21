package com.skillseeker.service;

import com.skillseeker.model.Specialization;
import com.skillseeker.repository.SpecializationRepository;
import com.skillseeker.service.interfaces.ISpecializationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class SpecializationServiceImpl implements ISpecializationService {

    private final SpecializationRepository specializationRepository;

    @Override
    public Specialization saveSpecialization(Specialization specialization) {
        return specializationRepository.save(specialization);
    }

    @Override
    public Optional<Specialization> findSpecializationById(Long id) {
        return specializationRepository.findById(id);
    }

    @Override
    public List<Specialization> findAllSpecializations() {
        return specializationRepository.findAll();
    }

    @Override
    public void deleteSpecializationById(Long id) {
        specializationRepository.deleteById(id);
    }
}
