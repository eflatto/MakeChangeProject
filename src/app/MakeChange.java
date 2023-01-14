package app;

import java.util.Scanner;

public class MakeChange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("What is the price of the item?: ");
		double itemPrice = sc.nextDouble();

		System.out.print("Amount tendered?: ");
		double amtTendered = sc.nextDouble();

		double change, quarters, dimes, nickels,pennies;
		double one, five, ten, twenty;

		change = (amtTendered - itemPrice);
		double totalChange = (amtTendered - itemPrice);

		if (amtTendered == itemPrice) {
			System.out.println("Thank you no change is due. Have a nice day :)");
		} else if (amtTendered < itemPrice) {
			System.out.printf("Sorry insufficient funds... you are short by $ %.2f " ,
					(itemPrice - amtTendered));
		}
		if (amtTendered > itemPrice) {
			twenty = (int) (change / 20);
			change = change % 20;

			ten = (int) (change / 10);
			change = change % 10;

			five = (int) (change / 5);
			change = change % 5;

			one = (int) (change / 1);
			change = change % 1;

			quarters = (int) (change / .25);
			change = change % .25;

			dimes = (int) (change / .10);
			change = change % .10;

			nickels = (int) (change / .05);
			change = change % .05;

			pennies = (change / .01);

			System.out.println("Your change is: ");
			System.out.printf("Total: %.2f \n",totalChange);
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
				System.out.println("Pennies: " + (int)(Math.round(pennies)));
			}

		}

	}

}
