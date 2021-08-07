package com.corejava;

import java.util.*;

public class Countstring {
	public static void main(String[] args) {
		
		
		//*String str = "java developed by mvsr" ;
		//String y[] = str.split(" ");
		//System.out.println(y.length);*//
		
		
		    Scanner sc = new Scanner(System.in);
			System.out.println("enter any string : ");
			String s= sc.nextLine();
			int count;
			char ch;
			HashMap<Character,Integer> hash=new HashMap<Character,Integer>();
			for(int i=0;i<s.length();i++) {
				
			   	ch=s.charAt(i);
			   	//System.out.println(ch);
			   	if(hash.containsKey(ch)) {
			   		count=hash.get(ch);
			   		
			   		count++;
			   		
			   		hash.replace(ch, count);

			   	} else {
			   		hash.put(ch , 1);
			   	}
			}
			for(Character key :hash.keySet()) {				
				System.out.println(key+ " = " +hash.get(key) );
			}
		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	/*		int count = countingwords(s);
			System.out.println(count);
		
	}
		

	private static int countingwords(String s) {

		int count=0;
		if(s.charAt(0)!=' ') {
			count++;
		}
		//for(int i=0;i<s.length();i++) {
			
			//if(s.charAt(i)==' ' && s.charAt(i+1)!=' ') {
				//count++;
				
				
			//}
		//}
		return count;
*/
	}

}
