package com.bridgelabz.day6;

import java.util.Scanner;

public class RepeatedNum {
	static void Num() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");
		int n = sc.nextInt();

		int[] arr = new int[n];
			System.out.println("Enter the array elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("Duplicate elements in given array: ");
		
		// Searches for duplicate element
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j])
					System.out.print(arr[j] + " ");
			}
		}
	}

	public static void main(String[] args) {
		RepeatedNum.Num();
	}

}
