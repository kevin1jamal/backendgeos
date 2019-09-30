package com.ecolia.cameroun.GeoS.service;

import com.ecolia.cameroun.GeoS.entity.Partenaire;

public interface IServicePartenaire {
	
	
	public void CreerPart(Partenaire part);
	public void ModifierPart(Partenaire part);
	public void SupprimerPart(Partenaire part);
	public Partenaire getOnePart(Long idPart);

}
