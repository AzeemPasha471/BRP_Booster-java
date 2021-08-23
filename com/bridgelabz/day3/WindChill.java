package com.bridgelabz.day3;

import java.util.Scanner;

public class WindChill {
	static void Wind() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter t value");
		double t = sc.nextInt();
		System.out.println("enter v value");
		double v = sc.nextInt();
		double w = (35.74 + 0.6215*t + (0.4275*t - 35.75) * Math.pow(v, 0.16));
		System.out.println("Temperature = " + t);
        System.out.println("Wind speed  = " + v);
        System.out.println("Wind chill  = " + w +" "+"mph");
	}

	public static void main(String[] args) {
	  WindChill.Wind();
	    }
}
