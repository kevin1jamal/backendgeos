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
	@Override
	public void CreerPeriode(Periode per) {
		// TODO Auto-generated method stub
		
		periodrep.save(per);
	}

	@Override
	public void ModifierPeriode(Periode per) {
		// TODO Auto-generated method stub
		
		periodrep.save(per);
	}

	@Override
	public Periode getOnePeriode(Long idPer) {
		// TODO Auto-generated method stub
		
		return periodrep.getOne(idPer);
	}

	@Override
	public void SupprimerPeriode(Periode per) {
		// TODO Auto-generated method stub
		
		periodrep.delete(per);
	}

}
