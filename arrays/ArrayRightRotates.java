package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRightRotates {
	
	public static  int[] arrayRightRotates(int[] arr ,int k) {
		int i=0;
		while(i<k) {
			int temp=arr[0];
			for (int j = 1; j < arr.length; j++) {
				int t=arr[j];
				arr[j]=temp;
				temp=t;
				if(j==arr.length-1) {
					arr[0]=t;
				}
			}
			i++;
		}
		return arr;
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the Array");
		int[] arr=new int[sc.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the K value to rotate array");
		int[] rotates = arrayRightRotates(arr, sc.nextInt());
		System.out.println(Arrays.toString(rotates));
	}

}
