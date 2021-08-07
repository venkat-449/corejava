

package com.corejava;
import java.lang.String;


public class StringDemo {
	
	public static void main(String[] args) {
		
		String s2 = new String("my worled");
		String s1 = "welcome" ;
		char[] name = {'a','d','e'};
		String s3 = new String(name);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		String s4 = new String("you can not change me");
		String s5 = new String("you can not change me");
		System.out.println(s4==s5);
		
		String s6 = "you can not change me";
		System.out.println(s4==s6);
		
		String s7 = "you can not change me";
		System.out.println(s6==s7);
		
		String s8 = "you can not "+"change me";
		System.out.println(s7==s8);
		
		String s9 = "you can not"; 
		String s = s9 + "change me";
		System.out.println(s==s7);
		
		String st = new String("venkat");
		st.concat("software");
		System.out.println(st);
		
		String str = new String("ramesh");
		String str1 = new String("ramesh");
		System.out.println(str==str1);
		System.out.println(str.equals(str1));
		
		
		StringBuffer sb1 = new StringBuffer("ramesh");
		StringBuffer sb2 = new StringBuffer("ramesh");
		System.out.println(sb1==sb2);
		System.out.println(sb1.equals(sb2));
		
		
		
	}

}
