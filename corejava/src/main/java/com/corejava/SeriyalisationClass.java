package com.corejava;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
//import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable {
	String name;
	int num;
	public Employee(String name, int num) {
		super();
		this.name = name;
		this.num = num;
	}
	
	
}

public class SeriyalisationClass {

	public static void main(String[] args) {
		// serialiZation --> object to bytecode coversion
		/*Employee e1 = new Employee("venkat",449);
		try{
			FileOutputStream fout = new FileOutputStream("D:\\venkat.ser");
			ObjectOutputStream out = new ObjectOutputStream(fout);
			out.writeObject(e1);
			out.close();
			fout.close();
		} 
		catch (Exception e) {
			e.printStackTrace();
			
		}
		*/
		
		//deserilization --> bytecode to objection conversion
		
		try { 

			FileInputStream fin = new FileInputStream("D:\\venkat.ser");
			ObjectInputStream in = new ObjectInputStream(fin);
			Employee e2 = (Employee)in.readObject();
			in.close();
			fin.close();
			System.out.println(e2.name + " " +e2.num);
		} catch(Exception e) {
			e.printStackTrace();
			
		}
		
		
		
	}
	

}
