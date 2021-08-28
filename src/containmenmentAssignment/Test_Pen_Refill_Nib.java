package containmenmentAssignment;

import java.util.Scanner;

public class Test_Pen_Refill_Nib {

	public static void main(String[] args) {

		Nib obj1 = new Nib();
		obj1.setMaterial_type("small");
		obj1.setWidth(4.5f);
		System.out.println(obj1.getMaterial_type());
		System.out.println(obj1.getWidth());

		Refill obj2 = new Refill();
		obj2.setInColor("green");
		obj2.setLength(4);
		obj2.setR(5);
		System.out.println(obj2.getInColor());
		System.out.println(obj2.getLength());

		Pen obj3 = new Pen();
		obj3.setCapLength(5);
		obj3.setBrand("a");
		obj3.setR(obj2);
		System.out.println(obj3.getBrand());
		System.out.println(obj3.getCapLength());
		System.out.println(obj3.getR());

	}

}

