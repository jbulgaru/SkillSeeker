package com.skillseeker.service;

import com.skillseeker.model.Trade;
import com.skillseeker.repository.TradeRepository;
import com.skillseeker.service.interfaces.ITradeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class TradeServiceImpl implements ITradeService {

    private final TradeRepository tradeRepository;

    @Override
    public Trade createTrade(Trade trade) {
        return tradeRepository.save(trade);
    }

    @Override
    public Trade updateTrade(Long id, Trade trade) {
        Optional<Trade> existingTrade = tradeRepository.findById(id);
        if (existingTrade.isPresent()) {
            Trade updatedTrade = existingTrade.get();
            updatedTrade.setServiceName(trade.getServiceName());
            updatedTrade.setServiceDescription(trade.getServiceDescription());
            updatedTrade.setPrice(trade.getPrice());
            updatedTrade.setUpdatedAt(trade.getUpdatedAt());
            return tradeRepository.save(updatedTrade);
        } else {
            throw new RuntimeException("Trade not found with id: " + id);
        }
    }

    @Override
    public void deleteTrade(Long id) {
        tradeRepository.deleteById(id);
    }

    @Override
    public Trade getTradeById(Long id) {
        return tradeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Trade not found with id: " + id));
    }

    @Override
    public List<Trade> getAllTrades() {
        return tradeRepository.findAll();
    }

    @Override
    public List<Trade> getTradesBySpecialistId(Long specialistId) {
        return List.of();
    }

}
