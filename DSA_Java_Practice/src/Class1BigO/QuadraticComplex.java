package Class1BigO;

public class QuadraticComplex {
	public static void printNumbers(int n) {
//		for(int i=0; i<=n;i++) {
//			for(int j=0;j<=n;j++) {
//				System.out.print(i+" "+j+"  ");
//			}
//			System.out.println();
//		}
		
//		for(int i=0; i<=n;i++) {
//			for(int j=0;j<=n;j++) {
//				for(int k=0;k<=n;k++) {
//					System.out.print(i+" "+j+" "+k+"  ");
//				}
//			}
//			System.out.println();
//		}
		
		for(int i=0; i<=n;i++) {
			for(int j=0;j<=n;j++) {
				System.out.print(i+" "+j+"  ");
			}
			System.out.println();
		}
		for(int j=0;j<=n;j++) {
			System.out.print(j);
		}
	}
	public static void main(String[] args) {
		printNumbers(5);
	}
}
