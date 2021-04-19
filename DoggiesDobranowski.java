//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Patrick Dobranowski
//Date - 02/16/2021

import java.util.Arrays;

public class DoggiesDobranowski {
   private DogDobranowski[] pups;

   public DoggiesDobranowski(int size) {
      // point pups at a new arry of Dog
      pups = new DogDobranowski[size];
   }

   public void set(int spot, int age, String name) {
      // put a new Dog in the array at spot
      // make sure spot is in bounds
      if (spot < pups.length)
         pups[spot] = new DogDobranowski(age, name);
   }

   public String getNameOfOldest() {

      String nameOfOldest = "";
      int oldestAge = Integer.MIN_VALUE;
      for (DogDobranowski d : pups) {
         if (d.getAge() > oldestAge) {
            oldestAge = d.getAge();
            nameOfOldest = d.getName();
         }
      }
      return nameOfOldest;
   }

   public String getNameOfYoungest() {

      String nameOfYoungest = "";
      int youngestAge = Integer.MAX_VALUE;
      for (DogDobranowski d : pups) {
         if (d.getAge() < youngestAge) {
            youngestAge = d.getAge();
            nameOfYoungest = d.getName();
         }
      }

      return nameOfYoungest;
   }

   public String toString() {
      return "" + Arrays.toString(pups);
   }
}