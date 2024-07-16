package arrays;

import java.util.Iterator;
import java.util.Scanner;

public class MaximumSubArray {
	
	public static int[] maximumSubArray(int[]arr){
		int n1=0;
		int n2=0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]+arr[j]>arr[n1]+arr[n2]) {
					n1=i;
					n2=j;
				}
			}
		}
		return new int[] {arr[n1],arr[n2]};
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the Array");
		int[] arr=new int[sc.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		
		int[] subArray = maximumSubArray(arr);
		System.out.println("the maximum sub Array : "+subArray[0]+" , "+subArray[1]);
	}

}
