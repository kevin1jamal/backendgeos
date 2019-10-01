package com.ecolia.cameroun.GeoS.service;

import java.util.List;

import com.ecolia.cameroun.GeoS.entity.Offre;


public interface IServiceOffre {
	
	public void CreerOffre (Offre offre);
	public void ModifierOffre(Offre offre);
	public void SupprimerOffre(Long idOffre);
	public Offre AfficherOffre(Long idOffre);
	public List <Offre> ListOffres();
	public void ReserverOffre(Offre offre);
	//public void AfficherNote(Double note);
}
