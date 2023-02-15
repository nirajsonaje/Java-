package Arrays_Demo;
// Java program to demonstrate

// Arrays.sort() method

import java.util.Arrays;

public class Sort_Demo {
	public static void main(String[] args) {

		// Get the Array
		int intArr[] = { 10, 20, 15, 22, 35 };

		// To sort the array using normal sort-
		Arrays.sort(intArr);

		System.out.println("Integer Array: " + Arrays.toString(intArr));
	}
}
