package com.microservices.trabalhofinal.service;

import java.util.ArrayList;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservices.trabalhofinal.excepetion.TransactionException;
import com.microservices.trabalhofinal.model.Statistics;
import com.microservices.trabalhofinal.model.Transactions;
import com.microservices.trabalhofinal.repository.TransactionRepository;

@Service
public class TransactionService {

	private TransactionRepository transactionRepository;

	@Autowired
	public TransactionService(TransactionRepository transactionRepository) {
		this.transactionRepository = transactionRepository;
	}

	public Transactions save(Transactions transaction) {

		if (System.currentTimeMillis() - transaction.getTimestamp() > 60000) {
			throw new TransactionException("");
		}

		return transactionRepository.save(transaction);
	}

	public Statistics getStatitics() {
		Statistics statc = new Statistics();

		ArrayList<Transactions> trans = (ArrayList<Transactions>) transactionRepository.getTransactions().stream()
				.filter(t -> System.currentTimeMillis() - t.getTimestamp() <= 60000).collect(Collectors.toList());

		if (trans.size() > 0) {
			statc.setAvg(trans.stream().mapToDouble(Transactions::getAmount).average().getAsDouble());

			statc.setSum(trans.stream().mapToDouble(Transactions::getAmount).sum());

			statc.setMax(trans.stream().mapToDouble(Transactions::getAmount).max().getAsDouble());

			statc.setMin(trans.stream().mapToDouble(Transactions::getAmount).min().getAsDouble());

			statc.setCount(trans.stream().mapToDouble(Transactions::getAmount).count());
		}

		return transactionRepository.getStatitics(statc);
	}

}
