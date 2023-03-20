package vn.sunasterisk.treemanagement.model;

import java.util.IllegalFormatWidthException;

public class Rectangle extends Shape {

	public Rectangle(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}
	public double getArea() {
		return getWidth() * getHeight();
	}
	
	public double getPerimeter() {
		return 2 * (getHeight()+getWidth());
	}
}
