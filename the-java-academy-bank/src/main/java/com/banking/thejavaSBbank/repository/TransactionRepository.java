package com.banking.thejavaSBbank.repository;

import com.banking.thejavaSBbank.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction,String> {

}
