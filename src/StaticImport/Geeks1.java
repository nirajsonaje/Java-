package StaticImport;

// Java program to illustrate
// ambiguity in case of
// static import
import static java.lang.Integer.*;
import static java.lang.Byte.*;

public class Geeks1 {
	public static void main(String[] args) {
		// system.out.println(MAX_VALUE);
	}
}

/*
 * Ambiguity in static import: If two static members of the same name are
 * imported from multiple different classes, the compiler will throw an error,
 * as it will not be able to determine which member to use in the absence of
 * class name qualification.
 */