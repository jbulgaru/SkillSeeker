package com.skillseeker.service.interfaces;

import com.skillseeker.model.Specialist;

import java.util.List;
import java.util.Optional;

public interface ISpecialistService {
    Specialist saveSpecialist(Specialist specialist);
    Optional<Specialist> findSpecialistById(Long id);
    List<Specialist> findAllSpecialists();
    void deleteSpecialistById(Long id);
}