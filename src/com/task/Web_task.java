package com.task;

public class Web_task {

	public static void main(String[] args) {
		int a[] = { 11, 12, 13, 14, 15, 16 };
		System.out.println("Using for Loop: ");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println("using enhanced for loop :");
		for (int i : a) {
			System.out.println(i);
		}
	}
}
 