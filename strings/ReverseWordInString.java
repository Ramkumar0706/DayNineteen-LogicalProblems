package strings;

import java.util.Scanner;

public class ReverseWordInString {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the String Sentence");
		String st=sc.nextLine();
		String reverseWord=isReverse(st);
		System.out.println(reverseWord);
		
	}

	private static String isReverse(String st) {
		String reverse="";
		char[] ch=st.toCharArray();
		for(int i=ch.length-1;i>=0;i--) {
			int k=i;
			while(i>=0&&ch[i]!=' ') {
				i--;
			}
			int j=i+1;
			while(j<=k) {
				reverse=reverse+ch[j];
				j++;
			}
			reverse=reverse+' ';
		}
		return reverse;
	}
}
