/**
 * Copyright (c) 2021 Aarón Prades Arraya
 *
 * Author: aprades96@gmail.com
 */
package com.aprades.bank.info.db.jpa.dto;

import lombok.*;

import java.util.List;

@Data
@Builder
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class AccountDto {

	private Long id;
	private Double balance;
	private List<PayrollDto> payrollList;
	private List<LoanDto> loanList;
	private List<FixedExpenseDto> fixedExpenseList;
	private List<VariableDto> variableList;

}