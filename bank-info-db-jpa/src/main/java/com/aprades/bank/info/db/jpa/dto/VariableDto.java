/**
 * Copyright (c) 2021 Aarón Prades Arraya
 *
 * Author: aprades96@gmail.com
 */
package com.aprades.bank.info.db.jpa.dto;

import com.aprades.bank.info.db.jpa.entity.Account;
import lombok.*;

import java.util.Date;

@Data
@Builder
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class VariableDto {

	private Long id;
	private Date date;
	private Double quantity;
	private Account account;
	private String category;
	private String description;
	private boolean expense = true;

}