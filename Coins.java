/*
 * Write a program that gets a quantity of cents as a command-line argument.
 * The program prints how to represent this quantity using as many quarters as possible, plus the remainder in cents.
 */
public class Coins {
	public static void main(String[] args) {

		int a = Integer.parseInt(args[0]);
		int numberOfCent = a % 25; // we use the technique of modulo in order to have the rest of the division
		int numberOfQuarter = a / 25; // we do a simple division to find how many quarter we have
		System.out.println("We have" + " " + numberOfQuarter + " " + "quarter and"+ " "+ numberOfCent + " " + "cent");

	}
}
