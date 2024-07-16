package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveDuplicate {
	
	public static int[] removeDuplicate(int[] arr) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		int in=0;
		for (int i = 1; i < arr.length; i++) {
			if(arr[in]!=arr[i]) {
				al.add(arr[in]);
			}
			if(arr.length-1==i && arr[in]!=arr[i]) {
				al.add(arr[i]);
			}
			in=i;
		}
		int[] array=new int[al.size()];
		for (int i = 0; i < array.length; i++) {
			array[i]=al.get(i);
		}
		return array;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the Array");
		int[] arr=new int[sc.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("After remove duplicate elements");
		int[] array = removeDuplicate(arr);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]+" ");
		}
		sc.close();
	}
	

}
