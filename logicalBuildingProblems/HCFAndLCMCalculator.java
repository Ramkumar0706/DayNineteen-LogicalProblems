package logicalBuildingProblems;

import java.util.Scanner;

public class HCFAndLCMCalculator {
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int number1=sc.nextInt();
		System.out.println("Enter the Second Number");
		int number2=sc.nextInt();
		int hcf=findHCF(number1,number2);
		int lcm=findLCM(number1,number2);
		System.out.println("HCF of " + number1 + " and " + number2 + " is: " + hcf);
        System.out.println("LCM of " + number1 + " and " + number2 + " is: " + lcm);
	}

	private static int findLCM(int number1, int number2) {
		int lcm=0;
		for(int i=1;i<number1;i++) {
			if(number1%i==0&&number2%i==0)
				lcm=i;
		}
		return lcm;
	}

	private static int findHCF(int number1, int number2) {
		int hcf=0;
	
		for(int i=1;i<=number1;i++) {
			if(number1%i==0&&number2%i==0)
				if(i>hcf)
				hcf=i;
		}
		return hcf;
	}

}
