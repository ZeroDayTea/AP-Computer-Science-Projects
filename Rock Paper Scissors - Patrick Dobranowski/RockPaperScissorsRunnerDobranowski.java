//(c) A+ Computer Science
//www.apluscompsci.com
//name - Patrick Dobranowski
//date - 01/25/2021
//Rock Paper Scissors Lab

//Rock / Paper / Scissors Main Runner

import javax.swing.JFrame;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.TextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;

public class RockPaperScissorsRunnerDobranowski extends JFrame implements ActionListener {
	// width and height of program
	private static final int WIDTH = 400;
	private static final int HEIGHT = 400;

	// this variable is the area to which all text is written
	private JTextArea text;

	// these are the buttons that can be clicked
	private JButton rock;
	private JButton paper;
	private JButton scissors;

	// use these variables to keep track of the players
	private PlayerDobranowski player;
	private ComputerDobranowski pooter;

	// use these variables to keep track of the score
	private int playerWinCount;
	private int pooterWinCount;
	private double winRate;
	private int drawsAmount;
	private String winRateString;

	public RockPaperScissorsRunnerDobranowski() {
		// naming
		super("RockPaperScissors Runner");

		setSize(WIDTH, HEIGHT);

		// initialize all variables - player / pooter and the counts
		player = new PlayerDobranowski("Player");
		pooter = new ComputerDobranowski();

		// this is the panel to which all objects will be added
		JPanel main = new JPanel();

		// use X.AXIS or Y.AXIS
		main.setLayout(new BoxLayout(main, BoxLayout.Y_AXIS));

		// these panels will be used to divide the screen
		JPanel top = new JPanel();

		JPanel bot = new JPanel();
		// change background color of panel with buttons
		bot.setBackground(Color.blue);

		top.setLayout(new BoxLayout(top, BoxLayout.X_AXIS));

		// instantiate a new JTextArea
		text = new JTextArea();
		// java uses a disgusting font automatically so we change it and make it bold
		Font font = new Font("SansSerif", Font.BOLD, 14);
		text.setFont(font.deriveFont(Font.BOLD));
		// change background color of main text area
		// peach like color
		text.setBackground(new Color(255, 229, 180));
		text.setText("WELCOME TO ROCK-PAPER-SCISSORS!!!\n\n" + "Rules:" + "\n"
				+ "1. You get 1 point per win and lose 1 point per loss." + "\n" + "2. Draws are not scored." + "\n\n"
				+ "Computer is ready..." + "\n\n" + "Click Your Choice to Play:");

		// instantiate a new JButton and refer rock to it
		Icon iconRock = new ImageIcon("Rock.png"); // MAKE SURE YOU HAVE IMAGE WITH THIS NAME IN FOLDER... finds image
													// file and assigns it to icon variable
		rock = new JButton(iconRock); // creates button with image rather than text string
		rock.addActionListener(this);
		rock.setActionCommand("rock");

		// instantiate a new JButton and refer paper to it
		Icon iconPaper = new ImageIcon("Paper.png"); // MAKE SURE YOU HAVE IMAGE WITH THIS NAME IN FOLDER... finds image
														// file and assigns it to icon variable
		paper = new JButton(iconPaper); // creates button with image rather than text string
		paper.addActionListener(this);
		paper.setActionCommand("paper");
		// instantiate a new JButton and refer scissors to it
		Icon iconScissors = new ImageIcon("Scissors.png"); // MAKE SURE YOU HAVE IMAGE WITH THIS NAME IN FOLDER... finds
															// image file and assigns it to icon variable
		scissors = new JButton(iconScissors); // creates button with image rather than text string
		scissors.addActionListener(this);
		scissors.setActionCommand("scissors");
		// add all three buttons to the bottom panel
		bot.add(rock);
		bot.add(paper);
		bot.add(scissors);

		// add the text to the top panel
		top.add(text);

		// add both panels to the main panel
		main.add(top);
		main.add(bot);

		// add the main panel to the frame
		getContentPane().add(main);

		setVisible(true);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exiting the program
	}

	public void actionPerformed(ActionEvent e) {
		// instantiate a new Computer and refer pooter to it
		pooter = new ComputerDobranowski();

		// get the String value from the button pressed
		player.setChoice(e.getActionCommand());

		// set screenText to the toString() value of each player reference
		String screenText = "";

		// call the Computer's didIWin(Player p) method to find the winner
		// you must pass in the Player as a parameter to the method
		int result = pooter.didIWin(player);

		// if the result is 0 - draw
		if (result == 0) {
			screenText = screenText + "Computer picked " + pooter.getChoice() + "\n\n" + "DRAW! ";
			drawsAmount++; // amount of draws increases
		}
		// if the result is 1 - pooter wins
		if (result == 1) {
			screenText = screenText + "Computer picked " + pooter.getChoice() + "\n\n" + "Computer Won! ";
			pooterWinCount++; // computer score increases
		}

		// if the results is -1 - player wins
		if (result == -1) {
			screenText = screenText + "Computer picked " + pooter.getChoice() + "\n\n" + "You Won! ";
			playerWinCount++; // player score increases
		}

		// calculate winrate and ensure there is no division by 0 issue
		winRate = (((double) (playerWinCount)) / ((double) (playerWinCount + pooterWinCount)));
		if (playerWinCount == 0) {
			winRate = 0.0;
		}

		// change resulting text field based off if winrate is positive or negative...
		// pos = happy face... neg = sad face
		if (winRate >= 0.5) {
			winRateString = String.format("%.2f", winRate) + "%" + "  (*^▽^*)";
		} else {
			winRateString = String.format("%.2f", winRate) + "%" + "  :(";
		}

		// text that displays result, prompts for new game, shows score, and winrate
		screenText = screenText + "Pick Again Sucka!" + "\n\n" + "Player Wins: " + playerWinCount + "\n\n"
				+ "Computer Wins: " + pooterWinCount + "\n\n" + "Total Score: " + (playerWinCount - pooterWinCount)
				+ "\n\n" + "WinRate: " + winRateString + "\n\n" + "Draws This Game: " + drawsAmount;

		// set the text to the screen using setText( String txt )
		text.setText(screenText);
	}

	public static void main(String args[]) {
		RockPaperScissorsRunnerDobranowski run = new RockPaperScissorsRunnerDobranowski();
	}
}