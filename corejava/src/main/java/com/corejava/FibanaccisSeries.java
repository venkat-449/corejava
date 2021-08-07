package com.corejava;

import java.util.*;
public class FibanaccisSeries {
	
	//static int n1=0, n2=1, n3=0;
	/*static void fibanacci(int num) {
		
		if(num>0) {
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.println(" " +n3);
			fibanacci(num-1);// with recursion
			
		}
	}
*/
	// with out recursion
	public static void main(String[] args) {
		
		int n1=0, n2=1, n3=0, i;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number :");
		int n=sc.nextInt();
		System.out.println(n1+ " " +n2);
		//fibanacci(n-2);
		
		
		for(i=2;i<n;i++) {
			n3=n1+n2;
			System.out.println(" " +n3);
			n1=n2;
			n2=n3;
		}	
	}

}
