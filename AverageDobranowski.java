//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Patrick Dobranowski

import java.util.Scanner;

public class AverageDobranowski {
	private String line;

	// write two constructors
	public AverageDobranowski() {
		line = "";
	}

	public AverageDobranowski(String l) {
		line = l;
	}

	// write a setLine method
	public void setLine(String l) {
		line = l;
	}

	private int getLowest() {
		int lowest = Integer.MAX_VALUE;
		Scanner chop = new Scanner(line);
		while (chop.hasNextInt()) {
			int temp = chop.nextInt();
			if (temp < lowest) {
				lowest = temp;
			}
		}

		return lowest;
	}

	public double getAverage() {
		double average = 0.0;
		double count = 0.0;
		Scanner chop = new Scanner(line);
		while (chop.hasNextInt()) {
			average += chop.nextInt();
			count++;
		}
		count--;
		average = (average - getLowest()) / count;
		return average;
	}

	// write a getLine method
	public String getLine() {
		return line;
	}

	// write a toString method
	public String toString() {
		return line;
	}
}