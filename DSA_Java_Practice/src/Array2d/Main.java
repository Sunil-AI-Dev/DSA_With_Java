package Array2d;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int [][]  Arr2d;
		Arr2d = new int[2][2];
		Arr2d[0][0]=4;		
		Arr2d[0][1]=6;	
		Arr2d[1][0]=8;	
		Arr2d[1][1]=2;
		//select a specific value
		System.out.println(Arr2d[0][0]);
		// it will show the address
		System.out.println(Arr2d);
		System.out.println(Arrays.deepToString(Arr2d));
		int arr[][] = {{1,2},{3,4}};
		System.out.println(Arrays.deepToString(arr));
		
		//insert value in 2d array
		System.out.println("--------Value insert---------");
		TwoDimArrayFun tdaf = new TwoDimArrayFun();
		tdaf.insertValuInArray(0, 0, 10);
		tdaf.insertValuInArray(0, 1, 20);
		tdaf.insertValuInArray(1, 0, 30);
		tdaf.insertValuInArray(1, 0, 40);
//		tdaf.insertValuInArray(3, 0, 30);
		System.out.println(Arrays.deepToString(tdaf.arr));
	}
}
