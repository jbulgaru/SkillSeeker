package com.skillseeker.service;

import com.skillseeker.model.Payment;
import com.skillseeker.repository.PaymentRepository;
import com.skillseeker.service.interfaces.IPaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class PaymentServiceImpl implements IPaymentService {
    private final PaymentRepository paymentRepository;
    @Override
    public Payment createPayment(Payment payment) {
        return paymentRepository.save(payment);
    }

    @Override
    public Payment updatePayment(Long id, Payment payment) {
        Optional<Payment> existingPayment = paymentRepository.findById(id);
        if (existingPayment.isPresent()) {
            Payment updatedPayment = existingPayment.get();
            updatedPayment.setAmount(payment.getAmount());
            updatedPayment.setPaymentDate(payment.getPaymentDate());
            updatedPayment.setPaymentMethod(payment.getPaymentMethod());
            updatedPayment.setStatus(payment.getStatus());
            return paymentRepository.save(updatedPayment);
        } else {
            throw new RuntimeException("Payment not found with id: " + id);
        }
    }

    @Override
    public void deletePayment(Long id) {
        paymentRepository.deleteById(id);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Payment not found with id: " + id));
    }

    @Override
    public List<Payment> getAllPayments() {
        return paymentRepository.findAll();
    }

    @Override
    public List<Payment> getPaymentsByBookingId(Long bookingId) {
        return List.of();
    }
}
