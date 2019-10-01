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
	@Override
	public void CreerMenu(Menu menu) {
		// TODO Auto-generated method stub
	
		menurep.save(menu);
	}

	@Override
	public void MettreAJour(Menu menu) {
		// TODO Auto-generated method stub
		
		menurep.save(menu);
	}

	@Override
	public Menu AfficherMenu(Long idMenu) {
		// TODO Auto-generated method stub
		return menurep.getOne(idMenu);
	}

	@Override
	public List<Menu> getAllMenu() {
		// TODO Auto-generated method stub
		
		return menurep.findAll();
	}

}
