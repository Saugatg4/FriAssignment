package com.skillstorm.shape;

public class Rectangle extends Shape{
	private double length;
	private double width;
	
	public Rectangle(double length, double width) {
	
		this.length = length;
		this.width = width;
	}
	
	public double getLength() {
		return length;
	}
	
	public void setLength(double length) {
		this.length = length;
	}
	
	public double getWidth() {
		return width;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public double area() {
		return width * length;
	}
	
	public double perimeter() {
		return 2 * length + 2 * width;
	}
	
	public String toString() {
		return String.format("This is a Rectangle with length %.1f\" and width %.1f\", with an "
				+ "area of %.1f in\u00B2 and a perimeter of %.1f\". %s", length,
				width, area(), perimeter(), super.toString());
	}
	
}


