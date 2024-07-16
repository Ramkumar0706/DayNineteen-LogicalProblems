package logicalBuildingProblems;

import java.util.Scanner;

public class FibonacciSequence {
	
	public static void isFibonacciSeries(int number) {
		int n1=0;
		int n2=1;
		for(int i=1;i<=number;i++) {
			int sum=0;
			if(i==1)
				System.out.println(n1);
			else if(i==2)
				System.out.println(n2);
			else {
				sum=n1+n2;
				System.out.println(sum);
				n1=n2;
				n2=sum;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int int1 = sc.nextInt();
		 isFibonacciSeries(int1);
	}

}
