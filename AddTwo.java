/*
 * Adds two given integers and prints the result in a fancy way.
 */
public class AddTwo {

	public static void main(String[] args) {

		int firstNumber = Integer.parseInt(args[0]); // first number
		int secondNumber = Integer.parseInt(args[1]); // second number
		int thirdNumber = firstNumber + secondNumber; // the sum of them
		System.out.println(firstNumber + " + " + secondNumber + " = " + thirdNumber);
	}
}




