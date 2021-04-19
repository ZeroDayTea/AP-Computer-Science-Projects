//(c) A+ Computer Science
//www.apluscompsci.com
//name - Patrick Dobranowski
//date - 01/25/2021
//Rock Paper Scissors Lab

//Player class 

public class PlayerDobranowski {
	// instance variables
	private String name;
	private String choice; // choice that the player clicked on in the main runner

	// constructor with only name
	public PlayerDobranowski(String nm) {
		name = nm;
		choice = "";
	}

	// constructor with name and choice of player
	public PlayerDobranowski(String nm, String ch) {
		name = nm;
		choice = ch;
	}

	// change private name String of player
	public void setName(String nm) {
		name = nm;
	}

	// change private choice String of player
	public void setChoice(String ch) {
		choice = ch;
	}

	// returns player choice... used for displaying what player selected
	public String getChoice() {
		return choice;
	}

	// returns player name String
	public String getName() {
		return name;
	}

	// returns name and choice of player
	public String toString() {
		return name + choice;
	}
}