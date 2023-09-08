package com.bootcamp.reports.dto;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

/**
 * Clase de transferencia de datos para el microservicio de transacciones
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Transaction {
	private String id;
	private String productType; //AHORRO, C_CORRIENTE, PLAZO_FIJO, CRE_PERSONAL, CRED_EMPRESARIAL, TAR_CRED_PERSONAL, TAR_CRED_EMPRESARIAL
	private String productId;
	private String customerId;
	private String transactionType; //DEPOSITO, RETIRO, PAGO, CONSUMO
	private Double amount;
	private LocalDateTime transactionDate;
	private String customerType;
	private Double balance;
}
