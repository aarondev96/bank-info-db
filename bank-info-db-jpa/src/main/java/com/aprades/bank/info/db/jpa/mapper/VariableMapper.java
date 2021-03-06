/**
 * Copyright (c) 2021 Aarón Prades Arraya
 *
 * Author: aprades96@gmail.com
 */
package com.aprades.bank.info.db.jpa.mapper;

import com.aprades.bank.info.db.jpa.dto.VariableDto;
import com.aprades.bank.info.db.jpa.entity.CategoryType;
import com.aprades.bank.info.db.jpa.entity.Variable;
import com.aprades.bank.info.db.jpa.repository.CategoryTypeRepository;
import com.aprades.bank.info.db.jpa.repository.FeeTypeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class VariableMapper {

	private static final Logger LOGGER = LoggerFactory.getLogger(VariableMapper.class);

	private final CategoryTypeRepository categoryTypeRepository;

	public VariableMapper(CategoryTypeRepository categoryTypeRepository) {
		this.categoryTypeRepository = categoryTypeRepository;
	}

	public VariableDto variableToVariableDto(Variable variable) {
		LOGGER.trace(">> variableToVariableDto() variable {}", variable);

		if (variable == null || variable.getId() == null) {
			LOGGER.warn("<< variableToVariableDto() variable or variable.id is null");
			return null;
		}
		VariableDto variableDto = VariableDto.builder()
				.id(variable.getId())
				.date(variable.getDate())
				.expense(variable.isExpense())
				.account(variable.getAccount())
				.quantity(variable.getQuantity())
				.description(variable.getDescription())
				.category(variable.getCategoryType().getCategory())
				.build();

		LOGGER.trace("<< variableToVariableDto() variableDto {}", variableDto);
		return variableDto;
	}

	public List<VariableDto> variableListToVariableDtoList(List<Variable> variableList) {
		LOGGER.trace(">> variableListToVariableDtoList() variableList {}", variableList);

		if (variableList == null || variableList.isEmpty()) {
			LOGGER.warn("<< variableListToVariableDtoList() variableList is null or variableList is empty");
			return new ArrayList<>();
		}
		List<VariableDto> variableDtoList = new ArrayList<>();
		for (Variable currentVariable : variableList) {
			variableDtoList.add(variableToVariableDto(currentVariable));
		}

		LOGGER.trace("<< variableListToVariableDtoList() variableDtoList {}", variableDtoList);
		return variableDtoList;
	}

	public Variable variableDtoToVariable(VariableDto variableDto) {
		LOGGER.trace(">> variableDtoToVariable() variableDto {}", variableDto);

		if (variableDto == null) {
			LOGGER.warn("<< variableToVariableDto() variableDto null");
			return null;
		}
		Variable variable = Variable.builder()
				.id(variableDto.getId())
				.date(variableDto.getDate())
				.expense(variableDto.isExpense())
				.account(variableDto.getAccount())
				.quantity(variableDto.getQuantity())
				.description(variableDto.getDescription())
				.build();
		Optional<CategoryType> categoryType = categoryTypeRepository.findByCategory(variableDto.getCategory());
		categoryType.ifPresent(variable::setCategoryType);

		LOGGER.trace("<< variableDtoToVariable() variable {}", variable);
		return variable;
	}

	public List<Variable> variableDtoListToVariableList(List<VariableDto> variableDtoList) {
		LOGGER.trace(">> variableDtoListToVariableList() variableDtoList {}", variableDtoList);

		if (variableDtoList == null || variableDtoList.isEmpty()) {
			LOGGER.warn("<< variableDtoListToVariableList() variableDtoList is null or variableDtoList is empty");
			return new ArrayList<>();
		}
		List<Variable> variableList = new ArrayList<>();
		for (VariableDto currentVariableDto : variableDtoList) {
			variableList.add(variableDtoToVariable(currentVariableDto));
		}

		LOGGER.trace("<< variableDtoListToVariableList() variableList {}", variableList);
		return variableList;
	}

}
