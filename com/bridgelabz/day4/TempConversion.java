package com.bridgelabz.day4;

import java.util.Scanner;

public class TempConversion {
	
	static void convertion() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the temperature");
		 double fahrenheit = sc.nextDouble();
	        
	        double celsius  = ( 5.0 * (fahrenheit - 32.0) ) / 9.0;
	        
	        System.out.println(fahrenheit + " F is in degree celsius " + celsius + " C.");
	    
	}
	public static void main(String[] args) {

	 TempConversion.convertion();
	}

}
