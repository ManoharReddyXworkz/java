package com.xworkz.corejava.object_class_methods.protectedobjectclone;

import java.util.Objects;

public class Soap implements Cloneable {
	String Brand;
	double price;
	String Color;
	
	public Soap (String Brand,double price,String Color) {
		
		this.Brand=Brand;
		this.price=price;
		this.Color=Color;
	}
	
	public Soap clone() throws CloneNotSupportedException {
		Object obj = super.clone();
		Soap soap = (Soap)obj;
		return soap;
	}

	@Override
	public String toString() {
		return "Soap [Brand=" + Brand + ", price=" + price + ", Color=" + Color + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(Brand, Color, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Soap other = (Soap) obj;
		return Objects.equals(Brand, other.Brand) && Objects.equals(Color, other.Color)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price);
	}
	
	
	
	
}
