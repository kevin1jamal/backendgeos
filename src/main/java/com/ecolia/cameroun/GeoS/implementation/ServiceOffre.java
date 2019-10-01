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
	@Override
	public void CreerOffre(Offre offre) {
		// TODO Auto-generated method stub
		
		offrerep.save(offre);
	}

	@Override
	public void ModifierOffre(Offre offre) {
		// TODO Auto-generated method stub
		
		offrerep.save(offre);
	}

	@Override
	public void SupprimerOffre(Long idOffre) {
		// TODO Auto-generated method stub
		
		offrerep.deleteById(idOffre);
	}

	@Override
	public Offre AfficherOffre(Long idOffre) {
		// TODO Auto-generated method stub
		
		return offrerep.getOne(idOffre);
	}

	@Override
	public List<Offre> ListOffres() {
		// TODO Auto-generated method stub
		
		return offrerep.findAll();
	}

	@Override
	public void ReserverOffre(Offre offre) {
		// TODO Auto-generated method stub
		
		
	}

	/*
	@Override
	public void AfficherNote(Double note) {
		// TODO Auto-generated method stub
		
	
	}

*/
}
