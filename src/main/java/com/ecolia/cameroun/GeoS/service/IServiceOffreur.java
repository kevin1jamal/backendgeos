package com.ecolia.cameroun.GeoS.service;

import java.util.List;

import com.ecolia.cameroun.GeoS.entity.Offreur;



public interface IServiceOffreur {
	
	public void CreerOffreur(Offreur offr);
	public void ModifierOffreur(Offreur offr);
	public List <Offreur> AfficherOffreur();
	public void DesactiverOffreur(Offreur offr);
	public Offreur getOneOffreur(Long idOffreur);
	public List <Offreur> OffreurActif(); 

}
