package com.skillseeker.service.interfaces;

import com.skillseeker.model.Payment;

import java.util.List;

public interface IPaymentService {
    Payment createPayment(Payment payment);
    Payment updatePayment(Long id, Payment payment);
    void deletePayment(Long id);
    Payment getPaymentById(Long id);
    List<Payment> getAllPayments();
    List<Payment> getPaymentsByBookingId(Long bookingId);
}
