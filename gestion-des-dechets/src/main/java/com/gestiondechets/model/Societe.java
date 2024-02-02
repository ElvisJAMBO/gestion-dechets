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
@Table(name = "societe")
public class Societe extends AbstractEntity{
	
	@Column(name = "nom_societe")
	private String nomSociete;
	
	@Column(name = "statut")
	private boolean statut;
	
	@OneToMany(mappedBy = "societe")
	private List<Equipe> equipes;

}
