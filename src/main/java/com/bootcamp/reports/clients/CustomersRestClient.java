package com.bootcamp.reports.clients;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.bootcamp.reports.clients.config.RestConfig;
import com.bootcamp.reports.dto.Company;
import com.bootcamp.reports.dto.Person;

import reactor.core.publisher.Mono;

/**
 * Clase de acceso al microservicio de clientes
 */
@Service
public class CustomersRestClient {
    RestConfig restConfig = new RestConfig();
	
	public Mono<Person> getPersonById(String customerId) {
		WebClient webClient = WebClient.create("http://localhost:8083");
        return  webClient.get()
                .uri("/person/"+customerId)
                .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .retrieve()
                .bodyToMono(Person.class);
	}
	
	public Mono<Company> getCompanyById(String customerId) {
		WebClient webClient = WebClient.create("http://localhost:8083");
        return  webClient.get()
                .uri("/company/"+customerId)
                .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .retrieve()
                .bodyToMono(Company.class);
	}
	

}
