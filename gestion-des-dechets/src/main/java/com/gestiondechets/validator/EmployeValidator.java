package com.gestiondechets.validator;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.StringUtils;

import com.gestiondechets.dto.EmployeDto;

public class EmployeValidator {
	
	public static List<String> validate(EmployeDto employeDto) {
		List<String> errors = new ArrayList<>();
		if(employeDto == null || !StringUtils.hasLength(employeDto.getNomEmploye())) {
			errors.add("Veiillez renseigner le nom complet");
		}
		return errors;
	}

}
