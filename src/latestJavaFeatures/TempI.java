package latestJavaFeatures;

// Java 8 program to illustrate
// static, default and abstract methods in interfaces
public interface TempI {

	public abstract void div(int a, int b);

	public default void add(int a, int b) {
		System.out.print("Answer by Default method = ");
		System.out.println(a + b);
	}

	public static void mul(int a, int b) {
		System.out.print("Answer by Static method = ");
		System.out.println(a * b);
	}
}

class Temp implements TempI {

	@Override
	public void div(int a, int b) {
		System.out.print("Answer by Abstract method = ");
		System.out.println(a / b);
	}

	public static void main(String[] args) {
		TempI in = new Temp();
		in.div(8, 2);
		in.add(3, 1);
		TempI.mul(4, 1);
	}
}
