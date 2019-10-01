package com.ecolia.cameroun.GeoS.implementation;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecolia.cameroun.GeoS.entity.Consultation;
import com.ecolia.cameroun.GeoS.repository.ConsultationRepository;
import com.ecolia.cameroun.GeoS.service.IServiceConsultation;


@Service
public class ServiceConsultation implements IServiceConsultation{

	@Autowired
	ConsultationRepository consrep;
	@Override
	public void CreerCons(Consultation cons) {
		// TODO Auto-generated method stub
		
		consrep.save(cons);	
	}

	@Override
	public List<Consultation> getAllCons() {
		// TODO Auto-generated method stub
		
		return consrep.findAll();
	}

	@Override
	public List <Consultation> AfficherConsDate(Date dateCons) {
		// TODO Auto-generated method stub
		
		return null;
		//return consrep.findByDate(dateCons);
	}

	@Override
	public List<Consultation> AfficherConsPer(Long idCons) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
