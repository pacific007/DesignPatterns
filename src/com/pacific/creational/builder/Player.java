package com.pacific.creational.builder;

class Player {

	// All final attributes
	private final String playerName; // required
	private final String selectedCar; // required
	private final int coin; // required
	private final String dress; // optional
	private final String music; // optional

	private Player(PlayerBuilder builder) {
		this.playerName = builder.playerName;
		this.selectedCar = builder.selectedCar;
		this.coin = builder.coin;
		this.dress = builder.dress;
		this.music = builder.music;
	}

	public String getPlayerName() {
		return playerName;
	}

	public String getSelectedCar() {
		return selectedCar;
	}

	public int getCoin() {
		return coin;
	}

	public String getDress() {
		return dress;
	}

	public String getMusic() {
		return music;
	}

	@Override
	public String toString() {
		return "Player [playerName=" + playerName + ", selectedCar=" + selectedCar + ", coin=" + coin + ", dress="
				+ dress + ", music=" + music + "]";
	}

	public static class PlayerBuilder {
		private final String playerName; // required
		private final String selectedCar; // required
		private final int coin; // required
		private String dress; // optional
		private String music; // optional

		public PlayerBuilder(String name, String car, int coin) {
			this.playerName = name;
			this.selectedCar = car;
			this.coin = coin;
		}

		public PlayerBuilder dress(String dress) {
			this.dress = dress;
			return this;
		}

		public PlayerBuilder music(String music) {
			this.music = music;
			return this;
		}

		public Player build() {
			Player player = new Player(this);
			return player;
		}
	}

}
