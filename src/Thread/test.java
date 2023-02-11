package Thread;

public class test extends Thread {

	@Override

	public void run() {

		for (int i = 0; i < 11; i++) {
			System.out.print(i);
		}
	}

	public static void main(String[] args) {
		test t1 = new test();

		t1.start();
		for (int i = 0; i < 11; i++) {
			System.out.print(i);
		}

	}

}
