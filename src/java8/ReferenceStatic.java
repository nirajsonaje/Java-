package java8;

interface Callable {

	void call();

}

public class ReferenceStatic {

	public static void getDone() {
		System.out.println("Static method Reference");
	}

	public static void main(String[] args) {

		Callable c = ReferenceStatic::getDone;
		c.call();

	}

}