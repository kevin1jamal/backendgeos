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
public class Commentaires {
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private Long idComm;
	private String nomComm;
	private String messageComm;
	private Date dateComm;
	private float noteComm;
	

}
