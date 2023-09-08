package com.bootcamp.reports.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Data;

/**
 * Clase de transferencia de datos para los clientes en las consultas
 */
@Data
@JsonInclude(Include.NON_NULL)
public class Customer {
	private String id;
	private String document;
	private String nameCustomer;
	private String email;
	private String telephone;
	private String typeCustomer;
}
