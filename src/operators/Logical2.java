package operators;

// Java code to illustrate
// logical NOT operator
import java.io.*;

class Logical2 {
	public static void main(String[] args) {
		// initializing variables
		int a = 10, b = 1;

		// Displaying a, b, c
		System.out.println("Var1 = " + a);
		System.out.println("Var2 = " + b);

		// Using logical NOT operator
		System.out.println("!(a < b) = " + !(a < b));
		System.out.println("!(a > b) = " + !(a > b));
	}
}
