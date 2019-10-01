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
	@Override
	public void CreerReservation(Reservation reserv) {
		// methode d'ajout d'une reservation
		
		reservrep.save(reserv);
	}

	@Override
	public void ModifierReservation(Reservation reserv) {
		// TODO Auto-generated method stub
		
		reservrep.save(reserv);
	}

	@Override
	public Reservation getOneReservation(Long idRes) {
		// TODO Auto-generated method stub
		
		return reservrep.getOne(idRes);
	}

	@Override
	public void AnnulerReservation(Long idRes) {
		// TODO Auto-generated method stub
		
		reservrep.deleteById(idRes);
	}

	@Override
	public List<Reservation> AfficherReservations() {
		// TODO Auto-generated method stub
		
		return reservrep.findAll();
	}
	

}
