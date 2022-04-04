package com.task;

public class Matrix {

	public static void main(String[] args) {
		int i, j;
		int a[][] = new int[2][2];
		a[0][0] = 1;
		a[0][1] = 2;
		a[1][0] = 3;
		a[1][1] = 4;

		for (i = 0; i < a.length; i++) {
			for (j = 0; j < a.length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();

		}
		System.out.println();

		int b[][] = new int[2][2];
		b[0][0] = 5;
		b[0][1] = 6;
		b[1][0] = 7;
		b[1][1] = 8;

		for (i = 0; i < b.length; i++) {
			for (j = 0; j < b.length; j++) {
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();

		// int c[][] = new int[2][2];
		for (i = 0; i < a.length; i++) {
			for (j = 0; j < a.length; j++) {
				// c[i][j] = a[i][j] + b[i][j];
				// System.out.print(c[i][j] + " ");
				System.out.print(a[i][j] + b[i][j] + " ");
			}
			System.out.println();
		
		//short method:  
		/*int a[][]= {{1,2},{3,4}};
		int b[][]= {{5,6},{7,8}};
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				System.out.print(a[i][j]+b[i][j]+" ");
			}
			System.out.println();
		}*/
		
		}
	
	
	

	}}
