/**
 * Copyright (c) 2021 Aarón Prades Arraya
 *
 * Author: aprades96@gmail.com
 */
package com.aprades.bank.info.db.jpa.dto;

import com.aprades.bank.info.db.jpa.entity.Account;
import com.aprades.bank.info.db.jpa.entity.FeeType;
import lombok.*;

import java.util.Date;

@Data
@Builder
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class FixedExpenseDto {

	private Long id;
	private Date endDate;
	private boolean active;
	private Date startDate;
	private String feeType;
	private Account account;
	private String category;
	private Integer chargeDay;
	private String description;
	private Double chargeQuantity;

}