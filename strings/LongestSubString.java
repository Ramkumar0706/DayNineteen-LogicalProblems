package strings;

import java.util.HashSet;
import java.util.Scanner;

public class LongestSubString {
    public static void main(String[] args) {
    	Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the string 1");
		String input=scanner.nextLine();
        int length = lengthOfLongestSubstring(input);
        System.out.println("Length of longest substring without repeating characters: " + length);
        scanner.close();
    }

    public static int lengthOfLongestSubstring(String s) {
    	int maxlength=0;
    	
    	for (int i = 0; i < s.length(); i++) {
    		int substr=1;
    		innerLoop:
    		for (int j = i+1; j < s.length(); j++) {
    			substr++;
    			System.out.println(substr);
    			if(s.charAt(i)==s.charAt(j))
    				break innerLoop;
    			
				
			}
    		if(maxlength<substr)
    			maxlength=substr;
			
		}
    	
      return maxlength;
    }
}

