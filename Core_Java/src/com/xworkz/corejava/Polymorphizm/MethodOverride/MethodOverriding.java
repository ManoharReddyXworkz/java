package com.xworkz.corejava.Polymorphizm.MethodOverride;

public class MethodOverriding {

	public static void main(String[] args) {

		BankRbi br = new BankRbi();
		SC sc = new SC();
		Hdfc hf = new Hdfc();
		
		br.InterestRate();
		sc.InterestRate();
		hf.InterestRate();
		
		
		
	}

}
