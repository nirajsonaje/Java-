package Basics;

import java.util.Arrays;

class GFG1 {

	// Main driver method
	public static void main(String[] args) {
		Student[] arr = { new Student(111, "bbbb", "london"), new Student(131, "aaaa", "nyc"),
				new Student(121, "cccc", "jaipur") };

		System.out.println("Unsorted");

		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);

		// Sorting on basic as per class 1 created
		// (user-defined)
		Arrays.sort(arr, new Sortbyroll());

		System.out.println("\nSorted by rollno");

		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);

		// Sorting student entries by name
		Arrays.sort(arr, new Sortbyname());

		// Display message on console for better readability
		System.out.println("\nSorted by name");

		// // Again iterating over entries to print them
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);

	}
}
