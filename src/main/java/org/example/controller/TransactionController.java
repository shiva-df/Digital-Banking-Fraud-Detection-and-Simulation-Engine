package org.example.controller;

import org.example.model.Transaction;
import org.example.service.SimpleTransactionGenerator;
import org.example.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/transactions")
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    // Generate a random transaction and save it
    @PostMapping("/generate")
    public Transaction generateAndSaveTransaction() {
        Transaction t = SimpleTransactionGenerator.generateTransaction();
        transactionService.saveTransaction(t);
        return t;
    }

    // Save a transaction provided in JSON body
    @PostMapping("/save")
    public String saveTransaction(@RequestBody Transaction t) {
        transactionService.saveTransaction(t);
        return "Transaction saved!";
    }

    // Get all transactions
    @GetMapping("/all")
    public List<Transaction> getAllTransactions() {
        return transactionService.getAllTransactions();
    }
}
