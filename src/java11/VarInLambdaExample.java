package java11;
// Java program to show the Variable

import java.util.stream.IntStream;

// used in the lambda expression

public class VarInLambdaExample {
	public static void main(String[] args) {
		IntStream.of(1, 2, 3, 5, 6, 7).filter((var i) -> i % 2 == 0).forEach(System.out::println);
	}
}

//JDK 11 allows ‘var’ to be used in lambda expressions. This was introduced to be consistent with the local ‘var’ syntax of Java 10.
