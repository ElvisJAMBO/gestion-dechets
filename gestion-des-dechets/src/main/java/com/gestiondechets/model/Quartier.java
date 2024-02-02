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
@Table(name = "quartier")
public class Quartier extends AbstractEntity{
	
	@Column(name = "nom_quartier")
	private String nomQuartier;
	
	@ManyToOne
	@JoinColumn(name = "commune_id")
	@JsonIgnore
	private Commune commune;
	
	@Column(name = "etat")
	private boolean etat;
	
	@OneToMany(mappedBy = "quartier")
	private List<PointCollecte> pointcollectes;

}
