package com.tka;

import java.util.Arrays;

public class Ascending_order_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {11, 7, 13, 8, 12, 9};
		
		for(int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[j]<a[i]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("Ascending order array is: ");
		System.out.println(Arrays.toString(a));
	}

}
