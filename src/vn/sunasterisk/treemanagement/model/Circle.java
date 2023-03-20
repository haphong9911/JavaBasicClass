package vn.sunasterisk.treemanagement.model;

public class Circle extends Shape{
	double pi = 3.14;
	public Circle(double width, double height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}
	
	public double getArea() {
		return Math.PI * getWidth() *getWidth();

	}
	
	public double getPerimeter() {
		return Math.PI * 2 * getWidth();
	}

}
