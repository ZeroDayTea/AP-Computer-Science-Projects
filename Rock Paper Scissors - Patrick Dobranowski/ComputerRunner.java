//� A+ Computer Science  -  www.apluscompsci.com
//vscode is telling me that the character above is non-ascii... what's up with that? (�)
//Computer Runner 
//name - Patrick Dobranowski
//date - 01/25/2021
//Rock Paper Scissors Lab

//Computer Tester / Runner

public class ComputerRunner {
	public static void main(String[] args) {
		// instantiate a new Computer named c
		ComputerDobranowski c = new ComputerDobranowski();
		// call and print out getChoice() //outs random choice
		c.getChoice();
		System.out.println(c); // outs pooter random choice

		// call randomChoice
		c.randomSetChoice();
		System.out.println(c); // outs pooter random choice

		// this code will test didIWin( Player p )
		System.out.println(c.didIWin(new PlayerDobranowski("dude", "rock")));
		System.out.println(c.didIWin(new PlayerDobranowski("dude", "paper")));
		System.out.println(c.didIWin(new PlayerDobranowski("dude", "scissors")));
	}
}
