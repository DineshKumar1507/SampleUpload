package org.demo;

public class OneDimension {
	public static void main(String[] args) {
		int a[]= new int[3];
		a[0]=1;
		a[1]=2;
		a[2]=3;
		
		
	//to find the length of array
	 for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
	}
System.out.println("for each loop is using");

for (int i : a) {
	System.out.println(i);
}
}
}