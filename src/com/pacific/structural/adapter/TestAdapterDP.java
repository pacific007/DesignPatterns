package com.pacific.structural.adapter;

public class TestAdapterDP {

	public static void main(String[] args) {
		GermanElectricalSocket socket = new GermanElectricalSocket();
		socket.plugIn(new GermanPlugConnector() {

			@Override
			public void giveElectricity() {
				System.out.println("Charging with german plug connector in german socket.");

			}
		});
		
		UKElectricSocket ukSocket = new UKElectricSocket();
		ukSocket.plugIn(new UKPlugConnector() {
			
			@Override
			public void giveElectricity() {
				System.out.println("Charging with UK Plug connector in UK socket.");
				
			}
		});
		
		GermanToUKPlugConnectorAdapter adapter = new GermanToUKPlugConnectorAdapter(new UKPlugConnector() {
			
			@Override
			public void giveElectricity() {
				System.out.println("Charging from UK plug connector in german");
				
			}
		});
		adapter.giveElectricity();

	}

}
