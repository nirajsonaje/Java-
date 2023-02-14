package java8;

//Problem 6

public class Threadlambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Runnable r1=new Runnable(){ public void run(){
		 * System.out.println("Thread1 is running..."); } };
		 * 
		 */

		Runnable r2 = () -> {
			System.out.println("Thread2 is running...");
		};
		Thread t2 = new Thread(r2);
		t2.start();

	}

}