package JustCode;

import java.io.*;

// Java code to demonstrate star pattern
public class Pyramid_full {
	public static void main(String args[]) {
		int rows = 5;
		for (int i = 1; i < rows; i++) {

			// inner loop to handle number spaces
			// values changing acc. to requirement
			for (int j = rows - i; j > 1; j--) {
				// printing spaces
				System.out.print(" ");
			}

			// inner loop to handle number of columns
			// values changing acc. to outer loop
			for (int j = 1; j <= i; j++) {
				// printing stars
				System.out.print("* ");
			}

			// ending line after each row
			System.out.println();
		}

	}
}