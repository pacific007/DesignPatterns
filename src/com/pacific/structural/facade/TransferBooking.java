package com.pacific.structural.facade;

public class TransferBooking implements Booking {

	@Override
	public void book() {
		System.out.println("Transfer booked successfully");

	}

}
