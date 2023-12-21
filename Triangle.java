/*
 * Three sides can form a triangle if the sum of the lengths of any two sides is greater than the length of the remaining side. 
 * This is known as the Triangle Inequality Theorem. 
 * Write a program that tests if three given integers form a triangle.
 */
public class Triangle {
	public static void main(String[] args) {

		int a = Integer.parseInt(args[0]); // first side of the triangle
		int b = Integer.parseInt(args[1]); // second side of the triangle
		int c = Integer.parseInt(args[2]); // the remaining side

		if ( (a + b) > c) { // we check if the sum of the side a and b is greater than the side c
			System.out.println(a + ", " + b + ", " + c + " : true"); // when it's correct we get a triangle
		}
		else { // we check the other possibility, when the sum of a and b are lower than c
			System.out.println(a + ", " + b + ", " + c + " : false"); // we don't get a triangle
		}
	}
}

