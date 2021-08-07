package com.corejava;

import java.util.*;

public class PrimenumerDemo {
	
	static int i,m=0,flag=0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter numer: ");
		int n=sc.nextInt();
		if(n==0 || n==1) {
			System.out.println(n+ "numberis not a prime number");
			
		}else {
			for(i=2;i<n;i++) {
				if(n%i==0) {
					System.out.println(n+ "is not a prime number");
					flag=1;
			 
				}

			}
			if(flag==0) {
				System.out.println(n+ "is a prime number");
			}
				
		}
				
	}

}
