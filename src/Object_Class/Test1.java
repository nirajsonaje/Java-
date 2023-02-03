package Object_Class;
public class Test1 {
	public static void main(String[] args)
	{
		Test1 t = new Test1();
		System.out.println(t.hashCode());

		t = null;

		// calling garbage collector
		System.gc();

		System.out.println("end");
	}

	@Override protected void finalize()
	{
		System.out.println("finalize method called");
	}
}
