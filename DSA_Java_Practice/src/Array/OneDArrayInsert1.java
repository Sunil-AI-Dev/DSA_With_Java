package Array;

import java.util.Arrays;

public class OneDArrayInsert1 {
	int arr[] = null;

	public OneDArrayInsert1(int sizeOfArray) {
		arr = new int[sizeOfArray];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.MIN_VALUE;
		}
	}

	public void insert(int loc, int valueToAdd) {
		try {
			if (arr[loc] == Integer.MIN_VALUE) {
				arr[loc] = valueToAdd;
				System.out.println("Value added...");
			} else {
				System.out.println("Space not present..");
			}
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("index not there");
		}	
	}
}
