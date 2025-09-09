package Array2d;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		//Step 1: Declare
		int [][] int2dArr ;
		
		//Step 2: Instenshiate
		int2dArr = new int[2][2];
		
		//Step 3: initalize value
		int2dArr[0][0]= 1;
		int2dArr[0][1]= 2;
		int2dArr[1][0]= 3;
		int2dArr[1][1]= 4;
		
		System.out.println(Arrays.deepToString(int2dArr));
		
		String S2dArr [][] = {{"a","b"},{"c","d"}};
		System.out.println(Arrays.deepToString(S2dArr));
		
	}
}
