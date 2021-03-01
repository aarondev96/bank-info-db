/**
 * Copyright (c) 2021 Aarón Prades Arraya
 *
 * Author: aprades96@gmail.com
 */
package com.aprades.bank.info.db.core;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class AppInfoBean {

	@Value("${spring.application.name:unknown}")
	private String name;

	@Value("${server.port:8080}")
	private Integer port;

}
