package Prog_5_3;

import java.util.Arrays;
import java.util.Comparator;

public class StringSort {
	Comparator<String> myComparator;

	public StringSort(
			Comparator<String> myComparator) {
		this.myComparator = myComparator;
	}
	public String[] stringSort(String[] arr) {
		Arrays.sort(arr,myComparator);
		return arr;
	}

	// public String[] stringSort3(String[] arr) {
	// 	Arrays.sort(arr,(o1,o2) -> ascending ? (o1.length() - o2.length())   :
	// 	(o2.length() - o1.length()));
	// }

}


