package com.gestiondechets.validator;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.StringUtils;

import com.gestiondechets.dto.PointCollecteDto;

public class PointCollecteValidator {
	
	public static List<String> validate(PointCollecteDto pointCollecteDto) {
		List<String> errors = new ArrayList<>();
		if(pointCollecteDto == null || !StringUtils.hasLength(pointCollecteDto.getNomPointcollecte())) {
			errors.add("Veiillez renseigner le nom du point de collecte");
		}
		return errors;
	}

}
