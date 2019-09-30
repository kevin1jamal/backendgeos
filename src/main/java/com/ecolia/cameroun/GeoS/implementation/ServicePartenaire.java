package com.ecolia.cameroun.GeoS.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecolia.cameroun.GeoS.entity.Partenaire;
import com.ecolia.cameroun.GeoS.repository.PartenaireRepository;
import com.ecolia.cameroun.GeoS.service.IServicePartenaire;

@Service
public class ServicePartenaire implements IServicePartenaire{

	@Autowired
	PartenaireRepository partrep;
	@Override
	public void CreerPart(Partenaire part) {
		// TODO Auto-generated method stub
				
		partrep.save(part);
		
	}

	@Override
	public void ModifierPart(Partenaire part) {
		// TODO Auto-generated method stub
		
		partrep.save(part);
	}

	@Override
	public void SupprimerPart(Partenaire part) {
		// TODO Auto-generated method stub
		
		partrep.delete(part);
		
	}

	@Override
	public Partenaire getOnePart(Long idPart) {
		// TODO Auto-generated method stub
		
		return partrep.getOne(idPart);
	
	}

}
