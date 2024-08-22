package com.example.basic.security.Repo;

import com.example.basic.security.Model.Expense;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseRepo extends JpaRepository<Expense,Long > {
}
