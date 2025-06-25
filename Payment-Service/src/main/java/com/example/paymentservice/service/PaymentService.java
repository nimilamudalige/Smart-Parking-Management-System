package com.example.paymentservice.service;

import com.example.paymentservice.dto.PaymentDTO;
import com.example.paymentservice.dto.ResponseDTO;

import java.util.List;

public interface PaymentService {
    ResponseDTO savePaymentAndTransaction(PaymentDTO paymentDTO);

    List<PaymentDTO> getAllPayments();

    List<PaymentDTO> getAllPaymentBYEmail(String email);
}
