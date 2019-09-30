package com.ecolia.cameroun.GeoS.service;

import java.util.List;

import com.ecolia.cameroun.GeoS.entity.Periode;

public interface IServicePeriode {
	
	public void CreerPeriode(Periode per);
	public void ModifierPeriode(Periode per);
	public Periode getOnePeriode(Long idPer);
	public void SupprimerPeriode(Periode per);

}
