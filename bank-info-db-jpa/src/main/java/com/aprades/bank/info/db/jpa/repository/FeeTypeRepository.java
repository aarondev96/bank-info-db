/**
 * Copyright (c) 2021 Aarón Prades Arraya
 *
 * Author: aprades96@gmail.com
 */
package com.aprades.bank.info.db.jpa.repository;

import com.aprades.bank.info.db.jpa.entity.FeeType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FeeTypeRepository extends CrudRepository<FeeType, Long> {

	Optional<FeeType> findByType(String type);

}