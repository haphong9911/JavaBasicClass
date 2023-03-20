package vn.sunasterisk.treemanagement;

import java.util.Scanner;

public class BT2 {
	public static void Baitap1 (){
		int a;
		Scanner sc = new Scanner (System.in);
		System.out.println("Nhập a: ");
		a = sc.nextInt();
		if (a == 0) {
			System.out.println("a là số dương");
			return;
		}
			else {
				if (a % 2 == 0) {
					System.out.println("a là số dương");
				}else {
					if (a % 2 != 0) {
						System.out.println("a là số âm");
					}
				}
			}
	}

	public static void Baitap2() {
		int day;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số ngày = ");
		day = sc.nextInt();
		switch (day) {
		case 1:
			System.out.println("Thứ 2");
			break;
		case 2:
			System.out.println("Thứ 3");
			break;
		case 3:
			System.out.println("Thứ 4");
			break;
		case 4:
			System.out.println("Thứ 5");
			break;
		case 5:
			System.out.println("Thứ 6");
			break;
		case 6:
			System.out.println("Thứ 7");
			break;
		case 7:
			System.out.println("Thứ Chủ nhật");
			break;
		default:
			System.out.println("Data invalid");
			break;
		}
	}

	public static void Baitap3() {
		int point;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số điểm của sinh viên = ");
		point = sc.nextInt();
		if (point >= 0 && point <=49) {
			System.out.println("Sinh viên điểm: F");
		}else if (point >= 50 && point <=59) {
			System.out.println("Sinh viên điểm: D");
		}else if (point >= 60 && point <=69) {
			System.out.println("Sinh viên điểm: C");
		}else if (point >= 70 && point <=79) {
			System.out.println("Sinh viên điểm: B");
		}else if (point >= 80 && point <=100) {
			System.out.println("Sinh viên điểm: A" );
		}
	}
	public static void main(String[] args) {
		BT2.Baitap1();
		BT2.Baitap2();
		BT2.Baitap3();
		// TODO Auto-generated method stub

	}

}
