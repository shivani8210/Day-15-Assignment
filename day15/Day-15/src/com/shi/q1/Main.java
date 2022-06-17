package com.shi.q1;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Date of birth in dd-MM-yyyy pattern");
		String dob = sc.next();
		try {
			LocalDate d1 = LocalDate.parse(dob,DateTimeFormatter.ofPattern("dd-MM-yyyy"));
			LocalDate d2 = LocalDate.now();
			Period p = Period.between(d1, d2);
			System.out.println(p.getYears());
			if(p.getYears()<0 || p.getMonths()<0 || p.getDays()<0) {
				System.out.println("Date should not be in Future");
			}
		}
		catch(Exception e) {
			System.out.println("InvalidDateFormat");
		}
	}

}
