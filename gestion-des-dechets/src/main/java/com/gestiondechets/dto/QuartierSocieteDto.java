package com.gestiondechets.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.gestiondechets.model.QuartierSociete;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class QuartierSocieteDto {
	
	private Long id;
	private QuartierDto quartier;
	private SocieteDto societe;
	
	public static QuartierSocieteDto fromEntity(QuartierSociete quartierSociete) {
		if(quartierSociete == null) {
			return null;
		}
		
		return QuartierSocieteDto.builder()
				.id(quartierSociete.getId())
				.quartier(QuartierDto.fromEntity(quartierSociete.getQuartier()))
				.societe(SocieteDto.fromEntity(quartierSociete.getSociete()))
				.build();
	}
	
	public static QuartierSociete toEntity(QuartierSocieteDto quartierSocieteDto) {
		if(quartierSocieteDto == null) {
			return null;
		}
		
		QuartierSociete quartierSociete = new QuartierSociete();
		quartierSociete.setId(quartierSocieteDto.getId());
		quartierSociete.setQuartier(QuartierDto.toEntity(quartierSocieteDto.getQuartier()));
		quartierSociete.setSociete(SocieteDto.toEntity(quartierSocieteDto.getSociete()));
		
		return quartierSociete;
	}

}
