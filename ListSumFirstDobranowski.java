//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Patrick Dobranowski
//Date - 03/01/2021

import java.util.List;
import java.util.ArrayList;

public class ListSumFirstDobranowski {
	public static int go(List<Integer> ray) {
		int count = 0;
		int first = ray.get(0);
		for (Integer var : ray) {
			if (var > first) {
				count += var;
			}
		}
		if (count > 0) {
			return count;
		} else {
			return -1;
		}
	}
}