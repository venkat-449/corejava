package com.corejava;

import java.lang.Math;
import java.util.*;


public class ArmstrongNumber {
	/*public static void main(String[] args) {
		int r,temp, sum=0;
		int n=153;
		temp = n; 
		while(n>0) {
			r=n%10;
			sum=sum+(r*r*r);
			n=n/10;
		}
		if(temp==sum) {
			System.out.println("it is a armstrong number");
		}else {
			System.out.println("it is not a armstrong number");
		}
	}
	*/
	
	
	static boolean isArmstrong(int n) {
		int temp,sum=0,digits=0,last=0;
		temp=n;
		while(temp>0) {
			temp=temp/10;
			digits++;
		
		}
		temp=n;
		while(temp>0) {
			last=temp%10;
			sum+=(Math.pow(last,digits));
			temp=temp/10;
		
		}
		if(n==sum) {
			return true;
		}else {
			return false;
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of armstrong numbers :");
		int num=sc.nextInt();
		for(int i=1;i<num;i++) {
		if(isArmstrong(i)) 
		System.out.print(i+ ",");
				
			
		}
		
		
	}

}

