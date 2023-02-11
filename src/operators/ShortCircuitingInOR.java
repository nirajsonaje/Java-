package operators;

import java.io.*;

class ShortCircuitingInOR {
	public static void main(String[] args) {

		// initializing variables
		int a = 10, b = 20, c = 15;

		// displaying b
		System.out.println("Value of b: " + b);

		// Using logical OR
		// Short-circuiting effect as the first condition is true
		// so the second condition is never reached
		// and so ++b (pre-increment) doesn't take place and
		// value of b remains unchanged
		if ((a < c) || (++b < c))
			System.out.println("Inside if");

		// displaying b
		System.out.println("Value of b: " + b);

	}
}
