package com.shi.q2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class EmployeeBonus {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Date of joining in dd-MM-yyyy");
		String joinDate = sc.next();
		try {
			LocalDate d1 = LocalDate.parse(joinDate,DateTimeFormatter.ofPattern("dd-MM-yyyy"));
			LocalDate d2 = LocalDate.now();
			Period p = Period.between(d1, d2);
			if(p.getYears()>1) {
				System.out.println("Your Bonus Is" + 5000);
			}
			else if(p.getYears()<=2 && p.getYears()>1) {
				System.out.println("Your Bonus Is" + 8000);
			}
			else if(p.getYears()>2) {
				System.out.println("Your Bonus Is" + 10000);
			}
			else if(p.getYears()<0 || p.getMonths()<0 || p.getDays()<0) {
				System.out.println("Age should not be in the future");
			}
		}
		catch(Exception e) {
			System.out.println("Please pass the data in the correct format");
		}
	}
}
