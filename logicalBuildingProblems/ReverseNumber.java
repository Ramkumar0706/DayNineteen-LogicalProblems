package logicalBuildingProblems;

import java.util.Scanner;

public class ReverseNumber {
	public static int reverse(int num) {
		int temp=num;
		int sum=0;
		while(temp!=0) {
			int d=temp%10;
			sum=sum*10+d;
			temp=temp/10;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int int1 = sc.nextInt();
		int number = reverse(int1);
		System.out.println("the "+int1+" reverse is : "+number);
	}

}
