package Array2d;

public class NanoTime {
	public static void performaceNanoTest() {
//		StringBuffer sb = new StringBuffer();
		for(int i = 0; i<=10;i++) {
//			sb.append("Number: ").append(i).append("\n"); //10
			System.out.print(i);
		}
//		System.out.println("Generated "+ sb.length()+" characters");
		System.out.println();
	}
	
	public static void main(String[] args) {
		long startTime =System.nanoTime();
		performaceNanoTest();
		long endTime =System.nanoTime();
		long duration = endTime - startTime;
		System.out.println("Nano sec Time take is: "+duration);
//		System.out.println("Seconds Time take is: "+(duration/1000.0));
	}
}
