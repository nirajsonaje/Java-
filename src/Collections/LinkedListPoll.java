package Collections;

// Java code to demonstrate the working
// of poll() in linked list
import java.util.*;

public class LinkedListPoll {

	public static void main(String[] args) {

		// Declaring a LinkedList
		LinkedList list = new LinkedList();

		// adding elements
		list.add("Geeks");
		list.add(4);
		list.add("Geeks");
		list.add(8);

		// printing the list
		System.out.println("The initial Linked List is : " + list);

		// using poll() to retrieve and remove the head
		// removes and displays "Geeks"
		System.out.println("Head element of the list is : " + list.poll());

		// printing the resultant list
		System.out.println("Linked List after removal using poll() : " + list);
	}
}
