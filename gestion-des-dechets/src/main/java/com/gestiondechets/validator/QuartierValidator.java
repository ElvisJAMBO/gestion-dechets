package com.gestiondechets.validator;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.StringUtils;

import com.gestiondechets.dto.QuartierDto;

public class QuartierValidator {
	
	public static List<String> validate(QuartierDto quartierDto) {
		List<String> errors = new ArrayList<>();
		if(quartierDto == null || !StringUtils.hasLength(quartierDto.getNomQuartier())) {
			errors.add("Veiillez renseigner le nom du quartier");
		}
		return errors;
	}

}
