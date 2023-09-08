package com.bootcamp.reports.dto;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Clase de tranferencia de datos para los movimientos de los clientes
 */
@Data
@AllArgsConstructor
@JsonInclude(Include.NON_NULL)
public class Accumulator {
	private double total;
    private long count;

    public Accumulator() {
        this.total = 0.0;
        this.count = 0;
    }

    public Accumulator add(double value) {
        total += value;
        count++;
        return this;
    }

}
