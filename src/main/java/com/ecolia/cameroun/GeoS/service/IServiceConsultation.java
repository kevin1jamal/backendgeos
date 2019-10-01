package com.ecolia.cameroun.GeoS.service;

import java.util.Date;
import java.util.List;

import com.ecolia.cameroun.GeoS.entity.Consultation;


public interface IServiceConsultation {
		
	public void CreerCons(Consultation cons);
	public List <Consultation> getAllCons();
	List<Consultation> AfficherConsDate(Date dateCons);	
	public List <Consultation> AfficherConsPer(Long idCons);
 
}
