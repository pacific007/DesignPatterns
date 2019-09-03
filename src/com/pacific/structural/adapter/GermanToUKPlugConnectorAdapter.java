package com.pacific.structural.adapter;

class GermanToUKPlugConnectorAdapter implements UKPlugConnector {
	UKPlugConnector plug;

	public GermanToUKPlugConnectorAdapter(UKPlugConnector plug) {
        this.plug = plug;
    }

	@Override
	public void giveElectricity() {
		plug.giveElectricity();

	}

}
