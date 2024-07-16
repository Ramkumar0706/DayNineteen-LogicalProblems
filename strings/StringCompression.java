package strings;

import java.util.Scanner;

public class StringCompression {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the String :");
		String string = scan.next();
		String compression = stringCompression(string);
		System.out.println("the  original String "+string);
		System.out.println("the compression String :"+compression);
		scan.close();
	}

	private static String stringCompression(String string) {
		String compression="";
		char[] cs = string.toCharArray();
		boolean[] br=new boolean[cs.length];
		int in=0;
		while(in<cs.length) {
			if(br[in]==false) {
				int s=in+1;
				int add=1;
				while(s<cs.length) {
					if(cs[in]==cs[s]) {
						br[s]=true;
						add++;
					}
					s++;
				}
				compression=compression+cs[in]+add;
			}
			in++;
		}
		return compression;
	}

}
