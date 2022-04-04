package com.task;

public class Array_Practice {

	public static void main(String[] args) {
		int i, j;
		// datatype arrayreference[][]=new datatype[length][length[];
		int a[][] = new int[3][3];
		int row = 0;
		int val = 1;
		while (row < 3) {
			int col = 0;
			while (col < 3) {
				a[row][col] = val;
				val += 1;
				col++;

			}
			row++;
		}

		/*
		 * a[0][0] = 1; a[0][1] = 2; a[0][2] = 3; a[1][0] = 4; a[1][1] = 5; a[1][2] = 6;
		 * a[2][0] = 7; a[2][1] = 8; a[2][2] = 9;
		 * 
		 * a[3][0] = 10; a[3][1] = 11; a[3][2] = 12;
		 */
		
		for (i = 0; i < a.length; i++) {
			int total = 0;
			for (j = 0; j < a.length; j++) {
					total = total + a[i][j];
					System.out.print(a[i][j]+ " ");
					}
			System.out.println();
			System.out.println("Sum of the row: "+ total );
				}
				
			}
	
}
