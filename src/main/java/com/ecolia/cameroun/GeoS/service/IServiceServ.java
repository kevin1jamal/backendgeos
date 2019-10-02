package com.ecolia.cameroun.GeoS.service;

import java.util.List;

import com.ecolia.cameroun.GeoS.entity.Services;

public interface IServiceServ {
	
	public void CreerServ(Services serv);
	public void ModifierServ(Services serv);
	public Services getOneService(Long idServ);
	public void SupprimerServ(Long idServ);
	public List <Services> AfficherServices();

}
