package com.gestiondechets.model;

import java.time.Instant;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "collecte")
public class Collecte extends AbstractEntity{
	
	@Column(name = "date_collecte")
	private Instant dateCollecte;
	
	@ManyToOne
	@JoinColumn(name = "pointcollecte_id")
	@JsonIgnore
	private PointCollecte pointcollecte;
	
	@Column(name = "statut")
	private boolean statut;

}
