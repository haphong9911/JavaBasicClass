package HinhHoc;

public class ShapeStore {

	public static void main(String[] args) {
		Shape circle1 = new Circle();
		circle1.draw();
		circle1.getArea();
		
		Shape rectangle = new Rectangle();
		rectangle.draw();
		rectangle.getArea();
	}

}
