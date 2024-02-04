package com.gestiondechets.validator;

import java.util.List;
import java.util.ArrayList;

import com.gestiondechets.dto.QuartierSocieteDto;

public class QuartierSocieteValidator {
	
	public static List<String> validate(QuartierSocieteDto quartierSocieteDto) {
		List<String> errors = new ArrayList<>();
		
		if(quartierSocieteDto == null) {
			errors.add("Veillez séléctionner le quartier");
		}
		assert quartierSocieteDto != null;
		if(quartierSocieteDto.getQuartier() == null || quartierSocieteDto.getQuartier().getId() == null) {
			errors.add("Veillez séléctionner le quartier");
		}
		
		return errors;
	}

}
