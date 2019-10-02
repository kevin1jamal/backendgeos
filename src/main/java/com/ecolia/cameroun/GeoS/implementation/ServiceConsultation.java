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
	
	/* 
	 * Methode de creation d'une consultation
	 */
	@Override
	public void CreerCons(Consultation cons) {
		
		consrep.save(cons);	
	}

	/* 
	 * Methode pour lister l'ensemle des consultations
	 */
	@Override
	public List<Consultation> getAllCons() {
		
		return consrep.findAll();
	}

	/* 
	 * Methode d'affichage de la liste des consultations par date
	 */
	@Override
	public List <Consultation> AfficherConsDate(Date dateCons) {
		
		return null;
		//return consrep.findByDate(dateCons);
	}

	/* 
	 * Methode d'affichage de la liste des consultations par période
	 */
	@Override
	public List<Consultation> AfficherConsPer(Long idCons) {
		
		return null;
	}
	

}
