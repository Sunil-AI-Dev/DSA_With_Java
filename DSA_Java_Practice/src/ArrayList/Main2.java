package ArrayList;

import java.util.ArrayList;

public class Main2 {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(50);
		numbers.add(40);
		numbers.add(30);
		numbers.add(20);
		numbers.add(10);
		numbers.add(60); // -----------O(1)
		numbers.add(2,4); //-----------O(N) TC, SC O(1)
//		numbers.add(7,22);
		System.out.println(numbers);
		ArrayList<String> StrList = new ArrayList<String>();
		StrList.add("A");
		StrList.add("B");
		StrList.add(1,"C");
		System.out.println(StrList);
		
		System.out.println(numbers.get(5));
		System.out.println(numbers.get(0));
		System.out.println(StrList.get(1));
		
		// TC: O(1)
		// SC: O(1) :When no space is requeired in memory
			//O(n)	: when extra space is required	
	}
}
