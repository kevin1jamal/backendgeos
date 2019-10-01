package com.ecolia.cameroun.GeoS.service;


import com.ecolia.cameroun.GeoS.entity.Publicite;


public interface IServicePublicite {
	
	public void CreerPub(Publicite pub);
	public void ModifierPublicite(Publicite pub);
	public void SupprimerPub(Long idPub);
	

}
