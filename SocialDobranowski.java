import java.util.Scanner;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Patrick Dobranowski

public class SocialDobranowski {
	private String socialNum;

	public SocialDobranowski() {
		socialNum = "";
	}

	public SocialDobranowski(String soc) {
		socialNum = soc;
	}

	public void setSocial(String soc) {
		socialNum = soc;
	}

	public int getSum() {
		Scanner chop = new Scanner(socialNum);
		chop.useDelimiter("-");
		int sum = 0;
		while (chop.hasNextInt()) {
			sum += chop.nextInt();
		}
		return sum;
	}

	public String toString() {
		return "SS# is " + socialNum + " has a sum of " + getSum();
	}
}