package com.bootcamp.reports.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Clase de entidad para clientes personales
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
	private String id;
	private String name;
	private String lastName;
	private String dni;
	private String email;
	private String telephone;
	private String typeCustomer;
}
