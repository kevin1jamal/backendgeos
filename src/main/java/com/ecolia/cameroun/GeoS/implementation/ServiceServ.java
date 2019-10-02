package com.ecolia.cameroun.GeoS.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecolia.cameroun.GeoS.entity.Services;
import com.ecolia.cameroun.GeoS.repository.ServicesRepository;
import com.ecolia.cameroun.GeoS.service.IServiceServ;

@Service
public class ServiceServ implements IServiceServ{

	@Autowired
	ServicesRepository servrep;
	
	
	/* 
	 * Methode de creation d'un service
	 */
	@Override
	public void CreerServ(Services serv) {
		
		servrep.save(serv);
	}

	
	/* 
	 * Methode de modification d'un service
	 */
	@Override
	public void ModifierServ(Services serv) {
		
		servrep.save(serv);
	}

	
	/* 
	 * Methode d'affichage d'un service
	 */
	@Override
	public Services getOneService(Long idServ) {
		
		return servrep.getOne(idServ);
	}

	
	/* 
	 * Methode de suppression d'un service
	 */
	@Override
	public void SupprimerServ(Long idServ) {
		
		servrep.deleteById(idServ);
	}

	
	/* 
	 * Methode d'affichage de la liste des services
	 */
	@Override
	public List<Services> AfficherServices() {
		
		return servrep.findAll();
	}

}
