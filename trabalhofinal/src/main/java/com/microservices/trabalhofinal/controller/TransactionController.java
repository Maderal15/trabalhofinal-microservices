package com.microservices.trabalhofinal.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.trabalhofinal.model.Statistics;
import com.microservices.trabalhofinal.model.Transactions;
import com.microservices.trabalhofinal.service.TransactionService;

import io.micrometer.core.instrument.Statistic;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@Api(value = "Transaction", description = "Transaction REST API")
public class TransactionController {
	
	private TransactionService transactionService;
	

    @Autowired
    public TransactionController(TransactionService transactionService){
        this.transactionService = transactionService;
    }

	
    @ApiOperation(httpMethod = "POST", value = "Método post para salvar um transactions.")
    @ApiResponses(value = {
    		@ApiResponse(code = 201, message = "Criado",  response = Transactions.class),
    		@ApiResponse(code = 204, message = "Body vazio.")
    })
    @PostMapping("/transactions")
    public ResponseEntity save(@RequestBody @Valid Transactions transaction){

    	transactionService.save(transaction);

        return ResponseEntity.status(HttpStatus.CREATED).body(null);
    }
    
	@ApiOperation(httpMethod = "GET", value = "Metodo GET faz os calcalos dos 60 segundos")
    @ApiResponses(value = {
        @ApiResponse(
            code = 200,  message = "Retorna um Statistics",  response = Statistic.class
        )
    })
	@GetMapping("/statistics")
 	public ResponseEntity<Statistics> getStatistics(){
		
		Statistics statistics = transactionService.getStatitics();
	
		return ResponseEntity.status(HttpStatus.OK).body(statistics);
	
	}

}
