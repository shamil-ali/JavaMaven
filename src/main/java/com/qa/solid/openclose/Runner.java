package com.qa.solid.openclose;

public class Runner {

	public static void main(String[] args) {
		
		Circle c = new Circle();
		c.setRadius(15);
		
		Rectangle r = new Rectangle();
		r.setLength(4);
		r.setWidth(8);
		
		Triangle t = new Triangle();
		t.setBase(10);
		t.setHeight(30);
		
		AreaCalculator ac = new AreaCalculator();
		System.out.println(ac.calculateArea(t));

	}
}
