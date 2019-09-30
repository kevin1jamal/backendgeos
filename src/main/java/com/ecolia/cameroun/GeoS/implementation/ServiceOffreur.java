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
	@Override
	public void CreerOffreur(Offreur offr) {
		// TODO Auto-generated method stub
		
		offrep.save(offr);
		
	}

	@Override
	public void ModifierOffreur(Offreur offr) {
		// TODO Auto-generated method stub
		
		offrep.save(offr);
		
	}

	@Override
	public List<Offreur> AfficherOffreur() {
		// TODO Auto-generated method stub
		return offrep.findAll();
	}

	@Override
	public void DesactiverOffreur(Offreur offr) {
		// TODO Auto-generated method stub	
		
		offr.setIsactive(true);
		offrep.save(offr);
	}

	@Override
	public Offreur getOneOffreur(Long idOffreur) {
		// TODO Auto-generated method stub
		return offrep.getOne(idOffreur);
	}

	@Override
	public List<Offreur> OffreurActif() {
		// TODO Auto-generated method stub
		return null;
		//return offrep.findByIsActive();
	}

}
