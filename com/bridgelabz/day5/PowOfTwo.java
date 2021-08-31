package com.bridgelabz.day5;

import java.util.Scanner;

public class PowOfTwo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int i = 0, n = sc.nextInt();
		int powerOfTwo = 1;
		while (i <= n) {
			System.out.println("2^"+i + "=" + powerOfTwo);
			powerOfTwo = 2 * powerOfTwo;
			i = i + 1;
		}

	}

}
