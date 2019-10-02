package com.ecolia.cameroun.GeoS.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecolia.cameroun.GeoS.entity.Offreur;
import com.ecolia.cameroun.GeoS.repository.OffreurRepository;
import com.ecolia.cameroun.GeoS.service.IServiceOffreur;

@Service
public class ServiceOffreur implements IServiceOffreur{

	@Autowired
	OffreurRepository offrep;
	
	
	/* 
	 * Methode de creation d'un nouvel offreur
	 */
	@Override
	public void CreerOffreur(Offreur offr) {
		
		offrep.save(offr);	
	}

	
	/* 
	 * Methode de modification d'un offreur
	 */
	@Override
	public void ModifierOffreur(Offreur offr) {
		
		offrep.save(offr);		
	}

	
	/* 
	 * Methode d'affichage de la liste des offreurs
	 */
	@Override
	public List<Offreur> AfficherOffreurs() {
		
		return offrep.findAll();
	}

	
	/* 
	 * Methode de desactivation d'un offreur
	 */
	@Override
	public void DesactiverOffreur(Offreur offr) {
		
		offr.setIsactive(true);
		offrep.save(offr);
	}

	
	/* 
	 * Methode d'affichage d'un offreur
	 */
	@Override
	public Offreur getOneOffreur(Long idOffreur) {
		
		return offrep.getOne(idOffreur);
	}

	
	/* 
	 * Methode d'affichage de la liste des offreurs actifs
	 */
	@Override
	public List<Offreur> OffreurActif() {
		
		return null;
		//return offrep.findByIsActive();
	}

}
