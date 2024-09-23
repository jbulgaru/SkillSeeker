package com.skillseeker.service.interfaces;

import com.skillseeker.model.Trade;

import java.util.List;

public interface ITradeService {
        Trade createTrade(Trade Trade);
        Trade updateTrade(Long id, Trade Trade);
        void deleteTrade(Long id);
        Trade getTradeById(Long id);
        List<Trade> getAllTrades();
        List<Trade> getTradesBySpecialistId(Long specialistId);
}
