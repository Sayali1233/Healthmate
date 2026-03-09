package com.healthmate.service;

import java.util.List;
import java.util.Map;

import com.healthmate.dto.PaymentRequestDTO;
import com.healthmate.dto.PaymentResponseDTO;
import com.healthmate.entities.Payment;

public interface PaymentService {

	Map<String, String> createPaymentIntent(Double amount, Long appointmentId);
	
	PaymentResponseDTO addPayment(PaymentRequestDTO paymentRequestDTO);
	
	List<PaymentResponseDTO> getAllPayments();
	
	List<PaymentResponseDTO> getPaymentsByUserId(Long userId);
	
	PaymentResponseDTO getPaymentByAppointmentId(Long appointmentId);

	PaymentResponseDTO updatePayment(Long id, PaymentRequestDTO paymentRequestDTO);
	
	void deletePayment(Long id);
	
	PaymentResponseDTO mapToDTO(Payment payment);
	
	long getPaymentsCompletedCounts();
	
	long getPaymentsPendingCounts();
	
}
