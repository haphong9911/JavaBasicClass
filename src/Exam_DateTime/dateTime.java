package Exam_DateTime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class dateTime {
	Scanner sc = new Scanner(System.in);
	
	public void checkDate() {
		System.out.println("Nhập vào ngày tháng năm: ");
		String date = sc.next();
		System.out.println(date);
		
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

		try {
			dateFormat.parse(date);
		} catch (Exception e) {
		 System.out.println("Sai format ngay");
			// TODO: handle exception
		}
	}
	public static void main(String[] args) {
		dateTime date = new dateTime();
		date.checkDate();
		// TODO Auto-generated method stub
		
	}

}
