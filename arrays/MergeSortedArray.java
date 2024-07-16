package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSortedArray {
	
	public static int[] mergeArray(int [] arr1,int[] arr2) {
		int[] a=new int[arr1.length+arr2.length];
		int i=0;
		int j=0;
		int c=0;
		while(i<arr1.length&&j<arr2.length) {
			if(arr1[i]<arr2[j]) {
				a[c]=arr1[i];
			i++;
			c++;
			}
			else {
				a[c]=arr2[j];
			j++;
			c++;
			}
			//System.out.println(a[i]);
		}
		
		while(i<arr1.length) {
			a[c]=arr1[i];
			i++;
			c++;
		}
		
		while(i<arr2.length) {
			a[c]=arr2[j];
			j++;
			c++;
		}
		return a;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the Array");
		int[] arr=new int[sc.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter the size of the  2 Array");
		int[] arr1=new int[sc.nextInt()];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr1));
		int[] array = mergeArray(arr, arr1);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
		
		
	}

}
