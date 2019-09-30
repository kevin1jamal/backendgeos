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
public class Evenement {
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private Long idEv;
	private Date dateEv;
	private String texte;


}
