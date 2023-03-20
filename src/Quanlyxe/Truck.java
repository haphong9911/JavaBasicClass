package Quanlyxe;

public class Truck extends Vehical{
	double thueTruocBa;
	static final double VAT = 0.1;
	
	public Truck(String name, double price) {
		super(name,price);
	}
	
	public double TinhTienThue () {
	    double thueVAT = price * 0.1;
	    double thueTruocBa = price * 0.02;
	    return thueVAT + thueTruocBa;
	}
	
}
