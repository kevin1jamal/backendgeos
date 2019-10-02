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
	
	
	/* 
	 * Methode de creation d'une publicite
	 */
	@Override
	public void CreerPub(Publicite pub) {
		
		pubrep.save(pub);
	}

	
	/* Methode de modification d'une publicite
	 */
	@Override
	public void ModifierPublicite(Publicite pub) {
		
		pubrep.save(pub);
	}

	
	/* 
	 * Methode de suppression d'une publicite
	 */
	@Override
	public void SupprimerPub(Long idPub) {
		
		pubrep.deleteById(idPub);
	}

}
