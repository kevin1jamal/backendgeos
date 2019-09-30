package com.ecolia.cameroun.GeoS.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Reservation {
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private Long idRes;
	private Offre offre;
	private Date dateRes;
	private Double montant;
	

}
