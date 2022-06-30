package com.xworkz.corejava.Array;

public class AssinmentsArray {
	

		public static void main(String[]args) {
			char[] az = new char[26];  
			char alp = 'A';
			for (int i=0; i< az.length; i++) {
				 az[i] = alp;
				 alp++;
				 System.out.println(az[i]);

			}
		}
	}

