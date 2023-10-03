package org.demo;

public class TwoDimensional {

	
	public static void main(String[] args) {
		 int a[][]=new int[2][3];
		 
		 a[0][0]=10;
		 a[0][1]=20;
		 a[0][2]=30;
		 a[1][0]=40;
		 a[1][1]=50;
		 a[1][2]=60;

	
	for (int[] k : a) {
		for (int l : k) {
			System.out.print(l+"\t");
			
			}
		System.out.println();
	}
	
	

	}	
}
