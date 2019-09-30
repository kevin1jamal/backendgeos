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

public class Periode {
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private Long idPer;
	private String nomPer;
	private String descriptifPer;
	private Long nbrJours;

}
