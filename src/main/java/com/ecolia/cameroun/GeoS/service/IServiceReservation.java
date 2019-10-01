package com.ecolia.cameroun.GeoS.service;


import java.util.List;

import com.ecolia.cameroun.GeoS.entity.Reservation;


public interface IServiceReservation {
	public void CreerReservation(Reservation reserv);
	public void ModifierReservation(Reservation reserv);
	public Reservation getOneReservation(Long idRes);
	public void AnnulerReservation(Long idRes);
	public List <Reservation> AfficherReservations();

}
