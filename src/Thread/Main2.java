package Thread;

public class Main2 extends Thread {
	public static void main(String[] args) {
		Main2 thread = new Main2();
		thread.start();
		System.out.println("This code is outside of the thread");
	}

	public void run() {
		System.out.println("This code is running in a thread");
	}
}