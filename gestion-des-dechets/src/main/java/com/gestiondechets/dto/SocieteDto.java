package com.gestiondechets.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.gestiondechets.model.Societe;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SocieteDto {
	
	private Long id;
	private String nomSociete;
	
	@JsonIgnore
	private List<EquipeDto> equipes;
	
	public static SocieteDto fromEntity(Societe societe) {
		if(societe == null){
			return null;
			//TODO throw an exception 
		}
		
		return SocieteDto.builder()
				.id(societe.getId())
				.nomSociete(societe.getNomSociete())
				.build();
	}
	
	public static Societe toEntity(SocieteDto societeDto) {
		if(societeDto == null){
			return null;
			//TODO throw an exception
		}
		
		Societe societe = new Societe();
		societe.setId(societeDto.getId());
		societe.setNomSociete(societeDto.getNomSociete());
		
		return societe;
	}

}
