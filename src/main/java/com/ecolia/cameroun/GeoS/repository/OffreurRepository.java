package com.ecolia.cameroun.GeoS.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecolia.cameroun.GeoS.entity.Offreur;


public interface OffreurRepository extends JpaRepository<Offreur, Long>{
	
	public List <Offreur>findByIsActive();
	

}
