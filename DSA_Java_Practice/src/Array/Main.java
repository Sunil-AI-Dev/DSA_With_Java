package Array;

public class Main {
	public static void main(String[] args) {
		System.out.println("----Insert----");
		OneDArrayInsert1 oda = new OneDArrayInsert1(5);
		oda.insert(0, 5);
		oda.insert(1, 8);
		oda.insert(2, 7);
		oda.insert(3, 4);
		oda.insert(4, 10);
//		oda.insert(5, 3);
		
//		acessing values of array
		System.out.println("---Value access---");
		var initalValue = oda.arr[0];
		System.out.println(initalValue);
		System.out.println(oda.arr[3]);
//		space and time complexity = O(1)
		
//		Traversing the array elements
		System.out.println("---Traverse---");
		oda.traverseArray();
		System.out.println();
		
		System.out.println("---Search value---");
		oda.searchElement(10);
		oda.searchElement(70);

		System.out.println("---Delete value---");
		oda.deleteValueArray(0);
		System.out.println(oda.arr[0]);
		oda.traverseArray();
		
	}
}
