package com.ecolia.cameroun.GeoS.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecolia.cameroun.GeoS.entity.Partenaire;
import com.ecolia.cameroun.GeoS.repository.PartenaireRepository;
import com.ecolia.cameroun.GeoS.service.IServicePartenaire;

@Service
public class ServicePartenaire implements IServicePartenaire{

	@Autowired
	PartenaireRepository partrep;
	
	
	/* 
	 * Methode de creation d'un partenaire
	 */
	@Override
	public void CreerPart(Partenaire part) {
				
		partrep.save(part);
		
	}

	
	/* 
	 * Methode de modification d'un partenaire
	 */
	@Override
	public void ModifierPart(Partenaire part) {
		
		partrep.save(part);
	}

	
	/* 
	 * Methode de suppression d'un partenaire
	 */
	@Override
	public void SupprimerPart(Partenaire part) {
		
		partrep.delete(part);
		
	}

	
	/* 
	 * Methode d'affichage d'un partenaire
	 */
	@Override
	public Partenaire getOnePart(Long idPart) {
		
		return partrep.getOne(idPart);
	
	}

	
	/* 
	 * Methode d'affichage de la liste des partenaires
	 */
	@Override
	public List<Partenaire> AfficherPartenaires() {
		
		return partrep.findAll();
	}

	

}
