package com.skillseeker.controller;

import com.skillseeker.model.Trade;
import com.skillseeker.service.interfaces.ITradeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/services")
public class TradeController {
    private final ITradeService tradeService;

    @PostMapping
    public ResponseEntity<Trade> createService(@RequestBody Trade service) {
        Trade createdService = tradeService.createTrade(service);
        return new ResponseEntity<>(createdService, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Trade> updateService(@PathVariable Long id, @RequestBody Trade service) {
        Trade updatedService = tradeService.updateTrade(id, service);
        return new ResponseEntity<>(updatedService, HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteService(@PathVariable Long id) {
        tradeService.deleteTrade(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Trade> getServiceById(@PathVariable Long id) {
        Trade service = tradeService.getTradeById(id);
        return new ResponseEntity<>(service, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Trade>> getAllServices() {
        List<Trade> services = tradeService.getAllTrades();
        return new ResponseEntity<>(services, HttpStatus.OK);
    }
    @GetMapping("/specialist/{specialistId}")
    public ResponseEntity<List<Trade>> getServicesBySpecialistId(@PathVariable Long specialistId) {
        List<Trade> services = tradeService.getTradesBySpecialistId(specialistId);
        return new ResponseEntity<>(services, HttpStatus.OK);
    }
}
