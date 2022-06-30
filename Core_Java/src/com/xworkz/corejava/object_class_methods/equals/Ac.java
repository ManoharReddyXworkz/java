package com.xworkz.corejava.object_class_methods.equals;

import java.util.Objects;

public class Ac {
	String brand;
    String colour;
    double price;
    
    public Ac(String brand,String colour,double price ) {
    	
    }

	@Override
	public int hashCode() {
		return Objects.hash(brand, colour, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ac other = (Ac) obj;
		return Objects.equals(brand, other.brand) && Objects.equals(colour, other.colour)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price);
	}
       }

