/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
import java.util.Random;

public class GenThree {
	public static void main(String[] args) {
		// The range
		int firstNumber = Integer.parseInt(args[0]);
		int secondNumber = Integer.parseInt(args[1]);
		// We want the lower to be the first so if it's not the case we change between them
		if ( firstNumber > secondNumber) {
			int temp = firstNumber;
			firstNumber = secondNumber;
			secondNumber = temp;
		}

		// Generate three random integers
		int randomNumber1 = new Random().nextInt(secondNumber - firstNumber) + firstNumber;
		int randomNumber2 = new Random().nextInt(secondNumber - firstNumber) + firstNumber;
		int randomNumber3 = new Random().nextInt(secondNumber - firstNumber) + firstNumber;

		// Print the generated numbers
		System.out.println(randomNumber1);
		System.out.println(randomNumber2);
		System.out.println(randomNumber3);

		// Find and print the minimal number
		int minimalNumber = Math.min(Math.min(randomNumber1, randomNumber2), randomNumber3);
		System.out.println("The minimal generated number was " + minimalNumber);
	}
}

