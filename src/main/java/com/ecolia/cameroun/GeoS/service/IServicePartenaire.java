package com.ecolia.cameroun.GeoS.service;

import java.util.List;


import com.ecolia.cameroun.GeoS.entity.Partenaire;

public interface IServicePartenaire {
	
	
	public void CreerPart(Partenaire part);
	public void ModifierPart(Partenaire part);
	public void SupprimerPart(Partenaire part);
	public Partenaire getOnePart(Long idPart);
	public List <Partenaire> AfficherPartenaires();

}
