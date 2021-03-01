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
public class PayrollDto {

	private Long id;
	private Account account;
	private Double paycheck;
	private Double extraPayment;
	private Integer paymentNumber;
	private Date annualGrossSalary;

}