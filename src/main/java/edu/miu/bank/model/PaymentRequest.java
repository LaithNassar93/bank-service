package edu.miu.bank.model;

import lombok.Data;

@Data
public class PaymentRequest {
    private double price;
    private String accountNumber;
}