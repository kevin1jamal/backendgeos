package com.ecolia.cameroun.GeoS.service;

import com.ecolia.cameroun.GeoS.entity.Services;

public interface IServiceServ {
	public void CreerServ(Services serv);
	public void ModifierServ(Services serv);
	public Services getOneOffreur(Long idServ);
	public void SupprimerServ(Services serv);
		

}
