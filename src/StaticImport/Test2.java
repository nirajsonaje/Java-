package StaticImport;

// Java Program to illustrate
// calling of predefined methods
// with static import
import static java.lang.Math.*;

class Test2 {
	public static void main(String[] args) {
		System.out.println(sqrt(4));
		System.out.println(pow(2, 2));
		System.out.println(abs(6.3));
	}
}