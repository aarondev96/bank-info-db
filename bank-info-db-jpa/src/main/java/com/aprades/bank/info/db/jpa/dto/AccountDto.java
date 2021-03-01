/**
 * Copyright (c) 2021 Aarón Prades Arraya
 *
 * Author: aprades96@gmail.com
 */
package com.aprades.bank.info.db.jpa.dto;

import com.aprades.bank.info.db.jpa.entity.FixedExpense;
import com.aprades.bank.info.db.jpa.entity.Loan;
import com.aprades.bank.info.db.jpa.entity.Payroll;
import com.aprades.bank.info.db.jpa.entity.Variable;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@Builder
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class AccountDto {

	private Long id;
	private Double balance;
	private List<Payroll> payrollList;
	private List<Loan> loanList;
	private List<FixedExpense> fixedExpenseList;
	private List<Variable> variableList;

}