package com.microservices.trabalhofinal.model;

import io.swagger.annotations.ApiModelProperty;

public class Statistics {
	
	@ApiModelProperty(notes = "Total da soma das transações dos últimos 60 segundos.")
	private Double sum;
	
	@ApiModelProperty(notes = "Média dos valores das transações dos últimos 60 segundos.")
	private Double avg;
	
	@ApiModelProperty(notes = "Valor máximo da transações dos últimos 60 segundos.")
	private Double max;
	
	@ApiModelProperty(notes = "Valor mínimo das transações dos últimos 60 segundos.")
	private Double min;
	
	@ApiModelProperty(notes = "Número total das transações que aconteceram nos últimos 60 segundos.")
	private Long count;

	public Double getSum() {
		return sum;
	}

	public void setSum(Double sum) {
		this.sum = sum;
	}

	public Double getAvg() {
		return avg;
	}

	public void setAvg(Double avg) {
		this.avg = avg;
	}

	public Double getMax() {
		return max;
	}

	public void setMax(Double max) {
		this.max = max;
	}

	public Double getMin() {
		return min;
	}

	public void setMin(Double min) {
		this.min = min;
	}

	public Long getCount() {
		return count;
	}

	public void setCount(Long count) {
		this.count = count;
	}
	
	

}
