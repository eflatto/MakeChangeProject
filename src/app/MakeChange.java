package app;

import java.util.Scanner;

public class MakeChange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("What is the price of the item?: ");
		double itemPrice = sc.nextDouble();

		System.out.print("Amount tendered?: ");
		double amtTendered = sc.nextDouble();

		double change, quarters, dimes, nickels, pennies;
		double one, five, ten, twenty;

		change = (amtTendered - itemPrice);

		if (amtTendered == itemPrice) {
			System.out.println("Thank you no change is due. Have a nice day '\u263A'");
		} else if (amtTendered < itemPrice) {
			System.out.printf("Sorry insufficient funds... you are short by $ %.2f ",
					(itemPrice - amtTendered));
		}
		if (amtTendered > itemPrice) {
			printChange(change);

		}

	}

	public static void printChange(double change) {
		double totalChange = (change);
		double twenty = (int) (change / 20);
		change = change % 20;
		double ten = (int) (change / 10);
		change = change % 10;
		double five = (int) (change / 5);
		change = change % 5;
		double one = (int) (change / 1);
		change = change % 1;
		double quarters = (int) (change / .25);
		change = change % .25;
		double dimes = (int) (change / .10);
		change = change % .10;
		double nickels = (int) (change / .05);
		change = change % .05;
		double pennies = (change / .01);
		
		System.out.println("Your change is: ");
        System.out.printf("Total: %.2f \n", totalChange);

		if (twenty != 0) {
			System.out.println("Twenty Dollar Bills: " + (int) twenty);
		}
		if (ten != 0) {
			System.out.println("Ten Dollar Bills: " + (int) ten);
		}
		if (five != 0) {
			System.out.println("Five Dollar Bills: " + (int) five);
		}
		if (one != 0) {
			System.out.println("One Dollar Bills: " + (int) one);
		}
		if (quarters != 0) {
			System.out.println("Quarters: " + (int) quarters);
		}
		if (dimes != 0) {
			System.out.println("Dimes: " + (int) dimes);
		}
		if (nickels != 0) {
			System.out.println("Nickels: " + (int) nickels);
		}
		if (pennies != 0 && pennies > .99999) {
			System.out.println("Pennies: " + (int) (Math.round(pennies)));
		}
	}

}
