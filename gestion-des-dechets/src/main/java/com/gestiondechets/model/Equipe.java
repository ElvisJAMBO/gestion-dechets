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
@Table(name = "equipe")
public class Equipe extends AbstractEntity{
	
	@Column(name = "nom_equipe")
	private String nomEquipe;
	
	@ManyToOne
	@JoinColumn(name = "societe_id")
	@JsonIgnore
	private Societe societe;
	
	@OneToMany(mappedBy = "equipe")
	private List<Employe> employes;

}
