/**
 * Copyright (c) 2021 Aarón Prades Arraya
 *
 * Author: aprades96@gmail.com
 */
package com.aprades.bank.info.db.jpa.dto;

import lombok.*;

import java.util.Date;

@Data
@Builder
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class LoanDto {

	private Long id;
	private Date endDate;
	private boolean active;
	private Date startDate;
	private String feeType;
	private AccountDto account;
	private String category;
	private Integer chargeDay;
	private String description;
	private Double totalQuantity;
	private Double chargeQuantity;

}