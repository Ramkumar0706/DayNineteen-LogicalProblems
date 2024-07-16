package strings;

import java.util.Scanner;

public class CountWord {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Sentence :");
		String string = scanner.nextLine();
		int countWord=countWord(string);
		System.out.println(countWord+" words present in the word");
		scanner.close();
	}

	private static int countWord(String string) {
		
		String[] split = string.split(" ");
		int i=0;
		int count =0;
		while(i<split.length) {
			if(!split[i].isEmpty())
				count++;
			i++;
		}
		return count;
		
	}

}
