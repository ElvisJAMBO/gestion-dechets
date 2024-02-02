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
@Table(name = "pointcollecte")
public class PointCollecte extends AbstractEntity{
	
	@Column(name = "nom_pointcollecte")
	private String nomPointcollecte;
	
	@ManyToOne
	@JoinColumn(name = "quartier_id")
	@JsonIgnore
	private Quartier quartier;
	
	@Column(name = "quantite")
	private Long quantite;
	
	@OneToMany(mappedBy = "pointcollecte")
	private List<Collecte> collectes;

}
