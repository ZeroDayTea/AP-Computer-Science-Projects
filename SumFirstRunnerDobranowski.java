//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Patrick Dobranowski
//Date - 03/01/2021

//add imports as needed
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class SumFirstRunnerDobranowski {
	public static void main(String args[]) {
		ListSumFirstDobranowski adder = new ListSumFirstDobranowski();

		ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(-99, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5));
		ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(10, 9, 8, 7, 6, 5, 4, 3, 2, 1, -99));
		ArrayList<Integer> list3 = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40, 50, -11818, 40, 30, 20, 10));
		ArrayList<Integer> list4 = new ArrayList<Integer>(Arrays.asList(32767));
		ArrayList<Integer> list5 = new ArrayList<Integer>(Arrays.asList(255, 255));
		ArrayList<Integer> list6 = new ArrayList<Integer>(Arrays.asList(9, 10, -88, 100, -555, 2));
		ArrayList<Integer> list7 = new ArrayList<Integer>(Arrays.asList(10, 10, 10, 11, 456));

		System.out.println(adder.go(list1));
		System.out.println(adder.go(list2));
		System.out.println(adder.go(list3));
		System.out.println(adder.go(list4));
		System.out.println(adder.go(list5));
		System.out.println(adder.go(list6));
		System.out.println(adder.go(list7));
	}
}