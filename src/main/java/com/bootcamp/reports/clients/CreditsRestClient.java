package com.bootcamp.reports.clients;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.bootcamp.reports.clients.config.RestConfig;
import com.bootcamp.reports.dto.Credit;
import com.bootcamp.reports.dto.CreditCard;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * Clase de acceso al microservicio de creditos
 */
@Service
public class CreditsRestClient {
    RestConfig restConfig = new RestConfig();
	
	public Flux<Credit> getAllCreditXCustomerId(String id) {
		WebClient webClient = WebClient.create("http://localhost:8084");
        return  webClient.get()
                .uri("/credit/consult/"+id)
                .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .retrieve()
                .bodyToFlux(Credit.class);
	}
	
	public Flux<CreditCard> getAllCreditCardXCustomerId(String id) {
		WebClient webClient = WebClient.create("http://localhost:8084");
        return  webClient.get()
                .uri("/creditcard/consult/"+id)
                .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .retrieve()
                .bodyToFlux(CreditCard.class);
	}
	
	public Mono<Credit> getCreditById(String id) {
		WebClient webClient = WebClient.create("http://localhost:8084");
        return  webClient.get()
                .uri("/credit/"+id)
                .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .retrieve()
                .bodyToMono(Credit.class);
	}
	
	public Mono<CreditCard> getCreditCardById(String id) {
		WebClient webClient = WebClient.create("http://localhost:8084");
        return  webClient.get()
                .uri("/creditcard/"+id)
                .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .retrieve()
                .bodyToMono(CreditCard.class);
	}
}
