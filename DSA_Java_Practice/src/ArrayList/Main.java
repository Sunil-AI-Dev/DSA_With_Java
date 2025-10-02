package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		ArrayList<Integer> number = new ArrayList<Integer>();
		System.out.println(number); 

		ArrayList<Integer> number1 = new ArrayList<Integer>(Arrays.asList(10,20,30));
		System.out.println(number1);
		
		//TC: O(1)
		//SC: O(1)
		
		//TC: O(1)
		//SC: O(N)
	}
}
