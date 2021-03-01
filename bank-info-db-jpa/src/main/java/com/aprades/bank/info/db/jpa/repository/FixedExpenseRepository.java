/**
 * Copyright (c) 2021 Aarón Prades Arraya
 *
 * Author: aprades96@gmail.com
 */
package com.aprades.bank.info.db.jpa.repository;

import com.aprades.bank.info.db.jpa.entity.FixedExpense;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FixedExpenseRepository extends CrudRepository<FixedExpense, Long> {

}