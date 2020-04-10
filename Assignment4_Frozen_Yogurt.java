import java.util.Scanner;

public class Assignment4_Frozen_Yogurt {
	
	//This is an order machine for Nicole Lyu's frozen yogurt shop.
	//Created on Feb 23 2020
	
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		//Create constant for customer selection and rates
		final String REGULAR = "R";
		final double premium_extra = 1.0;

		final String SMALL = "S";
		final String MED = "M";
		final String LARGE = "L";
		final String XL = "X";

		final double small_base = 2.25;
		final double med_base = 3.75;
		final double large_base = 5.5;
		final double xl_base = 7.5;

		final double flavor_rate = 0.75;

		final double topping_rate = 0.25;

		final String CUP = "U";
		final String CONE = "O";
		final String SUGAR = "S";

		final double cup_rate = 0.3;
		final double sugar_cone_rate = 0.7;
		final double waffle_cone_rate = 1.2;

		final double discount = 0.75;
		final String Monday= "M";
		final String Tuesday="TU";
		final String Wednesday="W";
		final String Thursday="TH";
		final String Friday="F";

		//initiate the cost as a decimal.
		
		double cost = 0;

		System.out.println("Hello. Welcome to my frozen yogurt shop!");

		//choose regular or premium
		System.out.println("Would you like to order a premium or regular frozen yogurt? (P for premium, R for regular)");
		String category = keyboard.nextLine().toUpperCase();

		if (!(category.equals(REGULAR)))
			cost += premium_extra;

		//choose size
		System.out.println("What size would you like? (enter S for small, M for medium, L for large, X for extra large)");
		String size = keyboard.nextLine().toUpperCase();

		switch (size) {
		case SMALL:
			cost += small_base;
			break;
		case MED:
			cost += med_base;
			break;
		case LARGE:
			cost += large_base;
			break;
		case XL:
			cost += xl_base;
			break;
		}

		//select the number of flavors
		System.out.println("How many flavors would you like? (Enter a number between 1 and 3)");
		int flavor = keyboard.nextInt();

		cost += flavor * flavor_rate;

		//select the number of toppings
		System.out.println("How many toppings would you like? (enter a number between 0 and 6)");
		int topping = keyboard.nextInt();

		if (!(topping == 1))
			cost += topping * topping_rate;

		keyboard.nextLine();//need another line for anything non-line to line for strings

		//choose what holds the frozen yogurt
		System.out.println("Should this be in a cup of a cone? (U for cup, O for cone)");
		String holder = keyboard.nextLine().toUpperCase();

		if (holder.equals(CUP))
			cost += cup_rate;

		if (holder.equals(CONE)) {
			System.out.println("What type of cone? (S for sugar cone, W for waffle cone)");
			String cone_type = keyboard.nextLine().toUpperCase();
			if (cone_type.equals(SUGAR))
				cost += sugar_cone_rate;
			else
				cost += waffle_cone_rate;
		}

		//give 25% discount if it is a weekday
		System.out.println("What day of the week is this? (Su for Sunday, M for Monday, Tu for Tuesday, W for Wednesday, Th for Thursday, F for Friday, Sa for Saturday)");
		String day = keyboard.nextLine().toUpperCase();

		switch (day) {
		case Monday:
		case Tuesday:
		case Wednesday:
		case Thursday:
		case Friday:
			cost *= discount;
			break;
		}

		//display final cost
		System.out.printf("Thank you for your order.Your frozen yogurt will cost $%.2f", cost);

		keyboard.close();

	}

}
