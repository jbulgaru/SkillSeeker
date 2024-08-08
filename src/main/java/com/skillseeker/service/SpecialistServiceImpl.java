package com.skillseeker.service;

import com.skillseeker.model.Specialist;
import com.skillseeker.repository.SpecialistRepository;
import com.skillseeker.service.interfaces.ISpecialistService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Transactional
@Service
@RequiredArgsConstructor
public class SpecialistServiceImpl implements ISpecialistService {
    private final SpecialistRepository specialistRepository;

    @Override
    public Specialist saveSpecialist(Specialist specialist) {
        return specialistRepository.save(specialist);
    }

    @Override
    public Optional<Specialist> findSpecialistById(Long id) {
        return specialistRepository.findById(id);
    }

    @Override
    public List<Specialist> findAllSpecialists() {
        return specialistRepository.findAll();
    }

    @Override
    public void deleteSpecialistById(Long id) {
        specialistRepository.deleteById(id);
    }
}
