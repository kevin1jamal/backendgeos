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
	@Override
	public void CreerServ(Services serv) {
		// TODO Auto-generated method stub
		
		servrep.save(serv);
	}

	@Override
	public void ModifierServ(Services serv) {
		// TODO Auto-generated method stub
		
		servrep.save(serv);
	}

	@Override
	public Services getOneOffreur(Long idServ) {
		// TODO Auto-generated method stub
		
		return servrep.getOne(idServ);
	}

	@Override
	public void SupprimerServ(Long idServ) {
		// TODO Auto-generated method stub
		
		servrep.deleteById(idServ);
	}

	@Override
	public List<Services> AfficherServices() {
		// TODO Auto-generated method stub
		
		return servrep.findAll();
	}

}
