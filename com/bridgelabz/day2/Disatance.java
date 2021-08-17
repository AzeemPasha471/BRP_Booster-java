package com.bridgelabz.day2;
import java.util.Scanner;

public class Disatance {

	public static void main(String[] args) {
		int x1, x2 = 0, y1, y2 = 0;
		double distance;
		Scanner sc = new Scanner(System.in);

		System.out.println("enter x1 point");
		x1 = sc.nextInt();
		System.out.println("enter y1 point");
		y1 = sc.nextInt();
		sc.close();
		distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		System.out.println("distance between" + "(" + x1 + "," + y1 + ")," + "(" + x2 + "," + y2 + ")=" + distance);

	}

}
