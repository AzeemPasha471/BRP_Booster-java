package com.bridgelabz.day4;

import java.util.Scanner;

public class HarmonicNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value");
		int n = sc.nextInt();
		
		double sum = 0.0;
		for (int i = 1; i <= n; i++) {
			sum += 1.0 / i;
		}
		System.out.println(sum);
	}
}
