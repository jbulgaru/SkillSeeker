package com.skillseeker.controller;

import com.skillseeker.model.Specialist;
import com.skillseeker.service.interfaces.ISpecialistService;
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
@RequestMapping("/api/v1/specialists")
public class SpecialistController {

    private final ISpecialistService specialistService;


    @PostMapping
    public ResponseEntity<Specialist> createSpecialist(@RequestBody Specialist specialist) {
        Specialist savedSpecialist = specialistService.saveSpecialist(specialist);
        return new ResponseEntity<>(savedSpecialist, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Specialist> getSpecialistById(@PathVariable Long id) {
        Optional<Specialist> specialist = specialistService.findSpecialistById(id);
        return specialist.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }

    @GetMapping
    public ResponseEntity<List<Specialist>> getAllSpecialists() {
        List<Specialist> specialists = specialistService.findAllSpecialists();
        return new ResponseEntity<>(specialists, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSpecialistById(@PathVariable Long id) {
        specialistService.deleteSpecialistById(id);
        return ResponseEntity.noContent().build();
    }
}
