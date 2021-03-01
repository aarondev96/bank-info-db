/**
 * Copyright (c) 2021 Aarón Prades Arraya
 *
 * Author: aprades96@gmail.com
 */
package com.aprades.bank.info.db.boot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.aprades.bank.info.db.core.AppInfoBean;

@SpringBootApplication
public class MainBootApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(MainBootApplication.class);

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(MainBootApplication.class, args);
		AppInfoBean appInfo = context.getBean(AppInfoBean.class);
		LOGGER.info("Started application {} on port {}", appInfo.getName(), appInfo.getPort());
	}

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

}