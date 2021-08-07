package com.corejava;

import java.util.*;

public class FactorialofNumber { 
	
	/*static int factorial(int num) {
		if(num==0) {
			return 1;
		} else {
			return (num*factorial(num-1));
			
		}
	}
	*/
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your number :");
		int a= sc.nextInt();
		int fact=1;
		/*fact=factorial(a);
		System.out.println("factorial of " +a+ "is :" +fact);
		*/
		for(int i=1;i<=a;i++) {
			fact=fact*i;
			
		}
		
		System.out.println("the factoriyal of" +a+ "is :" +fact);
	}
}
