package com.ecolia.cameroun.GeoS.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@Entity
public class Offre {
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private Long idOffre;
	private String lien;
	private String description;
	@OneToMany
	private List <Services> services;
	//private String image;
	private String telephone;
	private Menu menuJour;
	private Commentaires commentaires;
	private Consultation consultation;
	

}
