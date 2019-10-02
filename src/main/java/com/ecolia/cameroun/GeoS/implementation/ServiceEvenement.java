package com.ecolia.cameroun.GeoS.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecolia.cameroun.GeoS.entity.Evenement;
import com.ecolia.cameroun.GeoS.repository.EvenementRepository;
import com.ecolia.cameroun.GeoS.service.IServiceEvenement;

@Service
public class ServiceEvenement implements IServiceEvenement{

	@Autowired
	EvenementRepository evrep;
	
	
	/* 
	 * Methode de creation d'un evenement
	 */
	@Override
	public void CreerEv(Evenement ev) {

		evrep.save(ev);	
	}


	/* 
	 * Methode d'affichage de la liste des evenements
	 */
	@Override
	public List<Evenement> AfficherEvenements() {
		
		return evrep.findAll();
	}


	/* 
	 * Methode d'affichage d'un evenement
	 */
	@Override
	public Evenement getOneEvent(Long idEv) {
		
		return evrep.getOne(idEv);
	}



}
