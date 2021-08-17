package com.bridgelabz.day1;

import java.util.Scanner;

public class ThreeNames {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); // for user input
		String[] array = new String[3]; // to store the string in array

		System.out.println("Please enter 3 names to sort");

		for (int i = 0; i < array.length; i++) {
			array[i] = s.nextLine();
		}
		s.close();
		System.out.print("Hi" + " ");
		for (int j = array.length - 1; j >= 0; j--) {
			System.out.print(array[j] + " ");

		}

	}
}
