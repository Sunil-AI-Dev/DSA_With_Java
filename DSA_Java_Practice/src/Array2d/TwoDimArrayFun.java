package Array2d;

public class TwoDimArrayFun {
	int arr[][] = new int[2][2];
	
	public void insertValuInArray(int row, int col, int value) {
		try {
			if(arr[row][col]==0) {
				arr[row][col]=value;
				System.out.println("Value added....");
			}else {
				System.out.println("No space left");
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Index not in 2D array");
		}		
	}
	
	//access the values into array
	public void accessCell(int row, int col) {
		try {
			System.out.println("Value is: "+arr[row][col]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index not good..");
		}
		// time complexity: O(1) 
		// space complexity: O(1)
	}
	
	
	// traverse the array value.
	public void traverse2darry() {
		for(int row = 0; row<arr.length;row++) { //O(m)
			for(int col = 0; col<arr[0].length; col++) {// O(n)
				System.out.print(arr[row][col]+" "); // O(1)
			}
			System.out.println(); // O(1)
		}
		// time complexity: O(mn)
		// space complexity: O(1)
	}
	
	
//	search the elements in 2d Array
	public void searchvalue(int val) {
		for(int row = 0; row<arr.length;row++) { 
			for(int col = 0; col<arr[0].length; col++) {
				if(arr[row][col]==val) {
					System.out.println("Value found at Row: "+row+" Col: "+col);
					return;
				} 
			}
		}
		System.out.println("Value not found....");
		// time complexity: O(mn)
		// space complexity: O(1)
	}
	
//delete the values into a 2dd array
	public void deleteValues2DArray(int row, int col) {
		try {
			System.out.println("Delete completed: "+arr[row][col]);
			arr[row][col] = Integer.MIN_VALUE;
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index not valid.");
		}
		// time complexity: O(1)
		// space complexity: O(1)
	}
	
	
	
}
