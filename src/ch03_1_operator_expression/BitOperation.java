package ch03_1_operator_expression;

import java.util.Scanner;

public class BitOperation {

	public static void main(String[] args) {

		/*
		 * 비트연산자 ( |, &, ^, ~, <<, >>)
		 * 
		 * 
		 * 	
		 * 			  or	 and	xor
		 * 	x	y	 x|y	 x&y	x^y
		 ************************************
		 * 1	1	  1	      1      0
		 * 1	0     1		  0		 1
		 * 0	1     1		  0      1
		 * 0	0     0	 	  0      0
		 * **********************************9
		 * 
		 * 
		 */
		
//		int a = 9;
//		int b = 11;
//		
//		String str = "71";
//		int num = Integer.parseInt(str);
//		
//		1001 -> 9
//		1911 -> 11
//		
//		System.out.println(Integer.toBinaryString(a));
//		System.out.println(Integer.toBinaryString(b));
//		
//		System.out.println("10진수 :" + (a & b));
//		System.out.println("10진수 :" + (a | b));
//		System.out.println("3<<2:" + (3<<2));
		
		Scanner scn = new Scanner(System.in);
		
		System.out.printf("첫 번째 수:");
		double n1 = Double.parseDouble(scn.nextLine());
		
		System.out.printf("두 번째 수: ");
		double n2 = Double.parseDouble(scn.nextLine());
		
		System.out.println("-----------------");
		
		if(n2 !=0.0) {
			System.out.println("결과:"+(n1/n2));
		} else {
			
			System.out.println("결과: 무한대");
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
