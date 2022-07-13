package com.xworkz.corejava.exception.CompileTime;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CompiletimeTimeExceptiondemo {

	public static void main(String[] args) {
		
		try {
			FileReader fd = new FileReader("D:\\Bike1");
			
			BufferedReader br = new BufferedReader(fd);
			System.out.println(br.readLine()); 
			
		}catch(IOException e) {
			e.printStackTrace();
			System.out.println("Exception caught");
		}
			
		
	}
}
