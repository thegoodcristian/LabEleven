package com.labEleven;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Validator {
	public static String getString(Scanner sc, String prompt) {
		System.out.print(prompt);
		String s = sc.nextLine(); // read user entry
		return s;

	}

	public static int getNumOfCars(Scanner sc, String prompt) {
		int i = 0;
		boolean isValid = false;
		while (isValid == false) {
			System.out.print(prompt);
			if (sc.hasNextInt()) {
				i = sc.nextInt();
				if (i > 0) {
					isValid = true;
				} else {
					System.out.println("Error! Must be a positive integer value. Try again.");
				}
			} else {
				System.out.println("Error! Must be a positive integer value. Try again.");
			}
			sc.nextLine(); // discard any other data entered on the line
		}
		return i;
	}

	public static int getInt(Scanner sc, String prompt) {
		int i = 0;
		boolean isValid = false;
		while (isValid == false) {
			System.out.print(prompt);
			if (sc.hasNextInt()) {
				i = sc.nextInt();
				if (i > 1907 && i < 2020) {
					isValid = true;
				} else {
					System.out.println("Error! Must be a model year between 1908-2019. Try again.");
				}
			} else {
				System.out.println("Error! Must be a model year between 1908-2019. Try again.");
			}
			sc.nextLine(); // discard any other data entered on the line
		}
		return i;
	}

	public static int getInt(Scanner sc, String prompt, int min, int max) {
		int i = 0;
		boolean isValid = false;
		while (isValid == false) {
			i = getInt(sc, prompt);
			if (i < min)
				System.out.println("Error! Number must be " + min + " or greater.");
			else if (i > max)
				System.out.println("Error! Number must be " + max + " or less.");
			else
				isValid = true;
		}
		return i;
	}

	public static double getDouble(Scanner sc, String prompt) {
		double d = 0;
		boolean isValid = false;
		while (isValid == false) {
			System.out.print(prompt);
			if (sc.hasNextDouble()) {
				d = sc.nextDouble();
				if (d > 0) {
					isValid = true;
				} else {
					System.out.println("Please only enter a positive number. Try again.");
				}
			} else {
				System.out.println("Error! Invalid decimal value. Try again.");
			}
			sc.nextLine(); // discard any other data entered on the line
		}
		return d;
	}

	public static String getDouble(Scanner sc, String prompt, double min, double max) {
		double d = 0;
		boolean isValid = false;
		while (isValid == false) {
			d = getDouble(sc, prompt);
			if (d < min)
				System.out.println("Error! Number must be " + min + " or greater.");
			else if (d > max)
				System.out.println("Error! Number must be " + max + " or less.");
			else
				isValid = true;
		}
		Double.toString(d);
		return String.format("%.2f", d);
	}

	public static boolean validateUsingRegEx(Scanner scnr, String prompt, String regEx) {

		System.out.println(prompt);

		boolean b = Pattern.matches(regEx, scnr.next());
		return b;

	}

	public static String getStringMatchingRegex(Scanner scnr, String prompt, String regex) {
		boolean isValid = false;
		String input;

		do {
			input = getString(scnr, prompt);
			if (input.matches(regex)) {
				isValid = true;
			} else {
				System.out.println("Input must match the right format: ");
				isValid = false;
			}
		} while (!isValid);

		return input;
	}

}