package Constructor;
// Java Program to illustrate constructor overloading
// using same task (addition operation ) for different
// types of arguments.

import java.io.*;

class Geek1 {
	// constructor with one argument
	Geek1(String name)
	{
		System.out.println("Constructor with one "
						+ "argument - String : " + name);
	}

	// constructor with two arguments
	Geek1(String name, int age)
	{

		System.out.println(
			"Constructor with two arguments : "
			+ " String and Integer : " + name + " " + age);
	}

	// Constructor with one argument but with different
	// type than previous..
	Geek1(long id)
	{
		System.out.println(
			"Constructor with one argument : "
			+ "Long : " + id);
	}
}

class GFG2 {
	public static void main(String[] args)
	{
		// Creating the objects of the class named 'Geek'
		// by passing different arguments

		// Invoke the constructor with one argument of
		// type 'String'.
		Geek1 geek2 = new Geek1("Shikhar");

		// Invoke the constructor with two arguments
		Geek1 geek3 = new Geek1("Dharmesh", 26);

		// Invoke the constructor with one argument of
		// type 'Long'.
		Geek1 geek4 = new Geek1(325614567);
	}
}
