package logicalBuildingProblems;

import java.util.Scanner;

public class PrimeNumberChecker {
	
	public static boolean isPrime(int number) {
		if(number==1)
			return false;
		for(int i=2;i<number/2;i++) {
			if(number%i==0)
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int int1 = sc.nextInt();
		boolean prime = isPrime(int1);
		if(prime)
			System.out.println("User Enter number : "+int1+" is prime number");
		else
			System.out.println("User Enter number : "+int1+" is  Not prime number");
		
	}

}
