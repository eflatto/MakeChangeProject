package app;

import java.util.Scanner;

public class MakeChange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// prompt the user for the price of the item
		System.out.print("What is the price of the item?: ");
		double itemPrice = sc.nextDouble();

		// prompt the user for the amount tendered
		System.out.print("Amount tendered?: ");
		double amtTendered = sc.nextDouble();

		// declaring variables
		double change, quarters, dimes, nickels, pennies;
		double one, five, ten, twenty;

		// calculate the change due
		change = (amtTendered - itemPrice);

		// check if the amount tendered is equal to the price of the item
		if (amtTendered == itemPrice) {
			System.out.println("Thank you no change is due. Have a nice day '\u263A'");
		}
		// check if the amount tendered is less than the price of the item
		else if (amtTendered < itemPrice) {
			System.out.printf("Sorry insufficient funds... you are short by $ %.2f ", 
					(itemPrice - amtTendered));
		}
		// check if the amount tendered is greater than the price of the item
		if (amtTendered > itemPrice) {
			//calling Printchange method with change as its argument
			printChange(change);

		}

	}

	// method to print the change
	//also includes all the calculations and takes a double at its parameter
	public static void printChange(double change) {
		double totalChange = (change);
		change = (change +  .0000000000000005)*1; //To fix some rounding errors I was getting

		double twenty = (int) (change / 20);// calculate number of twenties
		change = change % 20;// calculate the remaining change

		double ten = (int) (change / 10);// calculate number of tens
		change = change % 10;// calculate the remaining change

		double five = (int) (change / 5);// calculate number of fives
		change = change % 5;// calculate the remaining change

		double one = (int) (change / 1);// calculate number of ones
		change = change % 1;// calculate the remaining change

		double quarters = (int) (change / .25);// calculate number of quarters
		change = change % .25;// calculate the remaining change
		

		double dimes = (int) (change / .10);// calculate number of dimes
		change = change % .10;// calculate the remaining change

		double nickels = (int) (change / .05);// calculate number of nickles
		change = change % .05;// calculate the remaining change

		double pennies = (change / .01);// calculate number of pennies

		System.out.println("Your change is: ");
		System.out.printf("Total: %.2f \n", totalChange); // Letting user know Total change

		// Printing out total for each denomination unless they equal 0 then don't print
		//and if denomination is equal to 1 only print out the singular form 
		//else print out the plural form
		if (twenty != 0) {
			if (twenty == 1) {
				System.out.println("Twenty Dollar Bill: " + (int) twenty);
			} else {
				System.out.println("Twenty Dollar Bills: " + (int) twenty);
			}
		}
		if (ten != 0) {
			if (ten == 1) {
				System.out.println("Ten Dollar Bill: " + (int) ten);
			} else {
				System.out.println("Ten Dollar Bills: " + (int) ten);
			}
		}
		if (five != 0) {
			if (five == 1) {
				System.out.println("Five Dollar Bill: " + (int) five);
			} else {
				System.out.println("Five Dollar Bills: " + (int) five);
			}
		}
		if (one != 0) {
			if (one == 1) {
				System.out.println("One Dollar Bill: " + (int) one);
			} else {
				System.out.println("One Dollar Bills: " + (int) one);
			}
		}
		if (quarters != 0) {
			if (quarters == 1) {
				System.out.println("Quarter: " + (int) quarters);
			} else {
				System.out.println("Quarters: " + (int) quarters);
			}
		}
		if (dimes != 0) {
			if (dimes == 1) {
				System.out.println("Dime: " + (int) dimes);
			} else {
				System.out.println("Dimes: " + (int) dimes);
			}
		}
		if (nickels != 0) {
			if (nickels == 1) {
				System.out.println("Nickel: " + (int) nickels);
			} else {
				System.out.println("Nickels: " + (int) nickels);
			}
		}
		if (pennies >= 1) {
		    if(Math.round(pennies) == 1) {
		        System.out.println("Penny: " + (int) (Math.round(pennies)));
		    } else {
		        System.out.println("Pennies: " + (int) (Math.round(pennies)));
		    }
		}
	}

}
