package com.gestiondechets.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.gestiondechets.model.PointCollecte;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PointCollecteDto {
	
	private Long id;
	private String nomPointcollecte;
	
	@JsonIgnore
	private QuartierDto quartier;
	
	private Long quantite;
	
	@JsonIgnore
	private List<CollecteDto> collectes;
	
	public static PointCollecteDto fromEntity(PointCollecte pointCollecte) {
		if(pointCollecte == null) {
			return null;
		}
		
		return PointCollecteDto.builder()
				.id(pointCollecte.getId())
				.nomPointcollecte(pointCollecte.getNomPointcollecte())
				.quartier(QuartierDto.fromEntity(pointCollecte.getQuartier()))
				.quantite(pointCollecte.getQuantite())
				.build();
	}
	
	public static PointCollecte toEntity(PointCollecteDto pointCollecteDto) {
		if(pointCollecteDto == null) {
			return null;
		}
		
		PointCollecte pointCollecte = new PointCollecte();
		pointCollecte.setId(pointCollecteDto.getId());
		pointCollecte.setNomPointcollecte(pointCollecteDto.getNomPointcollecte());
		pointCollecte.setQuartier(QuartierDto.toEntity(pointCollecteDto.getQuartier()));
		pointCollecte.setQuantite(pointCollecteDto.getQuantite());
		
		return pointCollecte;
	}

}
