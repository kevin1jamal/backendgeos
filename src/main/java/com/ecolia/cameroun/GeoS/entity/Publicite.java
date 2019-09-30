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

public class Publicite {
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private Long idPub;
	//private File image;
	private String message;
	private boolean isVisible;

}
