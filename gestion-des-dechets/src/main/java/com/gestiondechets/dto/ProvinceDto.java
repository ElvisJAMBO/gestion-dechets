package com.gestiondechets.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.gestiondechets.model.Province;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProvinceDto {
	
	private Long id;
	private String nomProvince;
	
	@JsonIgnore
	private List<CommuneDto> communes;
	
	public static ProvinceDto fromEntity(Province province) {
		if(province == null){
			return null;
			//TODO throw an exception 
		}
		
		return ProvinceDto.builder()
				.id(province.getId())
				.nomProvince(province.getNomProvince())
				.build();
	}
	
	public static Province toEntity(ProvinceDto provinceDto) {
		if(provinceDto == null){
			return null;
			//TODO throw an exception
		}
		
		Province province = new Province();
		province.setId(provinceDto.getId());
		province.setNomProvince(provinceDto.getNomProvince());
		
		return province;
	}

}
