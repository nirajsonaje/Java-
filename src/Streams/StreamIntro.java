import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamIntro {

	public static void main(String[] args) {

		// From a collection
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		Stream<Integer> stream = list.stream();
		stream.forEach(n -> {
			System.out.println(n);
		});

		// From an array
		Integer[] array = { 1, 2, 3, 4, 5 };
		Stream<Integer> stream1 = Arrays.stream(array);
		stream1.forEach(n1 -> {
			System.out.println(n1);
		});
		
		//From a generator function
		Stream<Double> randomNumbers = Stream.generate(Math::random);
		randomNumbers.limit(5).forEach(n1 -> {
			System.out.println(n1);
		});
		
		
		// From values
		Stream<Integer> stream2 = Stream.of(1, 2, 3, 4, 5);
		stream2.forEach(n1 -> {
			System.out.println(n1);
		});
	}

}
