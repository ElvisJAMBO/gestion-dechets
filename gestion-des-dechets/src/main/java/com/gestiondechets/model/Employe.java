package com.gestiondechets.model;

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
@Table(name = "employe")
public class Employe extends AbstractEntity{

	@Column(name = "nom_employe")
	private String nomEmploye;
	
	@ManyToOne
	@JoinColumn(name = "equipe_id")
	@JsonIgnore
	private Equipe equipe;
	
}
