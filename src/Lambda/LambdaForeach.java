package Lambda;

import java.util.ArrayList;
import java.util.List;

//Problem 5

public class LambdaForeach {

	public static void main(String[] args) {

		List<String> data = new ArrayList<String>();

		data.add("Kedar");
		data.add("Wox");
		data.add("Fox");
		data.add("Trzx");

		data.forEach(string -> System.out.println(string));

	}

}