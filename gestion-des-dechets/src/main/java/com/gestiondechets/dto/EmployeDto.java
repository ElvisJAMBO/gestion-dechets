package com.gestiondechets.dto;



import com.fasterxml.jackson.annotation.JsonIgnore;
import com.gestiondechets.model.Employe;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class EmployeDto {
	
	private Long id;
	private String nomEmploye;
	
	@JsonIgnore
	private EquipeDto equipe;
	
	public static EmployeDto fromEntity(Employe employe) {
		if(employe == null){
			return null;
			//TODO throw an exception 
		}
		
		return EmployeDto.builder()
				.id(employe.getId())
				.nomEmploye(employe.getNomEmploye())
				.equipe(EquipeDto.fromEntity(employe.getEquipe()))
				.build();
	}
	
	public static Employe toEntity(EmployeDto employeDto) {
		if(employeDto == null){
			return null;
			//TODO throw an exception
		}
		
		Employe employe = new Employe();
		employe.setId(employeDto.getId());
		employe.setNomEmploye(employeDto.getNomEmploye());
		employe.setEquipe(EquipeDto.toEntity(employeDto.getEquipe()));
		
		return employe;
	}

}
