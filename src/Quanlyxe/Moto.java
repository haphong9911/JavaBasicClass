package Quanlyxe;

public class Moto extends Vehical{
	double thueTruocBa;
	static final double VAT = 0.1;
	double thueSauKhiDong;
	
	public Moto(String name,double price) {
		super(name, price);
	}
	
	public double TinhTienThue () {
	    double thueVAT = price * 0.1;
	    double thueTruocBa = price * 0.05;
	    return thueVAT + thueTruocBa;
	}
	
	public void display_data(){

	}
}
