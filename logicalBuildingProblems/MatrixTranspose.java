package logicalBuildingProblems;

import java.util.Scanner;

public class MatrixTranspose {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter row");
		int r=sc.nextInt();
		System.out.println("enter col");
		int c=sc.nextInt();
		int[][] mat=readMat(r,c);
		System.out.println("matrix before transpose");
		displayMat(mat);
		int[][]re=isTranspose(mat,r,c);
		System.out.println("after transpose");
	      displayMat(re);
		
	}
	
	public static void displayMat(int[][] mat) {
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				System.out.print(mat[i][j]+" ");
		}
			System.out.println();
	}
		}

	static int[][] readMat(int row,int col){
		
		Scanner sc=new Scanner(System.in);
		int[] mat[]=new  int[row][col];
		System.out.println("enter the"+row*col+" values");
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				
				mat[i][j]=sc.nextInt();
			}
		}
		return mat;
		}
	static int[][] isTranspose(int[][] mat,int r,int c){
		int[][] temp=new int[c][r];
		for(int i=0;i<temp.length;i++) {
			for(int j=0;j<temp[i].length;j++) {
				temp[i][j]=mat[j][i];
			}
		}
		return temp;
			}
	}
