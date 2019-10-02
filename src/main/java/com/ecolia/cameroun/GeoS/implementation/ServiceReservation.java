package com.ecolia.cameroun.GeoS.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecolia.cameroun.GeoS.entity.Reservation;
import com.ecolia.cameroun.GeoS.repository.ReservationRepository;
import com.ecolia.cameroun.GeoS.service.IServiceReservation;

@Service
public class ServiceReservation implements IServiceReservation{

	@Autowired
	ReservationRepository reservrep;
	
	
	/* 
	 * Methode d'ajout d'une reservation
	 */
	@Override
	public void CreerReservation(Reservation reserv) {
	
		reservrep.save(reserv);
	}

	
	/* 
	 * Methode de modification d'une reservation
	 */
	@Override
	public void ModifierReservation(Reservation reserv) {
		
		reservrep.save(reserv);
	}

	
	/* 
	 * Methode d'affichage d'une reservation
	 */
	@Override
	public Reservation getOneReservation(Long idRes) {
		
		return reservrep.getOne(idRes);
	}

	
	/* 
	 * Methode pour annuler une reservation
	 */
	@Override
	public void AnnulerReservation(Long idRes) {
		
		reservrep.deleteById(idRes);
	}

	
	/* 
	 * Methode d'afficher la liste des reservations
	 */
	@Override
	public List<Reservation> AfficherReservations() {
		
		return reservrep.findAll();
	}
	

}
