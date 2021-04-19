//(c) A+ Computer Science
//www.apluscompsci.com
//name - Patrick Dobranowski
//date - 01/25/2021
//Rock Paper Scissors Lab

//Player Tester / Runner 

public class PlayerRunner {
	public static void main(String[] args) {
		PlayerDobranowski s = new PlayerDobranowski("Michael Jackson", "rock");

		System.out.println(s.getChoice()); // outs rock
		System.out.println(s.getName()); // outs Michael Jackson
		System.out.println(s); // outs Michael Jackson rock

		s.setChoice("paper"); // sets choice to paper... tests setChoice() method
		System.out.println(s); // outs Michael Jackson paper

		// instantiate a new Player named jb named Jim Bob that chose scissors
		PlayerDobranowski jb = new PlayerDobranowski("Jim Bob", "scissors");
		// print out Jim Bob
		System.out.println(jb);
	}
}
