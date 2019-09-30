package com.ecolia.cameroun.GeoS.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Partenaire {
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private Long idPart;
	private String nomPart;
	//private File logo;

}
