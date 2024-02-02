package com.gestiondechets.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.gestiondechets.model.Quartier;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class QuartierDto {
	
	private Long id;
	private String nomQuartier;
	
	@JsonIgnore
	private CommuneDto commune;
	
	private boolean etat;
	
	public static QuartierDto fromEntity(Quartier quartier) {
		if(quartier == null) {
			return null;
		}
		
		return QuartierDto.builder()
				.id(quartier.getId())
				.nomQuartier(quartier.getNomQuartier())
				.commune(CommuneDto.fromEntity(quartier.getCommune()))
				.build();
	}
	
	public static Quartier toEntity(QuartierDto quartierDto) {
		if(quartierDto == null) {
			return null;
		}
		
		Quartier quartier = new Quartier();
		quartier.setId(quartierDto.getId());
		quartier.setNomQuartier(quartierDto.getNomQuartier());
		quartier.setCommune(CommuneDto.toEntity(quartierDto.getCommune()));
		
		return quartier;
	}

}
