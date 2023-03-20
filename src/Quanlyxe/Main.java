package Quanlyxe;

public class Main {

	public static void main(String[] args) {
		Bicycle bicyle = new Bicycle("Xe đạp",100000);
		Moto moto = new Moto("Xe máy",300000);
		Truck truck = new Truck("Xe tải",500000);
		Bus bus = new Bus("Xe bus", 700000, 400000);
		
		System.out.println(bicyle.name + ": không đóng thuế");
	    System.out.println(moto.name + ": giá xe sau khi tính thuế là " + moto.TinhTienThue() + " VNĐ");
	    System.out.println(truck.name + ": thuế VAT " + truck.TinhTienThue() + " VNĐ");
	    System.out.println(bus.name + ": thuế VAT " + bus.TinhTienThue(5) + " VNĐ");
	}

}
