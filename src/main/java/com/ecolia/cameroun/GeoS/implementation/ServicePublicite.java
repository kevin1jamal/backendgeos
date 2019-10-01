package com.ecolia.cameroun.GeoS.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecolia.cameroun.GeoS.entity.Publicite;
import com.ecolia.cameroun.GeoS.repository.PubliciteRepository;
import com.ecolia.cameroun.GeoS.service.IServicePublicite;

@Service
public class ServicePublicite implements IServicePublicite{

	@Autowired
	PubliciteRepository pubrep;
	@Override
	public void CreerPub(Publicite pub) {
		// TODO Auto-generated method stub
		
		pubrep.save(pub);
	}

	@Override
	public void ModifierPublicite(Publicite pub) {
		// TODO Auto-generated method stub
		
		pubrep.save(pub);
	}

	@Override
	public void SupprimerPub(Long idPub) {
		// TODO Auto-generated method stub
		
		pubrep.deleteById(idPub);
	}

}
