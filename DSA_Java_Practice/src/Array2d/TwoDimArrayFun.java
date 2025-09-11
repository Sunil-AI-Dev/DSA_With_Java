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
}
