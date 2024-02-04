package com.gestiondechets.validator;

import java.util.List;

import org.springframework.util.StringUtils;

import java.util.ArrayList;

import com.gestiondechets.dto.UserDto;
import com.gestiondechets.model.UserType;

public class UserValidator {
	
	public static List<String> validate(UserDto userDto) {
		List<String> errors = new ArrayList<>();
		
		if(userDto == null) {
			errors.add("Veillez renseigner le nom de l'utilisateur");
			errors.add("Veillez renseigner le numero de télephone de l'utilisateur");
			errors.add("Veillez renseigner l'email de l'utilisateur");
			errors.add("Veillez renseigner le mot de passe de l'utilisateur");
			
			return errors;
		}
		
		if(!StringUtils.hasLength(userDto.getFullName())) {
			errors.add("Veillez renseigner le nom de l'utilisateur");
		}
		
		if(!StringUtils.hasLength(userDto.getPhoneNumber())) {
			errors.add("Veillez renseigner le numero de télephone de l'utilisateur");
		}
		
		if(!StringUtils.hasLength(userDto.getEmail())) {
			errors.add("Veillez renseigner l'email de l'utilisateur");
		}
		
		if(!StringUtils.hasLength(userDto.getPassword())) {
			errors.add("Veillez renseigner le mot de passe de l'utilisateur");
		}
		
		return errors;
	}

}
