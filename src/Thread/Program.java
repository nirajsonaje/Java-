package Thread;

public class Program extends Thread {
	public static void main(String[] args) {

		// both loops run on a single thread
		for (byte i = 1; i <= 5; i++) {

			// sleep .5 seconds for demonstration purposes
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(e);
			}

			System.out.println("Loop 1, Iteration: " + i);
		}

		// this loop will wait for the one above
		// to finish before it will start
		for (byte i = 1; i <= 5; i++) {

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println("Loop 2, Iteration: " + i);
		}
	}
}