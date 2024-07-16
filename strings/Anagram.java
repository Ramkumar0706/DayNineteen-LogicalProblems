package strings;

import java.util.Scanner;

public class Anagram {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the string 1");
		String string1=scanner.nextLine();
		System.out.println("Enter the String 2");
		String string2=scanner.nextLine();
		
		boolean anagram=checkAnagram(string1,string2);
		if(anagram)
			System.out.println("the "+string1+" and "+string2+" are Anagram");
		else 
			System.out.println("the "+string1+" and "+string2+" are not Anagram");
		scanner.close();
	}

	public static boolean checkAnagram(String string1, String string2) {
		if(string1.length()!=string2.length())return false;
		int index=0;
		while(index<string1.length()) {
			if(string1.indexOf(string2.charAt(index))==-1) {
				return false;
			}
			index++;
		}
		return true;
	}

}
