package StringBuilder_StringBuffer;
// Java program to demonstrate

// the conversion between the
// StringBuffer and StringBuilder
// class

public class GFG {

	// Driver code
	public static void main(String args[]) {
		StringBuffer sbr = new StringBuffer("Geeks");

		// Conversion from StringBuffer
		// object to the String object
		String str = sbr.toString();

		// Creating a new StringBuilder
		// using the constructor
		StringBuilder sbl = new StringBuilder(str);

		System.out.println(sbl);
	}
}
