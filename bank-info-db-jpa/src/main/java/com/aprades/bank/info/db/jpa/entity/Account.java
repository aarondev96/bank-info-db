/**
 * Copyright (c) 2021 Aarón Prades Arraya
 *
 * Author: aprades96@gmail.com
 */
package com.aprades.bank.info.db.jpa.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@Builder
@Entity(name = "account")
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Account {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Long id;

	private Double balance;

	@OneToMany(mappedBy = "account")
	private List<Payroll> payrollList;

	@OneToMany(mappedBy = "account")
	private List<Loan> loanList;

	@OneToMany(mappedBy = "account")
	private List<FixedExpense> fixedExpenseList;

	@OneToMany(mappedBy = "account")
	private List<Variable> variableList;

	// TODO: User¿?¿¿?¿ (see keycloak)

}