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
public class Consultation {
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private Long idCons;
	//private Date dateCons;
	//private Time heureCons;

}
