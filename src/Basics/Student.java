package Basics;
// Java program to demonstrate Working of
// Comparator interface

// Importing required classes
import java.io.*;
import java.lang.*;
import java.util.*;

// Class 1
// A class to represent a student.
class Student {
	int rollno;
	String name, address;

	// Constructor
	public Student(int rollno, String name, String address)
	{
		// This keyword refers to current object itself
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}

	// Used to print student details in main()
	public String toString()
	{
		return this.rollno + " " + this.name + " "+ this.address;
	}
}

// Class 2
// Helper class extending Comparator interface
class Sortbyroll implements Comparator<Student> {
	// Used for sorting in ascending order of
	// roll number
	public int compare(Student a, Student b)
	{
		return a.rollno - b.rollno;
	}}
	class Sortbyname implements Comparator<Student> {
		 
	    // Method
	    // Sorting in ascending order of name
	    public int compare(Student a, Student b)
	    {
	 
	        return a.name.compareTo(b.name);
	    }
	}
	 