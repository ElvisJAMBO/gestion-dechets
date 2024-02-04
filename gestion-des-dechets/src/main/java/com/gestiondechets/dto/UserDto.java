package com.gestiondechets.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.gestiondechets.model.User;
import com.gestiondechets.model.UserType;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserDto {
	
	private Long id;
	private String fullName;
	private String phoneNumber;
	private String email;
	private String password;
	private UserType userType;
	
	public static UserDto fromEntity(User user) {
		if(user == null) {
			return null;
		}
		
		return UserDto.builder()
				.id(user.getId())
				.fullName(user.getFullName())
				.phoneNumber(user.getPhoneNumber())
				.email(user.getEmail())
				.password(user.getPassword())
				.userType(user.getUserType())
				.build();
	}
	
	public static User toEntity(UserDto userDto) {
		if(userDto == null) {
			return null;
		}
		
		User user = new User();
		user.setId(userDto.getId());
		user.setFullName(userDto.getFullName());
		user.setPhoneNumber(userDto.getPhoneNumber());
		user.setEmail(userDto.getEmail());
		user.setPassword(userDto.getPassword());
		user.setUserType(userDto.getUserType());
		
		return user;
	}

}
