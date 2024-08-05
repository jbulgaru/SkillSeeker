package com.skillseeker.servce;

import com.skillseeker.repository.SpecialistRepository;
import com.skillseeker.servce.interfaces.ISpecialistService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SpecialistServiceImpl implements ISpecialistService {
    private final SpecialistRepository specialistRepository;


    //to-do
}
