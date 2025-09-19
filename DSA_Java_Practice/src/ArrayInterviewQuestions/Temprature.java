package ArrayInterviewQuestions;

import java.util.Scanner;

public class Temprature {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How may days of "
				+ "Temp you want to record: ");
		int numDay = sc.nextInt();
		int [] temp = new int[numDay];
		int sum = 0;
		for(int i = 0;i<numDay;i++) {
			System.out.println("Days: "+(i+1)+" high temprature");
			temp[i] = sc.nextInt();
			sum +=temp[i];
		}
		double avg = sum/numDay;
		int above = 0;
		for(int i =0; i<temp.length;i++) {
			if(temp[i]>avg) {
				above++;
			}
		}
		System.out.println();
		System.out.println("Average Temp: "+avg);
		System.out.println(above+" days above average");
		
	}
}
