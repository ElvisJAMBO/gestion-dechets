package com.gestiondechets.validator;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.StringUtils;

import com.gestiondechets.dto.ProvinceDto;

public class ProvinceValidator {
	
	public static List<String> validate(ProvinceDto provinceDto) {
		List<String> errors = new ArrayList<>();
		if(provinceDto == null || !StringUtils.hasLength(provinceDto.getNomProvince())) {
			errors.add("Veiillez renseigner le nom de la province");
		}
		return errors;
	}

}
