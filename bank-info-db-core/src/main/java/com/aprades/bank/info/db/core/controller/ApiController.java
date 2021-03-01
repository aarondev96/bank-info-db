/**
 * Copyright (c) 2021 Aarón Prades Arraya
 *
 * Author: aprades96@gmail.com
 */
package com.aprades.bank.info.db.core.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aprades.bank.info.db.core.dto.ApiResponse;
import com.aprades.bank.info.db.core.service.ApiService;

@RestController
public class ApiController {

	private static final Logger LOGGER = LoggerFactory.getLogger(ApiController.class);

	private final ApiService service;

	public ApiController(ApiService service) {
		this.service = service;
	}

	@GetMapping(value = {"/hello"}, produces = MediaType.APPLICATION_JSON_VALUE)
	public ApiResponse isApiUp() {
		LOGGER.info(">> isApiUp()");

		ApiResponse response = service.isApiUp();

		LOGGER.info("<< isApiUp() response {}", response);
		return response;
	}
}