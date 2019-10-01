package com.ecolia.cameroun.GeoS.service;


import java.util.List;

import com.ecolia.cameroun.GeoS.entity.TypeService;


public interface IServiceTypeServ {
	
	public void CreerTypeServ(TypeService typeserv);
	public void ModifierTypeServ(TypeService typeserv);
	public TypeService getOneTypeServ(Long idTypeServ);
	public void SupprimerTypeServ(Long idTypeServ);
	public List <TypeService> AllTypeServices();
	

}
