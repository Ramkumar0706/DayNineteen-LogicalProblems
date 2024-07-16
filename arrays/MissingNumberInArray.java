package arrays;

import java.util.Iterator;
import java.util.Scanner;

public class MissingNumberInArray {
  
	public static int missingNumber(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]+1!=arr[j])
					return arr[i]+1;
			}
		}
		return 0;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int [] a=new int[sc.nextInt()];
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
		int number = missingNumber(a);
		System.out.println("the missing number in the array is : "+number);
		sc.close();
	}
}
