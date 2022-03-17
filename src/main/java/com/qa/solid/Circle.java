package com.qa.solid;

public class Circle implements Shape {
	
	private int radius;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public double calculateArea() {
		return radius * radius * Math.PI;	
	}
}
