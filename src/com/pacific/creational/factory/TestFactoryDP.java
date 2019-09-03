package com.pacific.creational.factory;

public class TestFactoryDP {

	public static void main(String[] args) {
		Travel travel = TravelFactory.getTravel("bus");
		travel.travel();
		
		Travel flightTravel = TravelFactory.getTravel("flight");
		flightTravel.travel();
		
		Travel invalidTravel = TravelFactory.getTravel("");
		invalidTravel.travel();

	}

}
