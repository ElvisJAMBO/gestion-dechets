package com.gestiondechets.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "province")
public class Province extends AbstractEntity{
	
	@Column(name = "nom_province")
	private String nomProvince;
	
	@OneToMany(mappedBy = "province")
	private List<Commune> communes;

}
