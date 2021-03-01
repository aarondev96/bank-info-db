/**
 * Copyright (c) 2021 Aarón Prades Arraya
 *
 * Author: aprades96@gmail.com
 */
package com.aprades.bank.info.db.jpa.repository;

import com.aprades.bank.info.db.jpa.entity.Variable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VariableRepository extends CrudRepository<Variable, Long> {

}