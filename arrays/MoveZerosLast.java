package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MoveZerosLast {
	public static int[] moveZerosLast(int[] arr) {
		int l=0;
		int h=arr.length-1;
		while(l<h) {

			if(arr[h]==0) {
				h--;
			}
			else if(arr[l]==0) {
				int temp=arr[l];
				arr[l]=arr[h];
				arr[h]=temp;
				l++;
				h--;
			}
			else {
				l++;
				System.out.println("ee");
			}
			System.out.println("d");
		}
		return arr;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size ot the Array");
		int [] a=new int[sc.nextInt()];
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}

		int[] last = moveZerosLast(a);
		System.out.println(Arrays.toString(last));

	}

}
