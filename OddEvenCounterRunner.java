
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Patrick Dobranowski
import java.util.Scanner;

public class OddEvenCounterRunner {
   public static void main(String args[]) {
      OddEvenCounterDobranowski test = new OddEvenCounterDobranowski();
      Scanner keyboard = new Scanner(System.in);
      String line = keyboard.nextLine();
      test.setLine(line);
      int evenCount = test.getEvenCount();
      int oddCount = test.getOddCount();

      System.out.println("even count = " + evenCount);
      System.out.println("odd count = " + oddCount);
   }
}