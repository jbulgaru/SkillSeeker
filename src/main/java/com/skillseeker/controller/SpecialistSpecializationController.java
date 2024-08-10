package com.skillseeker.controller;

import com.skillseeker.model.SpecialistSpecialization;
import com.skillseeker.service.interfaces.ISpecialistSpecializationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/specialist-specializations")
public class SpecialistSpecializationController {

    private final ISpecialistSpecializationService specialistSpecializationService;



    @PostMapping
    public ResponseEntity<SpecialistSpecialization> createSpecialistSpecialization(@RequestBody SpecialistSpecialization specialistSpecialization) {
        SpecialistSpecialization savedSpecialistSpecialization = specialistSpecializationService.saveSpecialistSpecialization(specialistSpecialization);
        return new ResponseEntity<>(savedSpecialistSpecialization, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<SpecialistSpecialization> getSpecialistSpecializationById(@PathVariable Long id) {
        Optional<SpecialistSpecialization> specialistSpecialization = specialistSpecializationService.findSpecialistSpecializationById(id);
        return specialistSpecialization.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }

    @GetMapping
    public ResponseEntity<List<SpecialistSpecialization>> getAllSpecialistSpecializations() {
        List<SpecialistSpecialization> specialistSpecializations = specialistSpecializationService.findAllSpecialistSpecializations();
        return new ResponseEntity<>(specialistSpecializations, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSpecialistSpecializationById(@PathVariable Long id) {
        specialistSpecializationService.deleteSpecialistSpecializationById(id);
        return ResponseEntity.noContent().build();
    }
}
