package logicalBuildingProblems;

import java.util.Scanner;
public class AmstrongNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		boolean b=isAmstrong(n);
		if(b) {
			System.out.println("the user enter number is amstrong number");
		}
		else
			System.out.println("the user enter number is not amstrong number");
	}
	private static boolean isAmstrong(int n) {
		int temp=n;
		int sum=0;
		int count=0;
		do {
			count++;
			n=n/10;
		}while(n!=0);
		n=temp;
		while(n!=0)    
		{    
		int r=n%10;    
		int v=ispower(r,count);  
		sum=sum+v;
		n=n/10;    
		}    
		return sum==temp;
	}
	private static int ispower(int r, int count) {
		int sum=1;
		while(count>0) {
			sum=sum*r;
			count--;
		}
		return sum;
	}

}

