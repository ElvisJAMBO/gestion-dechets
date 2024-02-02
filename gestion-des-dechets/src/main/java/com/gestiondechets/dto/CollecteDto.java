package com.gestiondechets.dto;

import java.time.Instant;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.gestiondechets.model.Collecte;
import com.gestiondechets.model.PointCollecte;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CollecteDto {
	
	private Long id;
	private Instant dateCollecte;
	
	@JsonIgnore
	private PointCollecteDto pointCollecte;
	
	public static CollecteDto fromEntity(Collecte collecte) {
		if(collecte == null){
			return null;
			//TODO throw an exception 
		}
		
		return CollecteDto.builder()
				.id(collecte.getId())
				.dateCollecte(collecte.getDateCollecte())
				.pointCollecte(PointCollecteDto.fromEntity(collecte.getPointcollecte()))
				.build();
	}
	
	public static Collecte toEntity(CollecteDto collecteDto) {
		if(collecteDto == null){
			return null;
			//TODO throw an exception
		}
		
		Collecte collecte = new Collecte();
		collecte.setId(collecteDto.getId());
		collecte.setDateCollecte(collecteDto.getDateCollecte());
		collecte.setPointcollecte(PointCollecteDto.toEntity(collecteDto.getPointCollecte()));
		
		return collecte;
	}

}
