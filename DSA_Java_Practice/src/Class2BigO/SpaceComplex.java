package Class2BigO;

public class SpaceComplex {
	public static int sumNum(int n) {
		if(n<=0) {
			return 0;
		}
		return n+sumNum(n-1);
	}
	public static void main(String[] args) {
		sumNum(5);
	}
}
