package com.bridgelabz.day2;

public class SumOfDice {

	public static void main(String[] args) {
		int d1 = (int) (Math.random() * 6 + 1);
		System.out.println(d1);
		int d2 = (int) (Math.random() * 6 + 1);
		System.out.println(d2);
		int sum = d1 + d2;

		System.out.println("sum of dice = " + sum);

	}

}
