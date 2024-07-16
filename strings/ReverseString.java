package strings;

import java.util.Scanner;

public class ReverseString {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the String :");
		String string = scan.next();
		String reverseString = reverseString(string);
		System.out.println("the  original String "+string);
		System.out.println("the Reversed String :"+reverseString);
		scan.close();
	}

	private static String reverseString(String string) {
		String reverse="";
		int index=0;
		while(index<string.length()) {
			reverse=string.charAt(index)+reverse;
			index++;
		}
		return reverse;
	}

}
