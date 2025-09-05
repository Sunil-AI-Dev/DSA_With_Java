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

//	insert the value in array
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
	
//	Traverse Array Values
	public void traverseArray() {
		try{
			for(int i =0; i<arr.length;i++) { //o(n)
				System.out.print(arr[i]+" "); //O(1)
			}
		}catch(Exception e) {
			System.out.println("Array is not there"); //O(1)
		}
//		time: O(N)
//		space: O(1)
		
	}
	//Search the value in Array
	public void searchElement(int valueToSearch) {
		for(int i =0;i<arr.length;i++) {
			if(arr[i]==valueToSearch) {
				System.out.println("Found at index: "+i);
				return;
			}
		}	
		System.out.println("Value not found");
	}
//	time: O(n)
//	space: O(1)
	
	
//	delete an element from array
	public void deleteValueArray(int ValueToDeleteIndex) {
		try {
			arr[ValueToDeleteIndex]=Integer.MIN_VALUE;
			System.out.println("Value deleted sucessfully");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Value not present in array");
		}		
	}
//	time: O(1)
//	space: O(1)
	
	
}
