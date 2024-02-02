package com.gestiondechets.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "commune")
public class Commune extends AbstractEntity {
	
	@Column(name = "nom_commune")
	private String nomCommune;
	
	@ManyToOne
	@JoinColumn(name = "province_id")
	@JsonIgnore
	private Province province;
	
	@OneToMany(mappedBy = "commune")
	private List<Quartier> quartiers;

}
