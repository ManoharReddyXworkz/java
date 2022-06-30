package com.xworkz.corejava.instance_of;

public class InstanceofTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Champakali champakali = new Champakali();
		KajjuBarfi kajjuBarfi = new KajjuBarfi();
		Chocolate chocolate = new Chocolate();

		chocolate.mouth(champakali);
		chocolate.mouth(kajjuBarfi);
		chocolate.mouth(null);
}
}