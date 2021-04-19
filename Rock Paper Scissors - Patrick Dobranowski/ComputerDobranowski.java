//(c) A+ Computer Science 
//www.apluscompsci.com
//name - Patrick Dobranowski
//date - 01/25/2021
//Rock Paper Scissors Lab

//Computer class 

public class ComputerDobranowski {
	// instance / member variables
	private String choice;

	public ComputerDobranowski() {
		// call random set Choice
		randomSetChoice();
	}

	// returns choice of the computer which was decided in constructor
	public String getChoice() {
		return choice;
	}

	public void randomSetChoice() {
		// use Math.random()
		// use switch case
		int random = (int) (Math.random() * 3);
		switch (random) { // switch that assigns values from RNG to choice string to be compared with
							// player
			case 0:
				choice = "rock";
				break;
			case 1:
				choice = "paper";
				break;
			case 2:
				choice = "scissors";
				break;
		}
	}

	/*
	 * didIWin(Player p) will return the following values 0 - both players have the
	 * same choice 1 - the computer had the higher ranking choice -1 - the player
	 * had the higher ranking choice
	 */
	public int didIWin(PlayerDobranowski p) {
		if (getChoice().equals(p.getChoice())) { // DRAW
			return 0;
		}
		if (getChoice().equals("paper") && p.getChoice().equals("rock")) { // COMPUTER WIN
			return 1;
		}
		if (getChoice().equals("scissors") && p.getChoice().equals("paper")) { // COMPUTER WIN
			return 1;
		}
		if (getChoice().equals("rock") && p.getChoice().equals("scissors")) { // COMPUTER WIN
			return 1;
		}
		return -1; // if there was no DRAW and no COMPUTER WIN then player wins
	}

	// returns choice of computer in sentence format
	public String toString() {
		return "Computer chose " + getChoice();
	}
}