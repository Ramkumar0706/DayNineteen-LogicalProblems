package arrays;

import java.util.HashSet;

public class ValidSudoku {
	
	public static boolean notInRow(char arr[][], int row) {
        HashSet<Character> st = new HashSet<>();
 
        for (int i = 0; i < 9; i++) {
            if (st.contains(arr[row][i]))
                return false;
            if (arr[row][i] != '.')
                st.add(arr[row][i]);
        }
        return true;
    }
 
    public static boolean notInCol(char arr[][], int col){
       
    	HashSet<Character> st = new HashSet<>();
 
        for (int i = 0; i < 9; i++) {
 
           
            if (st.contains(arr[i][col]))
                return false;
            if (arr[i][col] != '.')
                st.add(arr[i][col]);
        }
        return true;
    }
 
    public static boolean notInBox(char arr[][], int startRow, int startCol) {
       
    	HashSet<Character> st = new HashSet<>();
 
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                char curr= arr[row + startRow][col + startCol];
 
                if (st.contains(curr))
                    return false;
 
                if (curr != '.')
                    st.add(curr);
            }
        }
        return true;
    }
 
    
    public static boolean isValid(char arr[][], int row,int col){
        return notInRow(arr, row) && notInCol(arr, col)
            && notInBox(arr, row - row % 3, col - col % 3);
    }
 
    public static boolean isValidBoard(char arr[][], int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!isValid(arr, i, j))
                    return false;
            }
        }
        return true;
    }
	
	public static void main(String[] args) {
		char[][] board = new char[][] {
            {'5','3','.','.','7','.','.','.','.'},
            {'6','.','.','1','9','5','.','.','.'},
            {'.','9','8','.','.','.','.','6','.'},
            {'8','.','.','.','6','.','.','.','3'},
            {'4','.','.','8','.','3','.','.','1'},
            {'7','.','.','.','2','.','.','.','6'},
            {'.','6','.','.','.','.','2','8','.'},
            {'.','.','.','4','1','9','.','.','5'},
            {'.','.','.','.','8','.','.','7','9'}
        };
        if(isValidBoard(board,9)) {
        	System.out.println("The Board is valid");
        }
        else
        	System.out.println("The board is not valid");
        System.out.println(3-3%3);
	}
	

}
