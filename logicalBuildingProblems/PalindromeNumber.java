package logicalBuildingProblems;

import java.util.Scanner;

public class PalindromeNumber {
	
	public static boolean isPalindrome(int num) {
		int temp=num;
		int sum=0;
		while(temp!=0) {
			int d=temp%10;
			sum=sum*10+d;
			temp=temp/10;
		}
		return sum==num;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int int1 = sc.nextInt();
		boolean b = isPalindrome(int1);
		if(b)
			System.out.println(int1+" is palindrome");
		else
			System.out.println(int1+" is not  palindrome");
	}

}
