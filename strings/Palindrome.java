package strings;

import java.util.Scanner;

public class Palindrome {
	
	public static  boolean checkPalindrome(String st) {
		int l=0;
		int r=st.length()-1;
		while(l<r) {
			if(st.charAt(l)!=st.charAt(r))
				return false;
			l++;
			r--;
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the String :");
		String string = scan.next();
		boolean palindrome = checkPalindrome(string);
		if(palindrome)System.out.println("the String "+string+" palindrome");
		else System.out.println("the String "+string+" not palindrome");
		scan.close();
		
		
	}

}
