package com.labEleven;

import java.util.Scanner;

public class CarApp {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);

		System.out.println("Welcome to Lemons-into-Lemonade Auto Rentals' admin console!");

		// I set up a loop which will prompt the user to continue

		String cont = "yes";
		while (cont.equalsIgnoreCase("yes")) {

			//I ask the user how many cars they are using, and validate accordingly (making sure the number is a positive integer)
			
			int numCars = Validator.getNumOfCars(scnr, "\nHow many cars are you entering?: ");

			//I declare an array to store the inventory
			
			Car[] inventory = new Car[numCars];

			//I begin a loop to store the cars within the inventory
			
			for (int i = 0; i < inventory.length; i++) {
				
				String make = Validator.getString(scnr, "\nPlease enter car # " + (i + 1) + "'s make: ");

				String model = Validator.getString(scnr, "Please enter car # " + (i + 1) + "'s model: ");

				//I validate to make sure the user only enters a model year between 1908-2019
				
				int year = Validator.getInt(scnr, "Please enter car # " + (i + 1) + "'s year: ");

				//I validate to make sure the number passed into the array is a double with 2 decimal places
				
				double price = Validator.getDouble(scnr, "Please enter car # " + (i + 1) + "'s price: ");

				//I store each car within the inventory
				
				inventory[i] = new Car(make, model, year, price);

			}

			//I print out a table listing the inventory entered
			
			System.out.println("\nCurrent inventory:");
			System.out.printf("%-10s %-10s %-10s %-10s\n", "Make", "Model", "Year", "Price");

			for (int i = 0; i < inventory.length; i++) {
				System.out.println(inventory[i]);
			}

			// I ask if the user if they would like to continue, if "yes", while loop will
			// begin again.

			cont = Validator.getString(scnr, "\nWould you like to continue? (yes/no)");
			while (!cont.equalsIgnoreCase("yes") && !cont.equalsIgnoreCase("no")) {
				System.out.println("\nPlease only enter yes/no: ");
				cont = Validator.getString(scnr, "\nWould you like to continue? (yes/no)");
			}

		}

		// Otherwise, I bid farewell to the user. I close the scanner to avoid resource
		// leak.

		System.out.println("\nGoodbye!");
		scnr.close();

	}

}
