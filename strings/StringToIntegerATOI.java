
package strings;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class StringToIntegerATOI {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first String in numbers");
		String strn1 =sc.next();

		int val = Integer.parseInt(strn1);
		System.out.println("String value = " + strn1);
		System.out.println("Integer value = " + val);
		System.out.println("Enter the Second String in letters");
		String strn2 =sc.next();
		try {
			val = Integer.parseInt(strn2);
			System.out.println("String value = " + strn2);
			System.out.println("Integer value = " + val);
		}
		catch (NumberFormatException e) {
			val = 0;
			System.out.println("String value = " + strn2);
			System.out.println("Integer value = " + val);
		}
	}

}
