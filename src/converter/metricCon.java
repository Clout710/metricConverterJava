package converter;

import java.util.Scanner;

public class metricCon {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		char option = '\0';

		System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=");
		System.out.println("\n");
		System.out.println("Welcome to CES's Metric converter");
		System.out.println("\n");

		do {
			
			double feet;
			double meters;
			double pound;
			double kg;
			double fah;
			double cal;

			System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=");
			System.out.println("\n");
			System.out.println("Which Conversion would you like to make?");
			System.out.println("======================================================================");
			System.out.println("1. From Feet to Meters");
			System.out.println("2. From Pounds to Kgs");
			System.out.println("3. From Fahrenheit to Celsuis");
			System.out.println("\n");
			System.out.println("4.Exit");
			System.out.println("======================================================================");
			option = scan.next().charAt(0);

			switch (option) {
			case '1':
				System.out.println("-------------------------------------------------------");
				System.out.println("From Feet to Meters");
				System.out.println("-------------------------------------------------------");
				System.out.print("Please Enter The Amount:  ");
				feet = scan.nextDouble();
				meters = feet * 0.308;
				System.out.println("\n");
				System.out.println(feet + " ft = " + meters + " m");
				break;

			case '2':
				System.out.println("-------------------------------------------------------");
				System.out.println("From Pounds to Kgs");
				System.out.println("-------------------------------------------------------");
				System.out.println("Please Enter The Amount:  ");
				pound = scan.nextDouble();
				kg = pound / 2.205;

				System.out.println(pound + " lbs = " + kg + "kg");
				break;

			case '3':
				System.out.println("-------------------------------------------------------");
				System.out.println("From Faharenheit to Celsius");
				fah = scan.nextDouble();
				cal = (fah - 32) * 5 / 9;
				System.out.println(fah + " °F =" + cal + " °C");
				break;

			case '4':
				System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");

			}
		} while (option != '4');
		System.out.println("Thanks for using CES's Metric Converter :( ");

	}

}
