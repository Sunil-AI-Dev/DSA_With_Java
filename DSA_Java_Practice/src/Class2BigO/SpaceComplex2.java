package Class2BigO;

public class SpaceComplex2 {
	public static int pairSumSeq(int n){
        var total =0;
        for(int i =0;i<=n; i++){
            total = total+ pairSum(i, i+1);
        }
        return total;
    }
    public static int pairSum(int a,int b){
        return  a+b;
    }
    public static void main(String[] args) {
        System.out.println(pairSumSeq(5));
    }
}
