package Arrays_Demo;
// Java program to demonstrate

// Arrays.compareUnsigned() method

import java.util.Arrays;

public class Main2 {
	public static void main(String[] args) {

		// Get the Arrays
		int intArr[] = { 10, 20, 15, 22, 35 };

		// Get the second Arrays
		int intArr1[] = { 10, 15, 22 };

		// To compare both arrays
		System.out.println("Integer Arrays on comparison: " + Arrays.compareUnsigned(intArr, intArr1));
	}
}
