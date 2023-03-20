package vn.sunasterisk.treemanagement.model;


public class Main {

    public static void main(String[] args) {
//        Flower flower1 = new Flower("hoa hong", "mau do");
//        Tree tree1 = new Tree("cay hong", 1.2, flower1);
//        System.out.println("Khoi tao: " + tree1.displayInformation());
//        tree1.changeName("Cay hoa hong");
//        System.out.println("Change Name: " + tree1.displayInformation());
//        tree1.changeHeight(1.3);
//        System.out.println("Change height: " + tree1.displayInformation());
//        Flower flower2 = new Flower("hoa hong", "mau trang");
//        tree1.changeFlower(flower2);
//        System.out.println("Change Flower: " + tree1.displayInformation());
    	Rectangle rectangle = new Rectangle(10,3);
    	System.out.println("Diện tích hình chữ nhật" + rectangle.getArea());
    	System.out.println("Chu vi hình chữ nhật" + rectangle.getPerimeter());
    	
    	Circle circle = new Circle(2.5,7.0);
    	System.out.println("Diện tích hình tròn " + circle.getArea());
    	System.out.println("Chu vi hình tròn " + circle.getPerimeter());

    }
}
