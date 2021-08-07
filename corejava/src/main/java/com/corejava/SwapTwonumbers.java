package com.corejava;

public class SwapTwonumbers {
	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		//int temp;
		
		//temp=a;
		//a=b;
		//b=temp;
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after swap a:" +a);
		System.out.println("after swap b:" +b);
	}

}
