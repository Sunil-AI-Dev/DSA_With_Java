package Class2BigO;

public class AddMul {
//	public static void printNumber(int n){
//		for(int i =0; i<=n; i++) {
//			System.out.print(i+" ");
//		}
//		for(int j =0; j<=n; j++) {
//			System.out.print(j+" ");
//		}
//	}
//	public static void printNumber(int a, int b){
//		for(int i =0; i<=a; i++) {
//			System.out.print(i+" ");
//		}
//		for(int j =0; j<=b; j++) {
//			System.out.print(j+" ");
//		}
//	}
	public static void printNumber(int a, int b){
		for(int i =0; i<=a; i++) {
			for(int j =0; j<=b; j++) {
				System.out.print(i+" "+j+"  ");
			}
		}
	}
	public static void main(String[] args) {
//		printNumber(5);
		printNumber(5, 10);

	}
}
