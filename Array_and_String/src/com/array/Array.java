package com.array;

public class Array {
public static void main(String[] args) {
	int[] array = {2,3,4,5};
	
	int[][] twoDArray = {
			{2,3,4,4},
			{2,4,3,5},
			{7,8,9,7}
	};
	System.out.println("1D Array:");
	for (int i=0; i<array.length;i++) {
		System.out.println(array[i]+"  ");
	}
	System.out.println("\n\n2D Array:");
	for (int i=0; i<twoDArray.length;i++) {
		for (int j= 0; j<twoDArray[i].length;j++) {
			System.out.println(twoDArray[i][j]+"  ");
		}
	}
	System.out.println();
	
}
}
