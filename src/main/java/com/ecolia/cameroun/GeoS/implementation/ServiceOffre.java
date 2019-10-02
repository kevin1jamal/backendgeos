package com.ecolia.cameroun.GeoS.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecolia.cameroun.GeoS.entity.Offre;
import com.ecolia.cameroun.GeoS.repository.OffreRepository;
import com.ecolia.cameroun.GeoS.service.IServiceOffre;

@Service
public class ServiceOffre implements IServiceOffre{

	@Autowired
	OffreRepository offrerep;
	
	
	/* 
	 * Methode de creation d'une Offre
	 */
	@Override
	public void CreerOffre(Offre offre) {
		
		offrerep.save(offre);
	}

	
	/* 
	 * Methode de modification d'une offre
	 */
	@Override
	public void ModifierOffre(Offre offre) {
		
		offrerep.save(offre);
	}

	
	/* 
	 * Methode pour annuler une offre
	 */
	@Override
	public void SupprimerOffre(Long idOffre) {
		
		offrerep.deleteById(idOffre);
	}

	
	/* 
	 * Methode d'affichage d'une offre
	 */
	@Override
	public Offre AfficherOffre(Long idOffre) {
		
		return offrerep.getOne(idOffre);
	}

	
	/* 
	 * Methode pour Lister toutes les offres
	 */
	@Override
	public List<Offre> ListOffres() {
		
		return offrerep.findAll();
	}

	
	/* 
	 * Methode de reservation d'une offre
	 */
	@Override
	public void ReserverOffre(Offre offre) {
		
		
	}

	
	 
	/*
	 * Methode d'affichage de la note d'une offre de services
	 */
/*
	@Override
	public void AfficherNote(Double note) {
		
	
	}
	
*/
}
