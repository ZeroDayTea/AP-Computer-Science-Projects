//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Patrick Dobranowski
//Date - 02/8/21

public class RayFirstDobranowski {
   public static boolean go(int[] ray) {
      // make a for loop that goes through the entire array and checks if the first
      // int appears again
      int repeated = 0;

      for (int i = 0; i < ray.length; i++) {
         int first = ray[0];
         if (first == ray[i]) {
            repeated++;
         }
      }

      if (repeated >= 2) {
         return true;
      } else {
         return false;
      }
   }
}