//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Patrick Dobranowski

import java.util.Scanner;

public class OddEvenCounterDobranowski {
	private String line;

	public OddEvenCounterDobranowski() {
		setLine("");
	}

	public OddEvenCounterDobranowski(String s) {
		line = s;
	}

	public void setLine(String s) {
		line = s;
	}

	public int getEvenCount() {
		int count = 0;
		Scanner chop = new Scanner(line);
		while (chop.hasNextInt()) {
			if (chop.nextInt() % 2 == 0) {
				count++;
			}
		}
		return count;
	}

	public int getOddCount() {
		int count = 0;
		Scanner chop = new Scanner(line);
		while (chop.hasNextInt()) {
			if (chop.nextInt() % 2 != 0) {
				count++;
			}
		}
		return count;
	}

	public String toString() {
		return line;
	}
}