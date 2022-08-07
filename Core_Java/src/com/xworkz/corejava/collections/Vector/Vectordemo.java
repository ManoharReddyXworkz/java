package com.xworkz.corejava.collections.Vector;

import java.util.Enumeration;
import java.util.Vector;

public class Vectordemo {
public static void main(String[] args) {
	
         Vector<Character> vector= new Vector<Character>();
         
         vector.addElement('H');
         vector.addElement('J');
         vector.addElement('K');
         vector.add('L');
         vector.add(3, 'P');
         System.out.println(vector);

         vector .insertElementAt('H', 5);
         System.out.println(vector);
         
         int count= 0;
         Enumeration<Character>  enumeration= vector.elements();
		while(enumeration.hasMoreElements()){
			enumeration.nextElement();
			count++;
         }
         System.out.println("The Number of elements in Vector are:" + count++);
        
}
}
