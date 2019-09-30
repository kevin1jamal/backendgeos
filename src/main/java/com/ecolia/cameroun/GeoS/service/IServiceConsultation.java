package com.ecolia.cameroun.GeoS.service;

import java.util.List;

import com.ecolia.cameroun.GeoS.entity.Consultation;


public interface IServiceConsultation {
		
	public void CreerCons(Consultation cons);
	public List <Consultation> getAllCons();
	public Consultation AfficherConsDate(Long idCons);
	public List <Consultation> AfficherConsPer(Long idCons);	
 
}
