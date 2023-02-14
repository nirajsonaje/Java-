package java8;

import java.util.function.Consumer;

public class ConsumerExample {

	static void print(String message) {
		System.out.println(message);
	}

	void print(Integer val) {
		System.out.println(val);
	}

	public static void main(String[] args) {

		Consumer<String> consumer1 = ConsumerExample::print;
		consumer1.accept("Kedar");// accept method

		Consumer<Integer> consumer2 = new ConsumerExample()::print;
		consumer2.accept(11);

	}

}