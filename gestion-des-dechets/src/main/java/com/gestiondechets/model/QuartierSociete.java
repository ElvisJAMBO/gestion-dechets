package com.gestiondechets.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "quartier_societe")
public class QuartierSociete extends AbstractEntity{
	
	@ManyToOne
	@JoinColumn(name = "societe_id")
	private Societe societe;
	
	@ManyToOne
	@JoinColumn(name = "quartier_id")
	private Quartier quartier;

}
