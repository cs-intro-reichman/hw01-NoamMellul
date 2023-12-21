/*
 * Solves linear equations of the form a⋅x + b = c.
 * The program gets a, b, and c as command-line arguments,
 * computes x, and prints the result.
 * Treats the three arguments as well as the computed value as double values
 */
public class LinearEq {

    public static void main(String[] args) {
        double a = Double.parseDouble(args[0]); // we get a
        double b = Double.parseDouble(args[1]); // we get b
        double c = Double.parseDouble(args[2]); // we get c
        double res = (c - b)/a ; // we get x with a equation of first degree

        System.out.println( a +" * x" + " + " + b + " = "+ c);
        System.out.println("x =" + " " + res);
    }

}
