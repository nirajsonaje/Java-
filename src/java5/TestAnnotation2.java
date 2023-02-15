package java5;

//@SuppressWarnings annotation: is used to suppress warnings issued by the compiler.
//If you remove the @SuppressWarnings("unchecked") annotation, 
//it will show warning at compile time because we are using non-generic collection.
import java.util.*;

class TestAnnotation2 {
	@SuppressWarnings("unchecked")
	public static void main(String args[]) {
		ArrayList list = new ArrayList();
		list.add("sonoo");
		list.add("vimal");
		list.add("ratan");

		for (Object obj : list)
			System.out.println(obj);

	}
}