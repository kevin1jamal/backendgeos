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
	@Override
	public void CreerTypeServ(TypeService typeserv) {
		// TODO Auto-generated method stub
		
		typerep.save(typeserv);
	}

	@Override
	public void ModifierTypeServ(TypeService typeserv) {
		// TODO Auto-generated method stub
		
		typerep.save(typeserv);
	}

	@Override
	public TypeService getOneTypeServ(Long idTypeServ) {
		// TODO Auto-generated method stub
		
		return typerep.getOne(idTypeServ);
	}

	@Override
	public void SupprimerTypeServ(Long idTypeServ) {
		// TODO Auto-generated method stub
		
		typerep.deleteById(idTypeServ);
	}

	@Override
	public List<TypeService> AllTypeServices() {
		// TODO Auto-generated method stub
		
		return typerep.findAll();
	}

}
