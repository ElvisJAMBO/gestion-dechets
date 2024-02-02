package com.gestiondechets.validator;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.StringUtils;

import com.gestiondechets.dto.EquipeDto;

public class EquipeValidator {
	
	public static List<String> validate(EquipeDto equipeDto) {
		List<String> errors = new ArrayList<>();
		if(equipeDto == null || !StringUtils.hasLength(equipeDto.getNomEquipe())) {
			errors.add("Veiillez renseigner le nom de l'équipe");
		}
		return errors;
	}

}
