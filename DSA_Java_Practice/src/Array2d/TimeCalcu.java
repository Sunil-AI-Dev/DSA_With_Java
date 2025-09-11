package Array2d;

public class TimeCalcu {
	public static void performanceTest() {
		long sum = 0;
		for(int i =0;i<1;i++) {
//			for(int j =0; j<i;j++) {
//				System.out.println(j+" "+i);
//			}
			System.out.print(i);
		}
//		System.out.println("Sum: "+ sum);
		System.out.println();
	}
	public static void main(String[] args) {
		long startTime =System.currentTimeMillis();
		performanceTest();
		long endTime =System.currentTimeMillis();
		long duration = endTime - startTime;
		System.out.println("Milli sec Time take is: "+duration);
		System.out.println("Seconds Time take is: "+(duration/1000.0));
	}
}
