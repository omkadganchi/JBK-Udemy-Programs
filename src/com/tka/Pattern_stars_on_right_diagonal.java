package com.tka;

import java.util.Scanner;

public class Pattern_stars_on_right_diagonal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = sc.nextInt();
//		
//		for(int i=1; i<=n; i++) {
//			for(int j=1; j<=n-i; j++) {
//				System.out.print("  ");
//			}
//			for(int j=1; j<=i; j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		
		
		
		for(int i=n; i>=1; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
