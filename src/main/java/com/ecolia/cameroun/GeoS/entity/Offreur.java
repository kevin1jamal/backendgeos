package com.ecolia.cameroun.GeoS.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Offreur {
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private Long idOffreur;
	private String nomOffreur;
	private String telOffreur;
	private String adresseOffreur;
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List <Offre> offres;
	private boolean isactive ;
	

}
