package Object_Class;
// Java program to demonstrate working of getClass()

public class Test {
	public static void main(String[] args) {
		Object obj = new String("GeeksForGeeks");
		Class c = obj.getClass();
		System.out.println("Class of Object obj is : " + c.getName());

	}
}
//Java program to demonstrate working of finalize()
