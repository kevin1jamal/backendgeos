package com.ecolia.cameroun.GeoS.service;


import com.ecolia.cameroun.GeoS.entity.Services;
import com.ecolia.cameroun.GeoS.entity.TypeService;


public interface IServiceTypeServ {
	
	public void CreerTypeServ(TypeService typeserv);
	public void ModifierTypeServ(Services typeserv);
	public Services getOneTypeServ(Long idTypeServ);
	public void SupprimerTypeServ(TypeService typeserv);

}
