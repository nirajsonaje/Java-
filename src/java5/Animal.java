package java5;

class Animal {
	void eatSomething() {
		System.out.println("eating something");
	}
}

class Dog extends Animal {
	@Override
	void eatSomething() {
		System.out.println("eating foods");
	}// should be eatSomething
}

class TestAnnotation1 {
	public static void main(String args[]) {
		Animal a = new Dog();
		a.eatSomething();
	}
}