package Arrays_Demo;
// Java program to demonstrate

// Arrays.parallelSort() method

// Importing Arrays class from
// java.util package
import java.util.Arrays;

// Main class
public class Main12 {
	public static void main(String[] args) {

		// Get the Array
		int intArr[] = { 10, 20, 15, 22, 35 };

		// To sort the array using parallelSort
		Arrays.parallelSort(intArr);

		System.out.println("Integer Array: " + Arrays.toString(intArr));
	}
}
