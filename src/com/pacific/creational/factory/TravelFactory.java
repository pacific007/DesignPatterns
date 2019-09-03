package com.pacific.creational.factory;

class TravelFactory {

	public static Travel getTravel(String type) {
		Travel travel = null;
		if(type == null || type.trim().isEmpty()) {
			throw new InstantiationError("No valid travel type");
		}

		switch (type) {
			case "bus":
				travel = new BusTravel();
				break;
			case "flight":
				travel = new FlightTravel();
				break;
			default:
				travel = new BusTravel();
				break;
		}
		return travel;
	}
}
