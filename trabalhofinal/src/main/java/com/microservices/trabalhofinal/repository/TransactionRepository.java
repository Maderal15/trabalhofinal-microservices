package com.microservices.trabalhofinal.repository;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.microservices.trabalhofinal.model.Statistics;
import com.microservices.trabalhofinal.model.Transactions;

@Repository
public class TransactionRepository {
	
	private ArrayList<Transactions> transactions;
	
	public TransactionRepository() {
		transactions = new ArrayList<Transactions>();
	}
	
    public Transactions save(Transactions transaction){
        this.transactions.add(transaction);
        return transaction;
    }

    public Statistics getStatitics(Statistics statistic){
		return statistic;
   
    }
    
    public ArrayList<Transactions> getTransactions() {
    	return transactions;
    }

}
