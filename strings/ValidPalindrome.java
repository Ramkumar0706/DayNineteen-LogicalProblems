package strings;

import java.util.Scanner;

public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
       int [] c=new int[128];
       int t=0;
       for(int i=0;i<s.length();i++) {
    	   c[s.charAt(i)]++;
       }
       for (int i = 0; i < c.length; i++) {
		if(c[i]==1) {
			t++;
			if(t==2) {
				return false;
			}
		}
	}
        return true;
    }
    
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.next();
		boolean palindrome = isPalindrome(str);
		if(palindrome)
			System.out.println("The string can be palindrome");
		else
			System.out.println("the String cannot be palindrome");
	}
}
