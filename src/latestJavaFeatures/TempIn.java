package latestJavaFeatures;

// Java 7 program to illustrate
// abstract methods in interfaces
public interface TempIn {
	public abstract void method(int n);
}

class Temp1 implements TempIn {
	@Override
	public void method(int n) {
		if (n % 2 == 0)
			System.out.println("geeksforgeeks");
		else
			System.out.println("GEEKSFORGEEKS");
	}

	public static void main(String[] args) {
		TempIn in1 = new Temp1();
		TempIn in2 = new Temp1();
		in1.method(4);
		in2.method(3);
	}
}
