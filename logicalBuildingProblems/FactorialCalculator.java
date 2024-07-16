package logicalBuildingProblems;

import java.util.Scanner;

public class FactorialCalculator {
	
	public static int isFactorialCalculator(int n) {
		int sum=1;
		for(int i=n;i>0;i--) {
			sum=sum*i;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int int1 = sc.nextInt();
		int num=isFactorialCalculator(int1);
		System.out.println("the Factorial of : "+int1+" is : "+num );
	}

}
