package com.ecolia.cameroun.GeoS.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecolia.cameroun.GeoS.entity.Periode;
import com.ecolia.cameroun.GeoS.repository.PeriodeRepository;
import com.ecolia.cameroun.GeoS.service.IServicePeriode;

@Service
public class ServicePeriode implements IServicePeriode{

	@Autowired
	PeriodeRepository periodrep;
	
	
	/* 
	 * Methode de creation d'une periode
	 */
	@Override
	public void CreerPeriode(Periode per) {
		
		periodrep.save(per);
	}

	
	/* 
	 * Methode de modification d'une periode
	 */
	@Override
	public void ModifierPeriode(Periode per) {
		
		periodrep.save(per);
	}

	
	/* 
	 * Methode d'affichage d'une periode
	 */
	@Override
	public Periode getOnePeriode(Long idPer) {
		
		return periodrep.getOne(idPer);
	}

	
	/* 
	 * Methode pour annuler une periode
	 */
	@Override
	public void SupprimerPeriode(Periode per) {
		
		periodrep.delete(per);
	}

}
