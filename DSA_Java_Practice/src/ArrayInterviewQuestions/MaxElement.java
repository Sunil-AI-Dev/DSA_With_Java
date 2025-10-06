package ArrayInterviewQuestions;

public class MaxElement {
	public static int findMax(int[] arr) {
		if(arr==null || arr.length==0) {
			System.out.println("Array is empty");
		}
		int max = arr[0];
		for(int i=1; i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
		
		//Time complexity: O(n)
		//space complexity: o(1)
		
	}
}
