package com.bootcamp.reports.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Clase de entidad para clientes empresariales
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Company {
	private String id;
	private String businessName;
	private String ruc;
	private String email;
	private String telephone;
	private List<AuthorizedDto> headlines;
	private List<AuthorizedDto> signatories;
	private String typeCustomer;
}
