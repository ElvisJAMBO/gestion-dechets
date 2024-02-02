package com.gestiondechets.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.gestiondechets.model.Commune;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CommuneDto {
	
	private Long id;
	private String nomCommune;
	
	@JsonIgnore
	private ProvinceDto province;
	
	@JsonIgnore
	private List<QuartierDto> quartiers;
	
	public static CommuneDto fromEntity(Commune commune) {
		if(commune == null) {
			return null;
		}
		
		return CommuneDto.builder()
				.id(commune.getId())
				.nomCommune(commune.getNomCommune())
				.province(ProvinceDto.fromEntity(commune.getProvince()))
				.build();
	}
	
	public static Commune toEntity(CommuneDto communeDto) {
		if(communeDto == null) {
			return null;
		}
		
		Commune commune = new Commune();
		commune.setId(communeDto.getId());
		commune.setNomCommune(communeDto.getNomCommune());
		commune.setProvince(ProvinceDto.toEntity(communeDto.getProvince()));
		
		return commune;
	}
}
