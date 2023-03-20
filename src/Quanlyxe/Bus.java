package Quanlyxe;

public class Bus extends Vehical{
	double thueTruocBa;
	static final double VAT = 0.1;
	int sokhach;
	
	public Bus(String name, double price,int sokhach) {
		super (name,price);
		
		if (sokhach < 8) {
			double thueTieuThu = price * 0.5;
		} double thueTieuThu = price * 0.3;
		return;
	}
	
	public double TinhTienThue (int sokhach) {
		if (sokhach <5) {
		    double thueVAT = price * 0.1;
		    double thueTruocBa = price * 0.2;
		    double thueTieuThuDacBiet = price * 0.5;
		    return thueVAT + thueTruocBa +thueTieuThuDacBiet;
		} double thueVAT = price * 0.1;
	    double thueTruocBa = price * 0.2;
	    double thueTieuThuDacBiet = price * 0.3;
	    return thueVAT + thueTruocBa + thueTieuThuDacBiet;
}

}
