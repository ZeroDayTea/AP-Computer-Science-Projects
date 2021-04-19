//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Patrick Dobranowski

import java.util.Scanner;
import java.io.IOException;
import java.io.File;

public class AverageRunner {
	public static void main(String args[]) throws IOException {
		Scanner file = new Scanner(new File("average.dat"));
		int count = file.nextInt();
		file.nextLine();
		AverageDobranowski output = new AverageDobranowski();
		for (int i = 0; i < count; i++) {
			String line = file.nextLine();
			output.setLine(line);
			System.out.println(output);
			System.out.print("average = ");
			System.out.printf("%.2f\n", output.getAverage());
		}
	}
}