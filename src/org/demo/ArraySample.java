
package org.demo;

import java.util.ArrayList;
import java.util.List;

public class ArraySample {

	public static void main(String[] args) {
		 int a[][]=new int[2][3];
		 ArraySample.methode1();
		 a[0][0]=10;
		 a[0][1]=20;
		 a[0][2]=30;
		 a[1][0]=40	;
		 a[1][1]=50;
		 a[1][2]=60;
 System.out.println(a[1][1]);
 System.out.println("using for loop");
           for (int i = 0; i < 2; i++) {
			for (int j = 0; j <3; j++) {                         // using for loop
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
           System.out.println("for each loop is using");
for (int[] is : a) {
	for (int i : is) {
		System.out.print(i+" ");
	}
System.out.println();	
}



		
	}
public static void methode1() {
	System.out.println("code recorrect clone code");
}
}
