package com.bridgelabz.day3;

import java.util.Scanner;

public class DayOfWeek {
	
	static void Week() {
		Scanner sc = new Scanner(System.in);
		int d;
		int m;
		int y;

		System.out.println("day: ");
		d = sc.nextInt();
		System.out.println("month: ");
		m = sc.nextInt();
		System.out.println("year: ");
		y = sc.nextInt();
		sc.close();
		int y0 = y - (14 - m) / 12;
		int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
		int m0 = m + 12 * ((14 - m) / 12) - 2;
		int d0 = (d + x + (31 * m0) / 12) % 7;

		System.out.println(d0 + " ");
		switch (d0) {

		case 1:
			System.out.println("monday");
			break;

		case 2:
			System.out.println("Tuesday");
			break;

		case 3:
			System.out.println("Wednesday");
			break;

		case 4:
			System.out.println("thurasday");
			break;
		case 5:
			System.out.println("friday");
			break;
		case 6:
			System.out.println("saturday");
			break;
		case 7:
			System.out.println("sunday");
			break;

		default:
			break;

		}

	}

	public static void main(String[] args) {
		DayOfWeek.Week();
	}
	}

