package com.xworkz.corejava.Final_keyword.FinalThroughBlocks;

public class FinalWithBlocks {


	final  int X;
	FinalWithBlocks(){
		System.out.println("This is a Default Constructor");
	}
	{
		this.X=17;
		System.out.println("Value of X is:" + X );
	}
}
