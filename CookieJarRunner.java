//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Patrick Dobranowski

public class CookieJarRunner {
	public static void main(String[] args) {
		CookieJarDobranowski c = new CookieJarDobranowski(3000); // sets capacity to 3000
		System.out.println(c.isFull()); // cookiejar is not full
		c.addStuff(500); // add 500 items

		System.out.println(c.isFull()); // cookiejar is not full
		System.out.println(c.addStuff(2000)); // add 2000 items and return -500
												// -500 indicates 500 items can be added

		System.out.println(c.spaceLeft()); // space left is 500
		System.out.println(c.isFull()); // cookiejar is not full

		System.out.println(c.addStuff(2000)); // attempt to add 2000
												// adds 500 and returns 1500
												// 1500 was amount left
												// that could not be added

		System.out.println(c.spaceLeft()); // no space left � returns 0
		System.out.println(c.isFull()); // returns true
	}
}