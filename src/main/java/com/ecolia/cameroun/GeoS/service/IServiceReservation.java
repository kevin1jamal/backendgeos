package com.ecolia.cameroun.GeoS.service;


import com.ecolia.cameroun.GeoS.entity.Reservation;


public interface IServiceReservation {
	public void CreerReservation(Reservation reserv);
	public void ModifierReservation(Reservation reserv);
	public Reservation getOneReservation(Long idRes);
	public void AnnulerReservation(Long idRes);
	

}
