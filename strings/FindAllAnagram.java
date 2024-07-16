package strings;

import java.util.Arrays;
import java.util.Scanner;

public class FindAllAnagram {

	public static void isAnagram(char[] str,char[] anagram) {
		int n=str.length;
		int m=anagram.length;
		Arrays.sort(anagram);
		for(int i=0;i<=n-m;i++) {
			String temp="";
			for (int j = i; j <m+i; j++) {
				temp=temp+str[j];
			}
			char[] t=temp.toCharArray();
			Arrays.sort(t);
			temp=new String(t);
			if(temp.equals(String.valueOf(anagram)))
				System.out.println("found indexs are :"+i);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the full string");
		String string=sc.next();
		System.out.println("Enter the anagram to find in the String");
		String anagram=sc.next();
		isAnagram(string.toCharArray(), anagram.toCharArray());
		
		//abcdadnsn
		//bcda
	}
}
