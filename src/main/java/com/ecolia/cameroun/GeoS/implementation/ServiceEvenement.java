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
	@Override
	public void CreerEv(Evenement ev) {
		// TODO Auto-generated method stub

		evrep.save(ev);	
	}


	@Override
	public List<Evenement> AfficherEvenements() {
		// TODO Auto-generated method stub
		
		return evrep.findAll();
	}


	@Override
	public Evenement getOneEvent(Long idEv) {
		// TODO Auto-generated method stub
		
		return evrep.getOne(idEv);
	}



}
