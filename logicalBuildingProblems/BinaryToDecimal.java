package logicalBuildingProblems;

import java.util.Scanner;

public class BinaryToDecimal {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number in decimal value");
		int dec=sc.nextInt();
		int mul=1;
		int sum=0;
		while(dec!=0) {
			int d=dec%10;
			sum=sum+d*mul;
			mul*=2;
			dec=dec/10;
		}
		System.out.println(sum);
	}

}
