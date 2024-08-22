package com.example.basic.security.Controller;

import com.example.basic.security.Model.Expense;
import com.example.basic.security.Model.Income;
import com.example.basic.security.Service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/transactions")
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    // Income Endpoints
    @GetMapping("/income")
    public List<Income> getAllIncome() {
        return transactionService.getAllIncome();
    }

    @PostMapping("/income")
    public Income addIncome(@RequestBody Income income) {
        return transactionService.addIncome(income);
    }

    @PutMapping("/income/{id}")
    public Income updateIncome(@PathVariable Long id, @RequestBody Income income) {
        return transactionService.updateIncome(id, income);
    }

    @DeleteMapping("/income/{id}")
    public void deleteIncome(@PathVariable Long id) {
        transactionService.deleteIncome(id);
    }

    @GetMapping("/total-income")
    public double getTotalIncome() {
        return transactionService.getTotalIncome();
    }

    @GetMapping("/expense")
    public List<Expense> getAllExpense() {
        return transactionService.getAllExpense();
    }
    @PostMapping("/expense")
    public Expense addExpense(@RequestBody Expense expense) {
        return transactionService.addExpense(expense);
    }

    @PutMapping("/expense/{id}")
    public Expense updateExpense(@PathVariable Long id, @RequestBody Expense expense) {
        return transactionService.updateExpense(id, expense);
    }

    @DeleteMapping("/expense/{id}")
    public void deleteExpense(@PathVariable Long id) {
        transactionService.deleteExpense(id);
    }

    @GetMapping("/total-expense")
    public double getTotalExpense() {
        return transactionService.getTotalExpense();
    }

    @GetMapping("/net-worth")
    public double getNetWorth() {
        return transactionService.getNetWorth();
    }
}


