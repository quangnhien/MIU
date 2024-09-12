package Prog_5_3;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) {
		boolean ascending = false;
		//Case 1
		StringSort ss1 = new StringSort(new StringLengthComparator(ascending));
		//Case 2
		StringSort ss2 = new StringSort(new Comparator<String>() {
			public int compare(String o1, String o2) {
				return ascending ? (o1.length() - o2.length())   :
					(o2.length() - o1.length());
			}
		});
		//Case 3
		StringSort ss3 = new StringSort((o1,o2) -> ascending ? (o1.length() - o2.length()):(o2.length() - o1.length()));
		
		String[] testStrings1 = { "andy", "mike", "joe", "allen", "stephan" };
		ss1.stringSort(testStrings1);

		String[] testStrings2 = { "andy", "mike", "joe", "allen", "stephan" };
		ss2.stringSort(testStrings2);

		String[] testStrings3 = { "andy", "mike", "joe", "allen", "stephan" };
		ss3.stringSort(testStrings3);

		System.out.println(Arrays.asList(testStrings1));
		System.out.println(Arrays.asList(testStrings2));
		System.out.println(Arrays.asList(testStrings3));
	}
}
