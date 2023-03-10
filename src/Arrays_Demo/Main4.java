package Arrays_Demo;
// Java program to demonstrate

// Arrays.copyOfRange() method

import java.util.Arrays;

public class Main4 {
	public static void main(String[] args) {

		// Get the Array
		int intArr[] = { 10, 20, 15, 22, 35 };

		// To print the elements in one line
		System.out.println("Integer Array: " + Arrays.toString(intArr));

		System.out.println("\nNew Arrays by copyOfRange:\n");

		// To copy the array into an array of new length
		System.out.println("Integer Array: " + Arrays.toString(Arrays.copyOfRange(intArr, 1, 3)));
	}
}
