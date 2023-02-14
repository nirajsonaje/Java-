package java8;

interface addable {
	int addTheDigits(int a, int b);
}

public class MultipleParameter {

	public static void main(String[] args) {

		addable a1 = (a, b) -> (a + b);
		System.out.println(a1.addTheDigits(10, 20));

	}

}