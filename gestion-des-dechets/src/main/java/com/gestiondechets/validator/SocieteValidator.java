package com.gestiondechets.validator;

import java.util.List;
import java.util.ArrayList;

import org.springframework.util.StringUtils;

import com.gestiondechets.dto.SocieteDto;

public class SocieteValidator {
	
	public static List<String> validate(SocieteDto societeDto) {
		List<String> errors = new ArrayList<>();
		if(societeDto == null || !StringUtils.hasLength(societeDto.getNomSociete())) {
			errors.add("Veiillez renseigner le nom de la société");
		}
		return errors;
	}

}
