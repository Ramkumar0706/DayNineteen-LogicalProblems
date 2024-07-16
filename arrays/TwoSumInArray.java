package arrays;

import java.util.Scanner;

public class TwoSumInArray {
	
	public static int[] addTwoSum(int[] arr,int target) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(arr[i]+arr[j]==target) {
					return new int[] {arr[i],arr[j]};
				}
			}
		}
		throw new RuntimeException("No element is found");
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the Array");
		int[] arr=new int[sc.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter to search the target number");
		int[] result = addTwoSum(arr, sc.nextInt());
		System.out.println("Indices: " + result[0] + ", " + result[1]);
		sc.close();
	}

}
