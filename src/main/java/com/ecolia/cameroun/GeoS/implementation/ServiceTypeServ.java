package com.ecolia.cameroun.GeoS.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecolia.cameroun.GeoS.entity.TypeService;
import com.ecolia.cameroun.GeoS.repository.TypeServiceRepository;
import com.ecolia.cameroun.GeoS.service.IServiceTypeServ;

@Service
public class ServiceTypeServ implements IServiceTypeServ{

	@Autowired
	TypeServiceRepository typerep;
	
	/* 
	 * Methode de creation d'un type de service
	 */
	@Override
	public void CreerTypeServ(TypeService typeserv) {
		
		typerep.save(typeserv);
	}

	/* 
	 * Methode de modification d'un type de service
	 */
	@Override
	public void ModifierTypeServ(TypeService typeserv) {
		
		typerep.save(typeserv);
	}

	/* 
	 * Methode d'affichage d'un type de service
	 */
	@Override
	public TypeService getOneTypeServ(Long idTypeServ) {
		
		return typerep.getOne(idTypeServ);
	}

	/* 
	 * Methode de suppression d'un type de service
	 */
	@Override
	public void SupprimerTypeServ(Long idTypeServ) {
		
		typerep.deleteById(idTypeServ);
	}

	/* 
	 * Methode d'affichage de la liste des types de services
	 */
	@Override
	public List<TypeService> AllTypeServices() {
		
		return typerep.findAll();
	}

}
