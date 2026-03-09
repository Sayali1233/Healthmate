package com.healthmate.dto;

import java.time.LocalDateTime;

import com.healthmate.entities.PaymentMethod;
import com.healthmate.entities.PaymentStatus;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PaymentResponseDTO {
    private Long paymentId;
    private Double amountPaid;
    private PaymentMethod paymentMethod;
    private String transactionId;
    private PaymentStatus paymentStatus;
    private LocalDateTime paymentDate;
    private Long appointmentId;
}
