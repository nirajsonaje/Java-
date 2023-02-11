package Thread;

// class multithreading implements runnable
class MultithreadingTest implements Runnable {
	public void run() {
		try {
			// Displaying the running Thread
			System.out.println("Thread " + Thread.currentThread().getId() + " is running");
		} catch (Exception e) {
			// exception is caught if occurred
			System.out.println("Exception has occurred and is caught");
		}
	}
}

class MultithreadMain {
	public static void main(String[] args) {
		int n = 6; // Number of threads
		for (int i = 0; i < n; i++) {
			Thread obj = new Thread(new MultithreadingTest());
			obj.start();
		}
	}
}