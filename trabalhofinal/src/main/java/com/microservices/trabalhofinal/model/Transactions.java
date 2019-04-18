package com.microservices.trabalhofinal.model;

import io.swagger.annotations.ApiModelProperty;

public class Transactions {

	@ApiModelProperty(notes = "Valor da transação.")
	private Double amount;
	
	@ApiModelProperty(notes = "Tempo da transação.")
	private Long timestamp;

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

}
