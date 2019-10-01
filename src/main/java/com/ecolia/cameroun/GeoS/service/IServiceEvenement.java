package com.ecolia.cameroun.GeoS.service;



import java.util.List;

import com.ecolia.cameroun.GeoS.entity.Evenement;


public interface IServiceEvenement {

	public void CreerEv(Evenement ev);
	public List <Evenement> AfficherEvenements();
	public Evenement getOneEvent(Long idEv);

}
