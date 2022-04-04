package com.task;

public class Array_Practice2 {
public static void main(String[] args) {
	//int a [][]=new int [4][4];
	int a[][]= {{1,5,8,6},{7,2,5,4},{3,6,9,2},{5,7,4,3}};
	
	for(int i=0;i<4;i++) {
		//int total=0;
		for(int j=0;j<4 ;j++) {
			//total=total+a[i][j];
			 System.out.print(a[i][j]+" ");
			
		}System.out.println();
	}
	
		for( int i=0;i<4;i++) {
			int total=0;
			for(int j=0;j<4 ;j++) {
				total=total+a[j][i  ];
				// System.out.println(a[i][j]+" ");
				
			}
		System.out.println();
		System.out.println("sum of row is"+ total);
	}
}
}