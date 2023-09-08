package com.bootcamp.reports.service;

import com.bootcamp.reports.dto.AverageMovements;
import com.bootcamp.reports.dto.Movements;
import com.bootcamp.reports.dto.Products;
import reactor.core.publisher.Mono;

/**
 * Clase interfaz de servicio para las consultas de los clientes
 */
public interface ConsultService {

	Mono<Products> productXCustomerIdPerson(String customerId);
	
	Mono<Products> productXCustomerIdCompany(String customerId);

	Mono<Movements> movementXAccountId(String id);
	
	Mono<Movements> movementXCreditId(String id);
	
	Mono<Movements> movementXCreditCardId(String id);
	
	Mono<Movements> commissionXAccountId(String id);
	
	Mono<AverageMovements> averageBalancesXCustomerIdPerson(String id);
	
	Mono<AverageMovements> averageBalancesXCustomerIdCompany(String id);
	
}
