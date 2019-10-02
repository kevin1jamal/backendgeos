package com.ecolia.cameroun.GeoS.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecolia.cameroun.GeoS.entity.Menu;
import com.ecolia.cameroun.GeoS.repository.MenuRepository;
import com.ecolia.cameroun.GeoS.service.IServiceMenu;

@Service
public class ServiceMenu implements IServiceMenu{

	@Autowired
	MenuRepository menurep;
	
	
	/* 
	 * Methode de creation d'un menu
	 */
	@Override
	public void CreerMenu(Menu menu) {
	
		menurep.save(menu);
	}

	
	/* Methode de mise à jour du menu
	 */
	@Override
	public void MettreAJour(Menu menu) {
		
		menurep.save(menu);
	}

	
	/* 
	 * Methode d'affichage du menu
	 */
	@Override
	public Menu AfficherMenu(Long idMenu) {
		
		return menurep.getOne(idMenu);
	}

	
	/* 
	 * Methode pour lister tous les menus
	 */
	@Override
	public List<Menu> getAllMenu() {
		
		return menurep.findAll();
	}

}
