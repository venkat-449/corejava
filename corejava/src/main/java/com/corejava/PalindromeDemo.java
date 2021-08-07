package com.corejava;

import java.util.*;

public class PalindromeDemo {
	/*public static void main(String[] args) {
		int temp,sum=0,r ;
		int n =5656;
		temp=n;
		while(n>0) {
		 r=n%10;
		 sum=(sum*10)+r;
		 n=n/10;
		}
		if(temp==sum) {
			System.out.println(sum+ "is a palindrome");
		
		}else {
			System.out.println(sum + "is not a palindrome");
			
		}
	}
	*/

	public static void main(String[] args) {
		String original ,reverse="";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter nstring/number to check if it is a palindrome :");
		original = sc.nextLine();
		int length=original.length();
		for(int i=length-1;i>=0;i--) {
			reverse=reverse + original.charAt(i);
			if(original.equals(reverse)) {
				System.out.println("entered string/number is a palindrome");
			} else {
				System.out.println("entered string/number is not a palindrome");
			}
			
		}
	}
}
