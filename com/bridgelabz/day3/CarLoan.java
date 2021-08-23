package com.bridgelabz.day3;

import java.util.Scanner;

public class CarLoan {

	static void Loan() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter principal value");
		double principal = sc.nextInt();
		System.out.println("enter  years value");
		double years = sc.nextInt();
		System.out.println("enter rate value");
		double rate = sc.nextInt();
		sc.close();
		double r = (rate / 100) / 12; // monthly interest rate
		double n = 12 * years; // number of months

		double payment = (principal * r) / (1 - Math.pow(1 + r, -n));
		double interest = payment * n - principal;

		System.out.println("Monthly payments = " + payment);
		System.out.println("Total interest   = " + interest);
	}

	public static void main(String[] args) {

		CarLoan.Loan();

	}

}
