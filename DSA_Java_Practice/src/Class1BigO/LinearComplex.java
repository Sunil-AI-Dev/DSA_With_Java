package Class1BigO;

public class LinearComplex {
	public static void displayNumber(int n) {
		for(int i=0; i<=n;i++) {
			System.out.print(i+" "); // O(n)
		}
		for(int i=0; i<=n;i++) {
			System.out.print(i+" "); // O(n)
		}
		
	}
	public static void main(String[] args) {
		displayNumber(10);
	}
}
