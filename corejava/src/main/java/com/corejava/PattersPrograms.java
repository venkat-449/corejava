package com.corejava;

public class PattersPrograms {
	public static void main(String[] args) {
		int row=4;
		/*for(int i=0;i<=row;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print( "*");
			}
			System.out.println();	
		}
		*/
		
		
		for(int i=0;i<=row;i++) {
			for(int j=row-i;j>=0;j--) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
