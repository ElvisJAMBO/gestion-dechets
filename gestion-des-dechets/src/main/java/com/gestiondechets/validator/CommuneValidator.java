package com.gestiondechets.validator;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.StringUtils;

import com.gestiondechets.dto.CommuneDto;

public class CommuneValidator {
	
	public static List<String> validate(CommuneDto communeDto) {
		List<String> errors = new ArrayList<>();
		if(communeDto == null || !StringUtils.hasLength(communeDto.getNomCommune())) {
			errors.add("Veiillez renseigner le nom de la commune");
		}
		return errors;
	}

}
