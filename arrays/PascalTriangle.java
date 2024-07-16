package arrays;

import java.util.Scanner;

public class PascalTriangle {
	public static void pascal(int n) {
		for(int i=0;i<n;i++) {
			int value=1;
			for (int j = 1; j <=n-i; j++) {
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++) {
				System.out.print(value + " ");
                value = value * (i - k) / (k + 1);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		pascal(sc.nextInt());
	}
}
