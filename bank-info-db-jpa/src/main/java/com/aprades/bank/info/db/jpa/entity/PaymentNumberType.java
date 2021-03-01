/**
 * Copyright (c) 2021 Aarón Prades Arraya
 *
 * Author: aprades96@gmail.com
 */
package com.aprades.bank.info.db.jpa.entity;

import lombok.*;

import javax.persistence.*;

@Data
@Builder
@Entity(name = "payment_number_type")
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class PaymentNumberType {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Long id;

	private Integer number;

}