package Class2BigO;

public class SpaceComplex3 {
	public static void totalValue(int n) {
		var total =0;
		for (int i=0 ;i<=n; i++) {
			total +=1;
		}
		if(total >50) {
			System.out.println("Sum is greater than 50");
		}else {
			System.out.println(total);
		}
	}
	public static void main(String[] args) {
		totalValue(60);
	}
}
