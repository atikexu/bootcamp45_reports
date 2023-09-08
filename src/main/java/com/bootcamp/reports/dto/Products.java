package com.bootcamp.reports.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Clase de transferencia de datos para los productos de los clientes
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(Include.NON_NULL)
public class Products {
	private Customer customer;
	private List<Account> account;
	private List<Credit> credit;
	private List<CreditCard> creditCard;
}
