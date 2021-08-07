package com.corejava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Laptops {
	public static void main(String[] args) {
		 List<ComparableTopic> laps = new ArrayList<>();
		 laps.add(new ComparableTopic("dell",16,40000));
		 laps.add(new ComparableTopic("samsung",32,50000));
		 laps.add(new ComparableTopic("lenova",8,60000));
		 
		 //anonymous clss using
		 
		 Comparator<ComparableTopic> com = new Comparator<ComparableTopic>() 
		 {
			 public int compare(ComparableTopic l1, ComparableTopic l2) {//2 parameters must be taken
				 if(l1.getPrice()>l2.getPrice()) {
					 return 1;
					 
				 } else {
					 return -1;
				 }
				 
			 }
		 };
		 
		 Collections.sort(laps, com);
		 
		 for(ComparableTopic l:laps) {
			 System.out.println(l);
			 
		 }		 
	}

}
