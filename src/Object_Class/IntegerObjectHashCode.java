package Object_Class;

public class IntegerObjectHashCode {

	public static void main(String[] args) {
		// Create integer object
		Integer val = new Integer("189");

		// Compute the hashCode of this integer object
		int hashValue = val.hashCode();

		System.out.println("HashCode of val: " + hashValue);
	}
}