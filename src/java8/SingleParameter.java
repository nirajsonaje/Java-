package java8;

interface Printable {
	void printMessage(String name);
}

public class SingleParameter {

	public static void main(String[] args) {

		Printable p1 = (name) -> {
			System.out.println("name is" + name);
		};
		p1.printMessage("Kedar");

	}

}