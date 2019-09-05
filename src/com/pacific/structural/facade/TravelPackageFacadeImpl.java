package com.pacific.structural.facade;

public class TravelPackageFacadeImpl implements TravelPackageFacade {

	@Override
	public void bookPackage() {
		Booking trasferBooking = new TransferBooking();
		trasferBooking.book();

		Booking hotelBooking = new HotelBooking();
		hotelBooking.book();

		Booking flightBooking = new FlightBooking();
		flightBooking.book();

		System.out.println("Travel package booked successfully");

	}

}
