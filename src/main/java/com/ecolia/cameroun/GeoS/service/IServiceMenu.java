package com.ecolia.cameroun.GeoS.service;

import java.util.List;

import com.ecolia.cameroun.GeoS.entity.Menu;

public interface IServiceMenu {
	
	public void CreerMenu(Menu menu);
	public void MettreAJour(Menu menu);
	public Menu AfficherMenu(Long idMenu);
	public List <Menu> getAllMenu();

}
