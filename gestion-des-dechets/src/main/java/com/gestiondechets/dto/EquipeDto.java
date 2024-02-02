package com.gestiondechets.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.gestiondechets.model.Equipe;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class EquipeDto {
	
	private Long id;
	private String nomEquipe;
	
	@JsonIgnore
	private SocieteDto societe;
	
	@JsonIgnore
	private List<EmployeDto> employes;
	
	public static EquipeDto fromEntity(Equipe equipe) {
		if(equipe == null){
			return null;
			//TODO throw an exception 
		}
		
		return EquipeDto.builder()
				.id(equipe.getId())
				.nomEquipe(equipe.getNomEquipe())
				.societe(SocieteDto.fromEntity(equipe.getSociete()))
				.build();
	}
	
	public static Equipe toEntity(EquipeDto equipeDto) {
		if(equipeDto == null){
			return null;
			//TODO throw an exception
		}
		
		Equipe equipe = new Equipe();
		equipe.setId(equipeDto.getId());
		equipe.setNomEquipe(equipeDto.getNomEquipe());
		equipe.setSociete(SocieteDto.toEntity(equipeDto.getSociete()));
		
		return equipe;
	}

}
