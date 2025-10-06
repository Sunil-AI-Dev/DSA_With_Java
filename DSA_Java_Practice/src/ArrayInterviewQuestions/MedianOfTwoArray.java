package ArrayInterviewQuestions;

public class MedianOfTwoArray {
	public static double findMedianSortedArray(int[] num1, int[] num2) {
		// always perfom the binary serch
		if(num1.length> num2.length) {
			//swap reference
			return findMedianSortedArray(num2, num1);
		}
		int m = num1.length;
		int n = num2.length;
		int totalLeft = (m+n+1)/2; //values in left area
		
		int low = 0, high = m;
		
		//binary search on smallest array
		while(low<=high) {
			// partition value for num 1
			int partitionX = (low+high)/2;
			// partition value for num 2
			int partitionY = totalLeft - partitionX;
			
			int maxLeftX = (partitionX == 0)?
					Integer.MIN_VALUE:num1[partitionX-1];
			int minRightX = (partitionX == m)?
					Integer.MAX_VALUE:num1[partitionX];
			
			int maxLeftY = (partitionY == 0)?
					Integer.MIN_VALUE:num2[partitionY-1];
			int minRightY = (partitionY == n)?
					Integer.MAX_VALUE:num2[partitionY];
			
			// check if we found the corrent position
			if(maxLeftX <= minRightY && maxLeftY <= minRightX) {
				if((m+n)%2==0) {
					return (Math.max(maxLeftX, maxLeftY)+ 
							Math.min(minRightX, minRightY))/2.0;
				}else {
					return Math.max(maxLeftX, maxLeftY);
				}
			}else if(maxLeftX>minRightY) {
				high = partitionX-1;		
			}else{
				low = partitionX+1;
			}
		}
		throw new IllegalArgumentException("Input array not sorted");
	}
	public static void main(String[] args) {
		int [] num1= {1,3};
		int [] num2 = {2};
		System.out.println("Median: "+ findMedianSortedArray(num1, num2));
		
		int [] num3= {1,2};
		int [] num4 = {3,4};
		System.out.println("Median: "+ findMedianSortedArray(num3, num4));
	}
	
	//time complexity = O(log(min(m,n)))
	// Space complexity = O(1)
}
