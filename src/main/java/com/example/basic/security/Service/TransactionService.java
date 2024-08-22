package com.example.basic.security.Service;

import com.example.basic.security.Model.Expense;
import com.example.basic.security.Model.Income;
import com.example.basic.security.Repo.ExpenseRepo;
import com.example.basic.security.Repo.IncomeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class TransactionService {
    @Autowired
    IncomeRepo incomeRepo;
    @Autowired
    ExpenseRepo expenseRepo;

    public List<Income> getAllIncome() {
        return incomeRepo.findAll();
    }

    public Income addIncome(Income income) {
      return  incomeRepo.save(income);
    }

    public Income updateIncome(Long id, Income income) {
        Income existingIncome = incomeRepo.findById(id).orElseThrow(() -> new RuntimeException("Income not found"));
        existingIncome.setAmount(income.getAmount());
        existingIncome.setTag(income.getTag());
        existingIncome.setDate(income.getDate());
        return incomeRepo.save(existingIncome);


    }

    public void deleteIncome(Long id) {
        incomeRepo.deleteById(id);
    }

    public double getTotalIncome() {
        return incomeRepo.findAll().stream().mapToDouble(Income::getAmount).sum();
    }


    public Expense addExpense(Expense expense) {
        return expenseRepo.save(expense);
    }

    public Expense updateExpense(Long id, Expense expense) {
        Expense existingExpense = expenseRepo.findById(id).orElseThrow(() -> new RuntimeException("Expense not found"));
        existingExpense.setAmount(expense.getAmount());
        existingExpense.setDate(expense.getDate());
        existingExpense.setTag(expense.getTag());
        return expenseRepo.save(existingExpense);
    }

    public void deleteExpense(Long id) {
        expenseRepo.deleteById(id);
    }

    public double getTotalExpense() {
        return expenseRepo.findAll().stream().mapToDouble(Expense::getAmount).sum();
    }

    public double getNetWorth() {
        return getTotalIncome() - getTotalExpense();
    }

    public List<Expense> getAllExpense() {
        return expenseRepo.findAll();
    }
}
