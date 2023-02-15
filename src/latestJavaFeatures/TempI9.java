package latestJavaFeatures;

// Java 9 program to illustrate
// private methods in interfaces
public interface TempI9 {
//abstract method 
	public abstract void mul(int a, int b);

	public default void add(int a, int b) {
// private method inside default method
		sub(a, b);

// static method inside other non-static method
		div(a, b);
		System.out.print("Answer by Default method = ");
		System.out.println(a + b);
	}

	public static void mod(int a, int b) {
		div(a, b); // static method inside other static method
		System.out.print("Answer by Static method = ");
		System.out.println(a % b);
	}

	private void sub(int a, int b) {
		System.out.print("Answer by Private method = ");
		System.out.println(a - b);
	}

	private static void div(int a, int b) {
		System.out.print("Answer by Private static method = ");
		System.out.println(a / b);
	}
}

class Temp9 implements TempI9 {

	@Override
	public void mul(int a, int b) {
		System.out.print("Answer by Abstract method = ");
		System.out.println(a * b);
	}

	public static void main(String[] args) {
		TempI9 in = new Temp9();
		in.mul(2, 3);
		in.add(6, 2);
		TempI9.mod(5, 3);
	}
}


